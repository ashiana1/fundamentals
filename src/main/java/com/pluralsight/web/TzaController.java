package com.pluralsight.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pluralsight.service.ApplicationService;

@Controller
public class TzaController {

	private ApplicationService appSvc;
	
	@Autowired
	public void setApplicationService(ApplicationService applicationService) {
		this.appSvc = applicationService;
	}

	@GetMapping("/applications")
	public String retrieveApplications(Model model) {
		
		model.addAttribute("applications", appSvc.listApplications() );
		return "applications";
		
	}
	
	
}
