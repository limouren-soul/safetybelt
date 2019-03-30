package cn.lsk.safetybelt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lsk.safetybelt.exception.CustomException;
import cn.lsk.safetybelt.mapper.ManagerMapper;
import cn.lsk.safetybelt.mapper.ManagerMapperCustom;
import cn.lsk.safetybelt.po.Manager;
import cn.lsk.safetybelt.po.ManagerExample;
import cn.lsk.safetybelt.service.ManagerService;
import cn.lsk.safetybelt.vo.Page;

/**
 * @Description:
 *
 * @author 李某人_soul
 * @version 1.0
 */
public class ManagerServiceImpl implements ManagerService{
	
	//依赖注入
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private ManagerMapperCustom managerMapperCustom;

	@Override
	public Manager managerLogin(String managerName, String password) throws Exception {
		
		if(managerName==null && password==null) {
			throw new CustomException("");
		}
		ManagerExample managerExample=new ManagerExample();
		ManagerExample.Criteria criteria=managerExample.createCriteria();
		criteria.andNameEqualTo(managerName).andPasswordEqualTo(password);
		List<Manager> list = managerMapper.selectByExample(managerExample);
		if(!list.isEmpty()) {
			return list.get(0);
		}else {
			throw new CustomException("用户名或密码错误！！！");
		}
	}

	@Override
	public List<Manager> findManagerList(Page page) throws Exception {
		
		List<Manager> managerList = managerMapperCustom.findManagerList(page);
		return managerList;
		
	}

	@Override
	public int findManagerListCount() throws Exception {
		// TODO 自动生成的方法存根
		int managerCount = managerMapperCustom.findManagerCount();
		return managerCount;
	}
	

}
