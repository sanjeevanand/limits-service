package com.san.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.microservices.limitsservice.bean.Configuration;
import com.san.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	//@Value
	@Autowired
	private Configuration cofiguration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		
		//return new LimitConfiguration(1000, 1);
		return new LimitConfiguration(cofiguration.getMaximum(), cofiguration.getMinimum());
		
	}

}
