package com.example.project_wizian2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;
import com.example.project_wizian2.manager.service.ManagerService;

@Controller
@RequestMapping("/user_mn")
public class ManagerController {
	
	@Autowired
	ManagerService managerService;
	
	
	@GetMapping("mn_home")
	public String mn_home() {
		
		return "/user_mn/mn_home";
	}
	
	@GetMapping("/mn_myhome")
	public String mn_myhome(Model model) {
		
		ArrayList<ManagerResumeListVO> list = managerService.getList();
		ArrayList<ManagerResumeListVO> updatePost = managerService.updatePost();
		ArrayList<ResumeVO> resumeList = managerService.umList();
		model.addAttribute("list", list);
		model.addAttribute("updatePost", updatePost);
		model.addAttribute("resumeList", resumeList);
		return "user_mn/mn_myhome";
	}
	
	
	@PostMapping("/approve/{title}")
    public String approvePost(@RequestParam("title") String title) {

		managerService.updatePostStatus(title, "Y");
		
        return "redirect:/user_mn/co_hire_mn"; // 승인 후 게시글 목록 페이지로 리다이렉트
    }

    @PostMapping("/reject/{title}")
    public String rejectPost(@RequestParam("title") String title) {
    	System.out.println("업데이트 컨트롤러 시작 : " + title);
    	managerService.updatePostStatus(title, "N");
    	
        return "redirect:/user_mn/co_hire_mn"; // 거절 후 게시글 목록 페이지로 리다이렉트
    }
    
    @GetMapping("/agree_mn")
	public String agree_mn(Model model) {
    	
    	ArrayList<ManagerResumeListVO> list = managerService.getList();
		model.addAttribute("list", list);

    	
		return "/user_mn/agree_mn";
	}
    
    @GetMapping("/co_hire_mn")
	public String home(Model model) {
    	ArrayList<ManagerResumeListVO> list = managerService.updatePost();
    	model.addAttribute("list", list);
		return "/user_mn/co_hire_mn";
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
