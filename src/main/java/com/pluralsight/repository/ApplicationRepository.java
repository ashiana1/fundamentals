package com.pluralsight.repository;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
	
}
