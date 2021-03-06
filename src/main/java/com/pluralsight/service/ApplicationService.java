package com.pluralsight.service;

import com.pluralsight.entity.Application;

public interface ApplicationService {

    Iterable<Application> listApplications();

    Application getAppById(Long id);

}
