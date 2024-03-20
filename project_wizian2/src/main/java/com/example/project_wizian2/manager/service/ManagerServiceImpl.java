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

	// 3. 거절 시, 공고 삭제
	@Override
	public void deletePost(String title) {
		
		managerMapper.deletePost(title);
	}

	// 회사 메인 페이지와 공고등록 현황페이지에서 현재 등록 현황 확인
	@Override
	public ArrayList<ManagerResumeListVO> uploadPost() {
		
		return managerMapper.uploadPost();
	}

	// 학생 이력서 업데이트
	@Override
	public void updateResume(String stu_name, String stu_yn) {

		managerMapper.updateResume(stu_name, stu_yn);
		
	}

	@Override
	public ArrayList<ResumeVO> umList2() {
		
		return managerMapper.umList2();
	}
	
	

}
