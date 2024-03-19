package com.example.project_wizian2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;
import com.example.project_wizian2.manager.service.ManagerService;

@Controller
@RequestMapping("/user_mn")
public class ManagerController {
	
	@Autowired
	ManagerService managerService;
	
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
	public String resume_mn(Model model) {
		
//		ArrayList<ManagerResumeListVO> vo = managerService.getList();
//		System.out.println("컨트롤러 " + vo);
		
		
		ArrayList<ResumeVO> vo2 = managerService.umList();
		model.addAttribute("vo", vo2);
		System.out.println("엄컨트롤러" + vo2);
		
		
		return "/user_mn/resume_mn";
	}
	
	@GetMapping("/result_resume")
	public String result_resume(int resume_num
								,Model model) {
		
		System.out.println("컨트롤러 출발");
		
		ArrayList<ResumeVO> list = managerService.resumeDetail(resume_num);
		model.addAttribute("vo", list);
		System.out.println("컨트롤러 도착");
		System.out.println(list);
		
		return "/user_mn/result_resume";
	}
	
	
	

}
