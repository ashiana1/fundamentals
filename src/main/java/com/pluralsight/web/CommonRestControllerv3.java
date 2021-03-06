package com.pluralsight.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.pluralsight.entity.Application;
import com.pluralsight.service.ApplicationService;

@RestController
@RequestMapping("v3/trips")
public class CommonRestControllerv3 {

	private ApplicationService appSvc;
	
	@Autowired
	public void setApplicationService(ApplicationService applicationService) {
		this.appSvc = applicationService;
	}

	@GetMapping("/apps")
	public ResponseEntity<Iterable<Application>> getAllApplications() {
		
		Iterable<Application> appList = appSvc.listApplications();
		return new ResponseEntity<Iterable<Application>>(appList, HttpStatus.OK);
		
	}
	
	@GetMapping("/app/{id}")
	public ResponseEntity<Application> getApplicationById(@PathVariable("id") Long id) {
		try {
			return new ResponseEntity<Application>(appSvc.getAppById(id), HttpStatus.OK);
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The eelement you are lookign for is not found!");
		}
				
	}
	
}
