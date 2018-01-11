package com;

import java.util.Random;

public class testDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.class);
		System.out.println(Integer.TYPE);
		System.out.println(Integer.MAX_VALUE+":"+Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE+":"+Long.MIN_VALUE);
		 System.out.println("ssssssss"+Byte.MAX_VALUE);
		 System.out.println(Byte.MIN_VALUE);
		 
		 //int randNumber =rand.nextInt(MAX - MIN + 1) + MIN;
		 Random rd=new Random();
		 System.out.println("result:"+(rd.nextInt(Byte.MAX_VALUE-Byte.MIN_VALUE+1)+Byte.MIN_VALUE));
		 

	}

}
