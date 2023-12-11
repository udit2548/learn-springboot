package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// Here we are defining these properties which will be configured and mapped by controller(rest api) later on
//currency-service.url=
//currency-service.username=
//currency-service.key=

@ConfigurationProperties(prefix = "currency-service")  // Important annotation while dealing with configuration properties.
@Component
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String key;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
