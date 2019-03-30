package cn.lsk.safetybelt.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
	
	//进入Handeler完成之前执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// 获取请求的url
		String requestURI = request.getRequestURI();
		//获取用户名
		HttpSession session = request.getSession();
		String managerName = (String) session.getAttribute("managerName");
		//判断请求的URL是否公开,即判断请求地址中是否含有login.action
		if(requestURI.indexOf("login")>=0) {
			//放行
			return true;	
		}
		//判断session中是否有用户
		
		if(managerName!=null) {
			//用户存在，放行
			return true;
		}
		//转发到登录页面
//		request.getRequestDispatcher("/index.jsp").forward(request, response);
		//重定向到登录页面
		//response.sendRedirect("/safetybelt/indexlogin");
		response.sendRedirect("/safetybelt");
		return false;
	}
	
	//进入handler之后返回modelAndView之前执行
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO 自动生成的方法存根
		
	}

	
	//进入Handeler完成之后执行
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO 自动生成的方法存根
		
	}


}
