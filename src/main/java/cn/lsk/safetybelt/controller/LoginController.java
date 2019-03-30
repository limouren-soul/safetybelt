package cn.lsk.safetybelt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lsk.safetybelt.po.Manager;
import cn.lsk.safetybelt.service.ManagerService;

@Controller
public class LoginController {
	@Autowired
	private ManagerService managerService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response,
			HttpSession httpSession,
			String managerName,
			String password) throws Exception {
		//调用service进行身份认证
		Manager manager = managerService.managerLogin(managerName, password);
		System.out.println(manager);
		Integer identity = manager.getIdentity();
		//保存管理员姓名到session
		httpSession.setAttribute("managerName", managerName);
		httpSession.setAttribute("identity", identity);
		return "redirect:main";
	}
	
	@RequestMapping("/logout")
	public void logout(HttpSession httpSession,
			HttpServletRequest request,
			HttpServletResponse response)  throws Exception{
		//清除session
		httpSession.invalidate();
		
		//重定向到登录界面
		response.sendRedirect("/safetybelt");

	}
	
	
	@RequestMapping("/main")
	public String main(HttpServletRequest request,HttpServletResponse response,
			HttpSession httpSession,
			String managerName,
			String password) throws Exception {
		return "main";
	}

	


}
