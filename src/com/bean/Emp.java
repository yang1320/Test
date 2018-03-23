package com.bean;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;

public class Emp implements Serializable,FileFilter{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Emp() {
		super();
	}

	private Integer age1;
	private String name;
	private int age;
	public Emp(String name,Integer age1) {
		super();
		this.age1 = age1;
		this.name = name;
	}
	public Integer getAge1() {
		return age1;
	}
	public void setAge1(Integer age1) {
		this.age1 = age1;
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
	
	
	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [age1=" + age1 + ", name=" + name + ", age=" + age + "]"+serialVersionUID;
	}

	
	
	
	public void work(){
		System.out.println("emp work!");
	}
	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
