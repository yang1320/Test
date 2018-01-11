package com;
import java.io.Serializable;


public class Student1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name="sdfsdf";
	private int age;
	private Long ss;
	private Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "张三";
	}
	public Student1() {
		super();
	}
	public Student1(String name, int age, Long ss, Object obj) {
		super();
		this.name = name;
		this.age = age;
		this.ss = ss;
		this.obj = obj;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", ss=" + ss + "]";
	}
	public Long getSs() {
		return ss;
	}
	public void setSs(Long ss) {
		this.ss = ss;
	}
	
	
}
