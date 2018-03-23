package com.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormateDate {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss:SSS");
		System.out.println( sdf.format(new Date()) );

	}
	
	public static String getTime(){
		
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss:SSS");
		return sdf.format(new Date());
		
	}
}
