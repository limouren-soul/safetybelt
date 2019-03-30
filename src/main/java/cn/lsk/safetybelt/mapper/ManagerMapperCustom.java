package cn.lsk.safetybelt.mapper;

import java.util.List;

import cn.lsk.safetybelt.po.Manager;
import cn.lsk.safetybelt.vo.Page;

public interface ManagerMapperCustom {
	
	//分页查询管理员列表
	public List<Manager> findManagerList(Page page) throws Exception;
	//分页查询管理员列表总数
	public int findManagerCount() throws Exception;
	
	
}