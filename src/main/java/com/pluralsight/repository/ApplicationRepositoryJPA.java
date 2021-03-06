package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.entity.Application;

public interface ApplicationRepositoryJPA extends JpaRepository<Application, Long> {
	/**
	 * Jpa Repo extends CRUD and add Pagination and Sorting during findAll() apis. 
	 * 
	 * Also supports few extra apis.  
	 */

}
