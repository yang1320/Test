package com;

public class testLogic {
	public static void main(String[] args) {
		if(true || new testLogic().returnTrue()){	//  && || 为短路
			System.out.println("hello!");
		}
		
	}
	
	
	public boolean returnTrue(){
		System.out.println("into !");
		return true;
	}
}
