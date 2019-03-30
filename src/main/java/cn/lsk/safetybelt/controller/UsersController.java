package cn.lsk.safetybelt.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lsk.safetybelt.service.UserService;
import cn.lsk.safetybelt.vo.Page;
import cn.lsk.safetybelt.vo.ResultMap;
import cn.lsk.safetybelt.po.User;
import cn.lsk.safetybelt.po.UsersCustom;


@Controller
@RequestMapping("/users")
public class UsersController{
	@Autowired
	private UserService userService;
	
	//显示用户列表页面
	@RequestMapping("/userList")
	public String findUersList() throws Exception {
		return "/users/userList";
	}
	
	//分页传入用户列表数据
	@RequestMapping("/userPageList")
	@ResponseBody
	public ResultMap<List<UsersCustom>> userPageList(Page page,
			int limit) throws Exception {
		//每页的记录条数
		page.setRows(limit);
		List<UsersCustom> userPageList = userService.findUserPageList(page);
		//分页查询列表总记录数
		Integer count = userService.findUserPageCount(page);
		System.out.println(count);
		page.setTotalRecord(count);
		return new ResultMap<>(0, "", count, userPageList);
	}
	
	//修改用户信息
	@RequestMapping("/updateUser")
	public String updateUser(User user) throws Exception {
		//进行修改用户的业务
		userService.updateUser(user);
		return "redirect:/users/userList";
	}
	
//删除用户
	@RequestMapping("/deleteUser")
	public void deleteUser(@RequestBody HashMap<String,Integer> map
			,HttpServletResponse response
			) throws Exception{
		//进行删除用户的业务
		int id= map.get("id");
		System.out.println(id);
		userService.deleteUser(id);
		response.getWriter().write("success");
	}
	

	
	
	
	
	
	
	
	
	
	
}
