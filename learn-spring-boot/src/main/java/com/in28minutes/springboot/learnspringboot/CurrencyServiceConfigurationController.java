package com.in28minutes.springboot.learnspringboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// This controller motive is to make when we hit url or rest api thing map properties from application.properties to CurrencyServiceConfiguration.java by autowiring
// of dependencies and all other stuff

@RestController
public class CurrencyServiceConfigurationController {
	@Autowired
	private CurrencyServiceConfiguration config;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return config;
		
	}
}
