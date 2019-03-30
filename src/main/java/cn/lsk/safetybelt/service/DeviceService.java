package cn.lsk.safetybelt.service;

import java.util.List;

import cn.lsk.safetybelt.po.DeviceCustom;
import cn.lsk.safetybelt.vo.Page;

/**
 * @Description:关于设备的业务
 *
 * @author 李某人_soul
 * @version 1.0
 */
public interface DeviceService {
	
	//分页查询设备列表
	public List<DeviceCustom> findDeviceList(Page page) throws Exception;
	//分页查询设备列表总记录数
	public int findDeviceListCount() throws Exception;
	
	//设备绑定用户
	public void bindUser(Integer userId,String deviceId) throws Exception;
	//设备解绑用户
	public void unbindUser(String deviceId)throws Exception;
	//删除设备
	public void deleteDevice(String devcieId) throws Exception;
	//添加设备
	public void addDevice(String deviceNumber) throws Exception;

}
