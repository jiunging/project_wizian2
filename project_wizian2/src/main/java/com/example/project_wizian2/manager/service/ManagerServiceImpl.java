package com.example.project_wizian2.manager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project_wizian2.command.ManagerResumeListVO;
import com.example.project_wizian2.command.ResumeVO;

@Service("manager")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	ManagerMapper managerMapper;

	@Override
	public ArrayList<ManagerResumeListVO> getList() {
		
		System.out.println("서비스: " + managerMapper.getList());
		
		return managerMapper.getList();
	}

	
	@Override
	public ArrayList<ResumeVO> umList() {
		
		System.out.println("umlist 서비스: " + managerMapper.umList());
		
		return managerMapper.umList();
	}
	
	

}
