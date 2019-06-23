package com.assign.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.service.AssigneesService;

@Controller
@RequestMapping("/")
public class AssigneesController {
	
	@Autowired
	private AssigneesService assigneesService;
	
	public AssigneesController() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	@RequestMapping(value="/Assignees.ams", method=RequestMethod.POST)
	public ModelAndView assignees(@RequestParam long pin,@RequestParam String email,Model model) {
		
		System.out.println("invoked");
		/*System.out.println(pin);
		System.out.println(email);*/
		
		String[] emails=email.split(",");
		for(int i=0; i<emails.length;i++) {
			System.out.println(emails[i]);
		}
		
		try {
		assigneesService.assigneesService(pin, emails);
		//model.addAttribute("success", "successfully mail send....");
		return new ModelAndView("Assignees.jsp", "success", "successfully mail send....");
		
		}
		catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("success", "successfully mail send....");
			
		}
		return null;
	
		
	}
	

}
