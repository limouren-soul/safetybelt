package cn.lsk.safetybelt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lsk.safetybelt.po.DeviceCustom;
import cn.lsk.safetybelt.service.DeviceService;
import cn.lsk.safetybelt.vo.Page;
import cn.lsk.safetybelt.vo.ResultMap;

@Controller
@RequestMapping("/device")
public class DeviceController {
	//依赖注入
	@Autowired
	private DeviceService deviceService;
	
	
	//分页查询设备列表
	@RequestMapping("/devicePageList")
	@ResponseBody
	public ResultMap< List<DeviceCustom> > findDevicePageList(Page page,
			int limit) 
			throws Exception{
		//获得每页记录条数
		page.setRows(limit);
		
		List<DeviceCustom> deviceList = deviceService.findDeviceList(page);
		System.out.println(deviceList);
		//设备列表总数
		int listCount = deviceService.findDeviceListCount();
		ResultMap<List<DeviceCustom>> resultMap = new ResultMap<List<DeviceCustom>>(0,"",listCount,deviceList);
		System.out.println(resultMap);
		return resultMap;
	}
	
	
	//显示设备列表页面
	@RequestMapping("/deviceList")
	public String findDeviceList() {
		
		
		return "device/deviceList";
	}
	
	
	//删除设备
	@RequestMapping("/deleteDevice")
	public void deleteDevice(String deviceId,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception{
		
		System.out.println(deviceId);
		//进行删除的业务
		deviceService.deleteDevice(deviceId);
		
		response.getWriter().write("success");
		
	}
	//解绑用户
	@RequestMapping("/unbindUser")
	public void unbindUser(String deviceId,Integer userId,
			HttpServletResponse response) throws Exception {
		System.out.println(userId);
		//进行解绑的业务
		deviceService.unbindUser(deviceId);
		response.getWriter().print("success");
		
	}
	
	//显示增加设备页面
	@RequestMapping("/addDevice")
	public String addDevice() {
		return "device/addDevice";
	}
	
	//增加设备提交
	@RequestMapping("/addDeviceSubmit")
	public void addDeviceSubmit(String deviceId,
			String userId,String username,
			HttpServletResponse response)throws Exception {
		System.out.println(deviceId);
		//调用业务进行添加设备
		deviceService.addDevice(deviceId);
		response.getWriter().write("success");
	}
		
	
	
	
	
	
	
	
	
	
	

}
