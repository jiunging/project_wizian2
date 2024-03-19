package com.example.project_wizian2.manager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;

@Service("manager")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerMapper managerMapper;

	@Override
	public ArrayList<ManagerResumeListVO> getList() {
		
		//System.out.println("서비스: " + managerMapper.getList());
		
		return managerMapper.getList();
	}

	@Override
	public ArrayList<ResumeVO> umList() {
		
		//System.out.println("umlist 서비스: " + managerMapper.umList());
		
		return managerMapper.umList();
	}


	@Override
	public ArrayList<ResumeVO> resumeDetail(int resume_num) {
		
		return managerMapper.resumeDetail(resume_num);
	}
	// 채용공고 승인 여부
	@Override
	public void updatePostStatus(String title, String yn) {
		
		System.out.println("서비스 실행");
		managerMapper.updatePostStatus(title, yn);
	}
	
	// 2. 승인된 공고만 화면 표출
	@Override
	public ArrayList<ManagerResumeListVO> updatePost() {
		
		return managerMapper.updatePost();
	}
	
	

}
