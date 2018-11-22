package com.example.zhupei;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.zhupei.filter.MyFilter;
import com.example.zhupei.model.Cat;
import com.example.zhupei.model.Person;

@Configuration
public class Myconfig {

	 @Bean
	    public FilterRegistrationBean MyFilterRegistration() {
	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(new MyFilter());
	        registration.addUrlPatterns("/*");
	        registration.addInitParameter("paramName", "paramValue");
	        registration.setName("MyFilter");
	        registration.setOrder(1);
	        return registration;
	    }
	 
	    @Bean
		public Cat cat1() {
			return new Cat("dd","ff");
		}

	    @Bean
	    public Person person() {
	    	return new Person();
	    }
	
}
