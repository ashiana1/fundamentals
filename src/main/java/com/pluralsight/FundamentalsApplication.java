package com.pluralsight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentalsApplication {

	public static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
		System.out.println("hello Pluralsight !");
	}

	/*@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Trackzilla", "kesha.williams", "application for users to track"));
			repository.save(new Application("Expenses", "mary.zones", "application for accounting"));
			repository.save(new Application("Notification", "karen.kane", "application for notification"));
			
			
			for(Application app: repository.findAll()) {
				log.info("The application is : " + app.toString());
			}
		};
	}*/
	
	
}
