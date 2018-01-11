package com.spring;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.sf.json.JSONArray;

import com.bean.Emp;



public class Reflection {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
		
		Class cl=Class.forName("com.bean.Emp");
	
		Object emp=cl.newInstance();
		
//		System.out.println(emp.getClass());
		
		Method m=cl.getDeclaredMethod("setName",String.class);
		m.invoke(emp,"张三");
		
		System.out.println(emp instanceof Emp);
		System.out.println(emp);
		
		System.out.println("interfaces:\t"+JSONArray.fromObject(emp.getClass().getInterfaces()));

		Constructor con=cl.getConstructor(String.class,int.class);
		
		
		System.out.println(con);
		Constructor con1=cl.getConstructor();
		System.out.println(con1);
		
		System.out.println(cl.getConstructors());
		
/* print:
	true
	Emp [age1=null, name=张三, age=0]
	interfaces:	["java.io.Serializable","java.io.FileFilter"]
	public com.bean.Emp(java.lang.String,int)
	public com.bean.Emp()
	[Ljava.lang.reflect.Constructor;@61e717c2
		
		*/
	}

}
