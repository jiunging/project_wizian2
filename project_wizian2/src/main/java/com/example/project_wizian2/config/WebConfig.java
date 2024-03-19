package com.example.project_wizian2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.project_wizian2.interceptor.UserAuthHandler;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	private UserAuthHandler userauthhandler;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
			registry.addInterceptor(userauthhandler)
					.excludePathPatterns("/user/login")
					.excludePathPatterns("/user/loginForm")
					.excludePathPatterns("/user/join")
					.excludePathPatterns("/user/joinStudent")
					.excludePathPatterns("/")
					.addPathPatterns("/user_stu/**")
					.addPathPatterns("/user_mn/**")
					.addPathPatterns("/user_co/**");
		
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	
	

}
