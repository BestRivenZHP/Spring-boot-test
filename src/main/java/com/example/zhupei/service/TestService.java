package com.example.zhupei.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.zhupei.mapper.Test;

@Service
public class TestService {

	@Resource
	private Test test;
	
	public List<Map<String, Object>> findBookScore(){
		return test.findBookScore();
	}
}
