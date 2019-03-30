package cn.lsk.safetybelt.mapper;

import java.util.List;

import cn.lsk.safetybelt.vo.Page;
import cn.lsk.safetybelt.po.UsersCustom;
import cn.lsk.safetybelt.vo.UsersQueryVo;

public interface UserMapperCustom{
	//查询商品列表
	public List<UsersCustom> findUserList(UsersQueryVo usersQueryVo) throws Exception;
	
	//分页查询商品列表
	public List<UsersCustom> findUserPageList(Page page) throws Exception;
	//分页查询总记录数
	public Integer findUserPageCount(Page page) throws Exception;
}