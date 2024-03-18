package com.example.project_wizian2.manager.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;

@Mapper
public interface ManagerMapper {
	
	public ArrayList<ManagerResumeListVO> getList();
	
	public ArrayList<ResumeVO> umList();
	
}
