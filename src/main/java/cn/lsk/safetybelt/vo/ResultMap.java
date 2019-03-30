package cn.lsk.safetybelt.vo;

/**
 * @Description:layui数据表格返回数据处理类
 *
 * @author 李某人_soul
 * @version 1.0
 */
public class ResultMap<T> {
	//layui要求的参数code（要为0，不然无法显示数据）
	private int code;
	//msg，返回的消息
	private String msg;

	//查询到的数据总数
	private int count;
	//表格显示的数据数据
	private T data;

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public ResultMap(int code,String msg,int count,T data) {
		this.code=code;
		this.msg=msg;
		this.count=count;
		this.data=data;
	}
	
	public ResultMap() {
		
	}	
}
