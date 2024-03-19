package com.example.project_wizian2.manager.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;

@Mapper
public interface ManagerMapper {
	
	public ArrayList<ManagerResumeListVO> getList();
	
	public ArrayList<ResumeVO> umList();
	
	public ArrayList<ResumeVO> resumeDetail(int resume_num);

	// 1. 채용 공고 등록 승인 여부
	void updatePostStatus(@Param("title") String title, @Param("yn") String yn);
	// 2. 승인된 공고만 화면 표출
	public ArrayList<ManagerResumeListVO> updatePost();
	
}
