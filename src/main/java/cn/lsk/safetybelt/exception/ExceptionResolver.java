package cn.lsk.safetybelt.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:全局异常处理器
 *
 * @author 李某人_soul
 * @version 1.0
 */
public class ExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO 自动生成的方法存根
		CustomException customException=null;
		//判断全局异常处理器解析出来的异常是否是自定义的异常
		if(ex instanceof CustomException) {
			customException=(CustomException) ex;
		}else {
			customException =new CustomException("未知错误");
		}
		//获取错误信息
		String message = customException.getMessage();
		
		//添加到response域
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", message);
		modelAndView.addObject("msg", "error");
		//指向错误页面
		modelAndView.setViewName("error");
		
		return modelAndView;
	}
	
	

}
