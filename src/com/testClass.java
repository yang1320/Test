package com;

import java.util.Date;

import org.junit.Test;



public class testClass {


	@Test
	public void testReturn(){
		if(true){
			System.out.println("aaaaaaaaaaaa");
			return;
		}
		System.out.println("ssssssssss");
		Integer a=0;
	}
	
	@Test
	public void testSet(){
		Student1 stu=new Student1();
		stu.setSs(null);
		stu.setName("");
		System.out.println(stu.getName());
	}
	
	{
		System.out.println("dstatic");
	}
	static{System.out.println("static11111111");}
	public static void main(String[] args) {
		System.out.println(testClass.class.getName());
		System.out.println(new Test1());//加载类时加载静态成员，实例化时执行非静态代码块及构造函数。
		System.out.println("sssssss=="+new Date());
		Object obj1=null;
		System.out.println((String)obj1);
		//System.out.println(obj1.toString());
		
		System.out.println();
		Object obj=new Student("1",18);
		System.out.println("ss:"+obj);
		//System.out.println("--------=asad\nasadsa");
		System.out.println("getTime:"+String.valueOf(new Date().getTime()));
	}
	
	static class Student{
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		public String name="bb";
		public int age=18;
		
		public void show(){
			System.out.println(this.name);
		}
		public Student(String name,int age) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.age=age;
		}
//		@Override
//		public String toString() {
//			return "Student [name=" + name + ", age=" + age + "]";
//		}
		
	}
	
}
