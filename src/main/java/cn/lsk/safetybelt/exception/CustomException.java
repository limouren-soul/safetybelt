package cn.lsk.safetybelt.exception;


/**
 * @Description:自定义异常类
 *
 * @author 李某人_soul
 * @version 1.0
 */
public class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//异常信息
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomException(String message) {
		super(message);
		this.message = message;
	}
	

}
