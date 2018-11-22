package com.example.zhupei;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport{

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new BasicInterceptor())
			.addPathPatterns("/**");
	}


}
