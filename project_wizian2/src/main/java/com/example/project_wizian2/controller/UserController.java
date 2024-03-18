package com.example.project_wizian2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String loginForm(StudentVO vo, CompanyVO vo2, ManagerVO vo3 ) {
		
		System.out.println(vo);
		System.out.println(vo2);
		System.out.println(vo3);
		
		String id = userservice.stu_idcheck(vo).getStu_id();
		String pw = userservice.stu_idcheck(vo).getStu_pw();
		
		if(vo.getStu_id().equals(id) &&  vo.getStu_pw().equals(pw)) {
			System.out.println("YES!!!");
		}
		
		
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
