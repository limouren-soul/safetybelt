package cn.lsk.safetybelt.vo;

import cn.lsk.safetybelt.po.User;
import cn.lsk.safetybelt.po.UsersCustom;

/**
 * @Description:包装类型
 *
 * @author 李某人_soul
 * @version 1.0
 */
public class UsersQueryVo{
	//包装所需要的查询条件
	private User user;
	private UsersCustom usersCustom;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UsersCustom getUsersCustom() {
		return usersCustom;
	}
	public void setUsersCustom(UsersCustom usersCustom) {
		this.usersCustom = usersCustom;
	}
	

}
