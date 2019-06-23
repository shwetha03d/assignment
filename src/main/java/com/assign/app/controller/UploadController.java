package com.assign.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assign.app.dto.UploadDTO;
import com.assign.app.service.UploadService;

@Controller
@RequestMapping("/")
public class UploadController {
	
	@Autowired
	private UploadService uploadService;
	
	public UploadController() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/Upload.ams", method=RequestMethod.POST)
	public String uploadController(UploadDTO dto) {
		System.out.println("invoked upload contoller..");
		
		System.out.println("Data from upload Controller:"+dto);
		
		
		return "Upload.jsp";
		
	}

}
