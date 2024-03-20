package com.example.project_wizian2.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ComAuthHandler implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		String auth = (String) session.getAttribute("auth");
		System.out.println(auth +"111");
		
		//String uri = request.getRequestURI();
		
		String uri = request.getRequestURI();
		
		System.out.println(uri.startsWith("/user_com/") + "comauth");
		
		if (auth.equals("com")) {
            if (uri.startsWith("/user_co/")) { 
                return true;
            } else {
                response.sendRedirect(request.getContextPath() + "/user_co/co_home"); 
                return false;
           }
        } else {
            response.sendRedirect(request.getContextPath() + "/user/login");
            return false;
        }
		

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	
	
	
}
