package com.example.project_wizian2.manager.service;

import java.util.ArrayList;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;

public interface ManagerService {
	
	public ArrayList<ManagerResumeListVO> getList();
	
	public ArrayList<ResumeVO> umList();
	public ArrayList<ResumeVO> resumeDetail(int resume_num);
	

	// 1. 채용 공고 등록 승인 여부
	public void updatePostStatus(String title, String yn);
	// 2. 승인된 공고만 화면 표출
	public ArrayList<ManagerResumeListVO> updatePost();

}
