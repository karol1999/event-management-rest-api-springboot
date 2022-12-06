package com.kmat.springdatarest.eventmgmtapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = {EventmgmtapiApplication.class, Jsr310Converters.class})
public class EventmgmtapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmgmtapiApplication.class, args);
	}

}
