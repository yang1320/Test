package com;

import org.junit.Test;

public class TestObjectAress {
	public static void main(String[] args) {
		
	//==: 对象是否相等：是否是同一个引用地址。（that equal objects must have equal hash codes.）
	// ==为true时 hashCode一定相同，hashCode相同不一定==为true。  hashCode获取基本类型等有重写。
		Student1 stu=new Student1();
		System.out.println(stu.hashCode());
		new TestObjectAress().returnStu(stu);
		new TestObjectAress().returnStuChange(stu);
		
		
	}
	
	
	@Test
	public  void testObjectAdress(){
		Student1 stu=new Student1();
		System.out.println(stu.hashCode());
	}
	
	
	public Student1 returnStu(Student1 stu){
		System.out.println("传入对象地址:"+stu.hashCode());
		return stu;
	}
	
	public Student1 returnStuChange(Student1 stu){
		stu=new Student1();
		System.out.println("传入对象更改后的地址:"+stu.hashCode());
		return stu;
	}
}
