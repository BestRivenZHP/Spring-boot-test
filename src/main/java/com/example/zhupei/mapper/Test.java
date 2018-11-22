package com.example.zhupei.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Test {

	public List<Map<String, Object>> findBookScore();
}
