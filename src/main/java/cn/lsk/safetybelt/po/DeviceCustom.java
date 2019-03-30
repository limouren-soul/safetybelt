package cn.lsk.safetybelt.po;

/**
 * @Description:设备扩展类
 *
 * @author 李某人_soul
 * @version 1.0
 */
public class DeviceCustom extends Device {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}