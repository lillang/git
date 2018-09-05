package com.xinda.counterfeit.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.xinda.counterfeit.pojo.TbUser;


public class LoginInterceptor implements HandlerInterceptor {
	
	/**
	 * 执行时机：Handler执行之前执行该方法 返回值：true（放行）/false（拦截）
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		TbUser user=(TbUser) request.getSession().getAttribute("UserInfo");
		if(user==null){
//			response.setCharacterEncoding("utf-8");
//			request.getRequestDispatcher("/login").include(request, response);
//			return false;
		}
		return true;
	}
	
	/**
	 * 执行时机：完全完成Handler处理，已经返回ModelAndView
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 执行时机：在Handler返回之后，但是在Handler返回ModelAndView之前 Handler已经执行完了也没什么拦截不拦截的了
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

}