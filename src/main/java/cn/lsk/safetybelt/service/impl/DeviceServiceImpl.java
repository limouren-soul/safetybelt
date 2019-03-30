package cn.lsk.safetybelt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lsk.safetybelt.exception.CustomException;
import cn.lsk.safetybelt.mapper.DeviceMapper;
import cn.lsk.safetybelt.mapper.DeviceMapperCustom;
import cn.lsk.safetybelt.mapper.UserMapper;
import cn.lsk.safetybelt.po.Device;
import cn.lsk.safetybelt.po.DeviceCustom;
import cn.lsk.safetybelt.po.DeviceExample;
import cn.lsk.safetybelt.po.User;
import cn.lsk.safetybelt.service.DeviceService;
import cn.lsk.safetybelt.vo.Page;

public class DeviceServiceImpl implements DeviceService{
	
	//依赖注入
	@Autowired
	private DeviceMapperCustom deviceMapperCustom;
	@Autowired
	private DeviceMapper deviceMapper;
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<DeviceCustom> findDeviceList(Page page) throws Exception {
		
		List<DeviceCustom> deviceList = deviceMapperCustom.findDeviceList(page);
		for(DeviceCustom device:deviceList) {
			Integer userId = device.getUserId();
			User user = userMapper.selectByPrimaryKey(userId);
			device.setUser(user);
		}
		return deviceList;
	}

	@Override
	public int findDeviceListCount() throws Exception {
		int listCount = deviceMapperCustom.findDeviceListCount();
		return listCount;
	}

	@Override
	public void bindUser(Integer userId,String deviceId) throws Exception {
		//判断是否存在该用户
		User user = userMapper.selectByPrimaryKey(userId);
		if(user==null) {
			throw new CustomException("无此用户");
		}
		//检验用户是否已经绑定设备
		DeviceExample deviceExample =new DeviceExample();
		DeviceExample.Criteria criteria=deviceExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		//用户绑定设备
		if(list.isEmpty()) {
			Device device = deviceMapper.selectByPrimaryKey(deviceId);
			device.setUserId(userId);
			deviceMapper.updateByPrimaryKey(device);
		}else {
			throw new CustomException("该用户已经绑定设备");
		}
		
	}

	@Override
	public void unbindUser(String deviceId) throws Exception {
		//解绑用户
		DeviceExample deviceExample=new DeviceExample();
		DeviceExample.Criteria criteria=deviceExample.createCriteria();
		criteria.andIdEqualTo(deviceId);
		Device device=deviceMapper.selectByExample(deviceExample).get(0);
		device.setUserId(null);
		deviceMapper.updateByPrimaryKey(device);
	}

	@Override
	public void deleteDevice(String devcieId) throws Exception {
		// 删除设备
		DeviceExample deviceExample=new DeviceExample();
		DeviceExample.Criteria criteria=deviceExample.createCriteria();
		criteria.andIdEqualTo(devcieId);
		deviceMapper.deleteByExample(deviceExample);
	}

	@Override
	public void addDevice(String deviceId) throws Exception {
		//添加设备
		Device device=new Device();
		device.setId(deviceId);
		deviceMapper.insertSelective(device);
	}


}
