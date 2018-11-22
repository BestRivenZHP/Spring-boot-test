package com.example.zhupei.model;

import org.springframework.stereotype.Component;


public class Cat {
	private String kind;
	

	private String name;
    public Cat() {
		super();
		// TODO Auto-generated constructor stub
	  }
	public Cat(String name,String kind) {
		this.name=name;
		this.kind=kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [kind=" + kind + ", name=" + name + "]";
	}
}

