package com.example.project_wizian2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project_wizian2.command.ResumeVO;
import com.example.project_wizian2.resume.service.ResumeService;

@Controller
@RequestMapping("/user_stu")
public class StudentController {
	
	@Autowired
	ResumeService resumeService;
	
	@GetMapping("/applyList_stu")
	public String applyList_stu() {
		return "/user_stu/applyList_stu";
	}

	@GetMapping("/home")
	public String home() {
		return "/user_stu/home";
	}
	
	@GetMapping("/myhome_stu")
	public String myhome_stu() {
		return "/user_stu/myhome_stu";
	}
	
	@GetMapping("/notice_stu")
	public String notice_stu() {
		return "/user_stu/notice_stu";
	}
	
	@GetMapping("/recHire_stu")
	public String recHire_stu() {
		return "/user_stu/recHire_stu";
	}
	
	@GetMapping("/resume_supportCenter")
	public String resume_supportCenter() {
		
		
		return "/user_stu/resume_supportCenter";
	}
	
	@PostMapping("/resume_supportCenterForm") 
	public String resume_supportCenterForm(ResumeVO vo) {
		
		System.out.println("컨트롤러 출발~~!");
		
		System.out.println("vo의 값: " + vo);
		resumeService.registResume(vo);
		
		System.out.println("컨트롤러 도착~~!");
		
		return "/user_stu/myhome_stu";
	}
	

	
	
	
}
