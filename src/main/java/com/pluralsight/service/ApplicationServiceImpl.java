package com.pluralsight.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.entity.Application;
import com.pluralsight.repository.ApplicationRepository;
import com.pluralsight.repository.ApplicationRepositoryJPA;

@Service
public class ApplicationServiceImpl implements ApplicationService{


	public static final Logger log = LoggerFactory.getLogger(ApplicationServiceImpl.class);
	
	@Autowired
	private ApplicationRepository repository;

	@Autowired
	private ApplicationRepositoryJPA repoJPA;
	
	@Override
	public Iterable<Application> listApplications() {
		
		return repository.findAll();
	}

	@Override
	public Application getAppById(Long id) {
		
		Optional<Application> app = Optional.empty();
		log.info("value of id being passed to DB: " + id);
		try {
			app = repository.findById(id );
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (app.isPresent()) {
			log.info("The db has the app present for the id : " + id);
			return app.get();
		} else {
			throw new RuntimeException("Application not found");
		}

	}

}
