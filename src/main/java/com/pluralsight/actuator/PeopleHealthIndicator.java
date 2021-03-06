package com.pluralsight.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PeopleHealthIndicator implements HealthIndicator{

	private final String msg_key = "PeopleService";
	
	@Override
	public Health health() {		
		if(!isPeopleServiceRunning()) {
			return Health.down().withDetail(msg_key, "Application Not Available !").build();
		}		
		return Health.up().withDetail(msg_key, "Application Is Available !").build();
	}
	
	
	private Boolean isPeopleServiceRunning() {		
		Boolean isRunning = false;
		return isRunning;
	}
	
	
}
