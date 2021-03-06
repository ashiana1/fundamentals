package com.pluralsight.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MongoDBHealthIndicator implements HealthIndicator {

	private final String msg_key = "MongoDB";

	public Health health() {
		if (!isMongoDBServiceRunning()) {
			return Health.down().withDetail(msg_key, "Application Not Available !").build();
		}
		return Health.up().withDetail(msg_key, "Application Is Available !").build();
	}

	private Boolean isMongoDBServiceRunning() {
		Boolean isRunning = true;
		return isRunning;
	}
	
	

}
