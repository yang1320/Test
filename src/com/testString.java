package com;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;

import org.junit.Test;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((String)null);
		System.out.println(1+2+"s");
		System.out.println("1"+1+2+"s");
		System.out.println("abc".substring(1));
		System.out.println(new StringBuilder().append(Character.toUpperCase("abc".charAt(0))).append("abc".substring(1)));
		
/*		null
3s
112s
bc
Abc*/

	}
	
	@Test
	  public void show(){
		int a = (char) (56 + '1');
//		char c='t';
		System.out.println(a);
	  }
	
	@Test
	public void testEncoding() throws UnsupportedEncodingException{
		System.out.println("mdbz1:"+new String("test".getBytes(),"utf-8"));
		System.out.println("mdbz2:"+new String("test".getBytes(),"iso-8859-1"));
	}

	
	@Test
	public  void getPath(){
		String path="E:\\Users\\yang\\workspace\\boot-maven-mybatis\\target\\src\\main\\resources\\static\\uploadAndDown";
		
		System.out.println(path.substring(0,path.indexOf("boot-maven-mybatis")));
	}
	

	
	@Test
	public void testString(){
		System.out.println(String.format("渠道号%s非法", 2));
		System.out.println(MessageFormat.format("该域名{0}被访问了 {1} 次.",1 ,2));
	}
}
