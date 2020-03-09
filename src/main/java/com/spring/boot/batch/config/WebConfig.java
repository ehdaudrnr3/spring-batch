package com.spring.boot.batch.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

	@SuppressWarnings("rawtypes")
	@Bean
	ServletRegistrationBean h2ServletRegistration() {
		@SuppressWarnings("unchecked")
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/h2-console/*");
		registrationBean.setEnabled(true);
		return registrationBean;
	}
}
