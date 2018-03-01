package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Test1 {
	
	public static void main(String[] args) throws Exception {
		List list=new ArrayList();
		Student1 stu=new Student1("张三", 18, (long) 18, null);
		list.add(stu);
		System.out.println(new TestJson().toJson(list));
		System.out.println(new TestJson().toJson(list.toArray()));
		System.out.println(new TestJson().toJson(stu));
		
		
	}

	
	
	


}
