package com.example.project_wizian2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user_mn")
public class ManagerController {
	
	@GetMapping("/agree_mn")
	public String agree_mn() {
		return "/user_mn/agree_mn";
	}
	
	@GetMapping("/co_hire_mn")
	public String home() {
		return "/user_mn/co_hire_mn";
	}
	
	@GetMapping("mn_home")
	public String mn_home() {
		return "/user_mn/mn_home";
	}
	
	@GetMapping("mn_myhome")
	public String mn_myhome() {
		return "/user_mn/mn_myhome";
	}
	
	@GetMapping("resume_mn")
	public String resume_mn() {
		return "/user_mn/resume_mn";
	}
	

}
