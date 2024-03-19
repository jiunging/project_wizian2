package com.example.project_wizian2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project_wizian2.command.ResumeVO;
import com.example.project_wizian2.manager.service.ManagerService;

@Controller
@RequestMapping("/user_co")
public class User_CoController {
	
	@Autowired
	private ManagerService managerService;
	
	// 인재리스트
	@GetMapping("/apply_co")
	public String apply_co(Model model) {
		
		ArrayList<ResumeVO> list = managerService.umList();
		model.addAttribute("list", list);
		System.out.println(list);
		
		return "/user_co/apply_co";
	}
	
	@GetMapping("/co_home")
	public String co_home() {
		
		return "/user_co/co_home";
	}
	
	@GetMapping("/co_myhome")
	public String co_myhome() {
		
		return "/user_co/co_myhome";
	}
	
	@GetMapping("/hire_co")
	public String hire_co() {
		
		return "/user_co/hire_co";
	}
	
	@GetMapping("/purpose_co")
	public String purpose_co() {
		
		return "/user_co/purpose_co";
	}
	
	@GetMapping("/resume_jobpost")
	public String resume_jobpost() {
		
		return "/user_co/resume_jobpost";
	}
	


}
