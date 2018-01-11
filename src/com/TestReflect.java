package com;

import java.lang.reflect.Field;

import com.testClass.Student;



public class TestReflect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void showField(){
		System.out.println(Student.class.getFields().length);
		System.out.println(Student1.class.getFields().length);
		for (Field field : Student1.class.getDeclaredFields()) {
			System.out.println(field);
			
		}
		System.out.println(Student1.class.getDeclaredFields().length);

	}
	
    public static void testReflect(Object model) throws Exception{
        for (Field field : model.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.getName() + ":" + field.get(model) );
            }
    }
    

}
