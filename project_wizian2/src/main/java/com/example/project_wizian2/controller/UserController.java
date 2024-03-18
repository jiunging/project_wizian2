package com.example.project_wizian2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project_wizian2.command.CompanyVO;
import com.example.project_wizian2.command.ManagerVO;
import com.example.project_wizian2.command.StudentVO;
import com.example.project_wizian2.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/join")
	public String join() {
		
		return "/user/join";
	}
	
	@GetMapping("/login")
	public String login( ) {

		return "/user/login";
	}
	
	@PostMapping("/login")
	public String loginForm(String username) {
		
		System.out.println(username);
		
		
		return "/user/login";
	}

	
	@PostMapping("/joinStudent")
	public String joinStudent(StudentVO vo) {
		
		userservice.stu_regist(vo);
		
		return "redirect:/user/login";
	}
	
	@PostMapping("/joinCompany")
	public String joincompany(CompanyVO vo) {
		
		userservice.com_regist(vo);
		
		return "redirect:/user/login";
	}
	
	@PostMapping("/joinManager")
	public String joinManager(ManagerVO vo) {
		userservice.man_regist(vo);
		return "redirect:/user/login";
	}
	
}
