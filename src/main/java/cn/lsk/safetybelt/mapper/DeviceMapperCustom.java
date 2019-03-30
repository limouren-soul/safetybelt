package cn.lsk.safetybelt.mapper;

import java.util.List;

import cn.lsk.safetybelt.po.DeviceCustom;
import cn.lsk.safetybelt.vo.Page;

public interface DeviceMapperCustom {
	//分页查询设备列表
	public List<DeviceCustom> findDeviceList(Page page) throws Exception;
	//分页查询设备列表总数
	public Integer  findDeviceListCount() throws Exception;
	

}
