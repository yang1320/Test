package com;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;


public class TestDate {
	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar(); 
		gc.setTime(new Date()); 
		gc.add(2,1);
		System.out.println(":"+new Date());
		System.out.println(gc.getTime());
		
		//System.out.println(new Date()+2*);
	}
	
	@Test
	public void dateJiaJian(){
		GregorianCalendar gc=new GregorianCalendar(); 
		gc.setTime(new Date()); 
		gc.add(2,2);
		System.out.println(":"+new Date());
		System.out.println(gc.getTime());
		
	}
}
