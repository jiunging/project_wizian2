package com.example.project_wizian2.manager.service;

import java.util.ArrayList;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;

public interface ManagerService {
	
	public ArrayList<ManagerResumeListVO> getList();
	
	public ArrayList<ResumeVO> umList();
	public ArrayList<ResumeVO> resumeDetail(int resume_num);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
