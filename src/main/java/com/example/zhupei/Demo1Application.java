package com.example.zhupei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.zhupei.filter.MyFilter;
import com.example.zhupei.model.Cat;

@SpringBootApplication
@MapperScan(basePackages="com.example.zhupei.mapper")
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
   

}
