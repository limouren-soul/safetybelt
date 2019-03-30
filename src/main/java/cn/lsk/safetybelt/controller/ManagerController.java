package cn.lsk.safetybelt.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lsk.safetybelt.po.Manager;
import cn.lsk.safetybelt.service.ManagerService;
import cn.lsk.safetybelt.vo.Page;
import cn.lsk.safetybelt.vo.ResultMap;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	//依赖注入
	@Autowired
	private ManagerService managerService;
	
	
	//管理员列表页面
	@RequestMapping("/managerList")
	public String findManagerList(HttpSession session,
			Model model) {
		//先验证是否是超级管理员
		//获取管理员身份
		 int identity =(int) session.getAttribute("identity");
		if(identity==1) {
			return "manager/managerList";
		}else {
			model.addAttribute("message", "没有权限");
			return "error";
		}
		
	}
	
	
	
	//分页查询管理员列表
	@RequestMapping("/managerPageList")
	@ResponseBody	//响应json数据
	public ResultMap<List<Manager>> findManagerPageList(
			Page page,
			int limit
			) throws Exception {
		
		//获取每页记录条数
		page.setRows(limit);
	
		//分页查询管理员列表
		List<Manager> managerList = managerService.findManagerList(page);
		System.out.println(managerList);
		//查询总记录数
		int count = managerService.findManagerListCount();
		page.setTotalRecord(count);
		
		return new ResultMap<List<Manager>>(0,"",count,managerList);
	}
	

}
