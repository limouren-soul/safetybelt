package cn.lsk.safetybelt.service;

import java.util.List;

import cn.lsk.safetybelt.po.Manager;
import cn.lsk.safetybelt.vo.Page;

/**
 * @Description:关于管理员的业务
 *
 * @author 李某人_soul
 * @version 1.0
 */
public interface ManagerService  {

	
	//管理员登录
	public Manager managerLogin(String managerName,String password) throws Exception;
	
	//分页查询管理员列表
	public List<Manager> findManagerList(Page page) throws Exception;
	//查询管理员列表总数
	public int findManagerListCount() throws Exception;


}
