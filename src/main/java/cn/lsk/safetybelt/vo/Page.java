package cn.lsk.safetybelt.vo;

import java.io.Serializable;

/**
 * @Description:处理分页,继承序列化接口
 *
 * @author 李某人_soul
 * @version 1.0
 */
public class Page implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//当前页
    private Integer page=1;
    //页大小
    private Integer rows=5;
    // 总记录 数
    private Integer totalRecord;
    //总页数
    private Integer totalPage;
    //关键字类型
    private String keyType;
    //查询关键字
    private String keyWord;
    //开始记录位置
    private Integer start;
    //用户id
    private String userid;

    
    

	public String getKeyType() {
        return keyType;
    }
 
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
 
 
 
    public String getUserid() {
        return userid;
    }
 
    public void setUserid(String userid) {
        this.userid = userid;
    }
 
    public Integer getPage() {
        return page;
    }
 
    public void setPage(Integer page) {
        this.page = page;
    }
 
    public Integer getRows() {
        return rows;
    }
 
    public void setRows(Integer rows) {
        this.rows = rows;
    }
 
    public Integer getTotalRecord() {
        return totalRecord;
    }
 
    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }
 
    public Integer getTotalPage() {
    	if(totalRecord%rows==0) {
    		return totalPage;
    	}
//        totalPage=(totalRecord-1)/rows+1;
        return totalPage+1;
    }
 
    public void setTotalPage(Integer totalPage) {
 
        this.totalPage = totalPage;
    }
 
    public String getKeyWord() {
        return keyWord;
    }
 
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
 
    public Integer getStart() {
        start=(page-1)*rows;
        return start;
    }
 
    public void setStart(Integer start) {
 
        this.start = start;
    }
 
   
    public Page() {
    }
 
    public Page(Integer page, Integer rows, Integer totalRecord, Integer totalPage, String keyType, String keyWord, Integer start, String userid) {
        this.page = page;
        this.rows = rows;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.keyType = keyType;
        this.keyWord = keyWord;
        this.start = start;
        this.userid = userid;
    }

	
}