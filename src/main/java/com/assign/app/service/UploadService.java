package com.assign.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.UploadDAO;

@Service
public class UploadService {
	
	@Autowired
	private UploadDAO uploadDAO;
	
	public UploadService() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	public String uploadService() {
		return null;
		
	}

}
