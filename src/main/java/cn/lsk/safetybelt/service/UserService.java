package cn.lsk.safetybelt.service;

import java.util.List;

import cn.lsk.safetybelt.po.User;
import cn.lsk.safetybelt.vo.Page;
import cn.lsk.safetybelt.po.UsersCustom;
import cn.lsk.safetybelt.vo.UsersQueryVo;

/**
 * @Description:关于用户的增删改查
 *
 * @author 李某人_soul
 * @version 1.0
 */
public interface UserService  {
	
	//查询用户列表
	public List<UsersCustom> findUserList(UsersQueryVo usersQueryVo) throws Exception;
	
	//通过id查询用户
	public User findUserById(Integer id) throws Exception;
	
	//分页查询商品列表
	public List<UsersCustom> findUserPageList(Page page) throws Exception;
	//分页查询总记录数
	public Integer findUserPageCount(Page page) throws Exception;
	
	//修改用户信息、
	public void updateUser(User user)throws Exception;
	//删除用户信息
	public void deleteUser(Integer id) throws Exception;

}
