package com.pluralsight.queryresolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pluralsight.entity.Application;
import com.pluralsight.repository.ApplicationRepository;
import com.pluralsight.service.ApplicationService;

@Component
public class Query implements GraphQLQueryResolver{
	
	private ApplicationRepository applicationRepository;


	
    public Query(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

	/**Query methods
	*/

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public long countApplications() {
        return applicationRepository.count();
    }
	
	/**
	* trying 
	*/
	
	private ApplicationService appSvc;
	
	@Autowired
	public void setApplicationService(ApplicationService applicationService) {
		this.appSvc = applicationService;
	}

	public Iterable<Application> getAllApplications() {
		
		Iterable<Application> appList = appSvc.listApplications();
		return appList;
		
	}
	
	
	
}
