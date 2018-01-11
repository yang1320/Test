package com;
import java.math.BigDecimal;
import java.math.MathContext;

import org.junit.Test;


public class testMath {
	public static void main(String[] args) {
		BigDecimal d1=new BigDecimal("12.556");
		System.out.println("sssssss:"+d1.setScale(2, BigDecimal.ROUND_HALF_UP));
	}
	
	@Test
	public void jisuan(){
		double c=10;
		double b=c/3;
		BigDecimal e=new BigDecimal(3);
		BigDecimal f=new BigDecimal(10);
		BigDecimal a=f.divide(e,3, BigDecimal.ROUND_HALF_UP);
		System.out.println(b);
		System.out.println(a);
		System.out.println(a.multiply((new BigDecimal(6)),MathContext.DECIMAL128 ));
/*		
		3.3333333333333335
		3.333
		19.998*/
	}
	
	@Test
	public void moveBinary(){
		
		int a=-3;
		System.out.println("a 非的结果是："+(~a));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(2^3);
		 System.out.println (15 & ~11);
		 
		 System.out.println(64>>>6);
		 
		 int d = Integer.parseInt("‭‭1111111111111111111111111111111111111111111111111111111111111101‬‬", 2);//进制转10进制
		 System.out.println(d);
	}
//	0000 0000 0000 0000 0000 0000 0000 0010
	
}
