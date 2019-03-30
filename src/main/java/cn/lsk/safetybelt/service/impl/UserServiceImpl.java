package cn.lsk.safetybelt.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.lsk.safetybelt.exception.CustomException;
import cn.lsk.safetybelt.mapper.DeviceMapper;
import cn.lsk.safetybelt.mapper.UserMapper;
import cn.lsk.safetybelt.mapper.UserMapperCustom;
import cn.lsk.safetybelt.po.Device;
import cn.lsk.safetybelt.po.DeviceExample;
import cn.lsk.safetybelt.po.User;
import cn.lsk.safetybelt.service.UserService;
import cn.lsk.safetybelt.vo.Page;
import cn.lsk.safetybelt.po.UsersCustom;
import cn.lsk.safetybelt.vo.UsersQueryVo;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapperCustom userMapperCustom;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public List<UsersCustom> findUserList(UsersQueryVo usersQueryVo) throws Exception {
		// TODO 自动生成的方法存根
		
		return userMapperCustom.findUserList(usersQueryVo);
	}

	@Override
	public UsersCustom findUserById(Integer id) throws Exception {
		UsersCustom usersCustom=null;
		User user = userMapper.selectByPrimaryKey(id);
		if(user!=null) {
			usersCustom=new UsersCustom();
			BeanUtils.copyProperties(user, usersCustom);
		}
		return usersCustom;
	}

	@Override
	public List<UsersCustom> findUserPageList(Page page) throws Exception {
		return userMapperCustom.findUserPageList(page);
	}

	@Override
	public Integer findUserPageCount(Page page) throws Exception {
		return userMapperCustom.findUserPageCount(page);
	}

	@Override
	public void updateUser(User user) throws Exception{
		int key = userMapper.updateByPrimaryKey(user);
		if(key <= 0) {
			throw new CustomException("更新失败");
		}
	}

	@Override
	public void deleteUser(Integer id) throws Exception {
		// TODO 自动生成的方法存根
		DeviceExample deviceExample=new DeviceExample();
		DeviceExample.Criteria criteria=deviceExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		if(!list.isEmpty()) {
			throw new CustomException("用户不能被删除，已经绑定了设备");
		}else {
			userMapper.deleteByPrimaryKey(id);
		}
		
		
		
	}

}
