package com.yangfeiself.tool;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("encod result:"+Encryption.encryption("pwd"));
		Bean b1=new Bean();
		b1.setAge(18);
		b1.setName("b1");
		
		System.out.println(JsonConvert.toJson(b1));
		
	}

}
