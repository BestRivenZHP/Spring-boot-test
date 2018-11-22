package com.example.zhupei.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




public class Person {
	private String name;
	private int age;
	private String sex;
	@Autowired
	private Cat cat;
    public Person() {
		super();
		// TODO Auto-generated constructor stub
	 }
	public Person(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public Person(String name,int age,String sex,Cat cat) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.cat=cat;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public Cat getCat() {
		return cat;
	}
	@Autowired
	//@Qualifier("cat1")//������ע��
	public void setCat(Cat cat) {
		
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", cat=" + cat + "]";
	}
	
	
}

