package com;

import org.junit.Test;

public class TestBitOperator {

	public static void main(String[] args) {

	}

	/**
	 * 数值各种进制的声明方式
	 */
	public static void declare() {
		int a = 0b11; // 声明二进制变量
		int b = 011; // 声明八进制变量
		int c = 11; // 声明十进制变量
		int d = 0x11; // 声明十六进制变量
		System.out.println("a：" + a); // 3
		System.out.println("b：" + b); // 9
		System.out.println("c：" + c); // 11
		System.out.println("d：" + d); // 17
	}

	/**
	 * 幂计算
	 * 
	 * @param a
	 * @param b
	 * @return a的b次方结果；参数、返回值均为double类型
	 */
	public static double pow(double a, double b) {
		return Math.pow(a, b);
	}

	@Test
	public void show() { // public void name()固定格式
		System.out.println("");
	}

	public static void show1() {
		System.out.println(13 * pow(16, 1) + 15);
		Object obj = 0xDF;
		// Integer.toBinaryString(i)
		System.out.println("10转为Binary：\t" + Integer.toBinaryString(10));
		System.out.println("11转为Binary：\t" + Integer.toBinaryString(11));
		System.out.println("10 & 11 2进制结果：\t" + (10 | 11));
		System.out.println("obj类型获取:" + obj);

		int i = 15;
		System.out.println("十进制15对应的二进制为：" + Integer.toBinaryString(i)); // 1111
		System.out.println("十进制15对应的八进制为：" + Integer.toOctalString(i)); // 17
		System.out.println(i); // 15
		System.out.println("十进制15对应的十六进制为：" + Integer.toHexString(i)); // f
	}

	public void byteToInt() {
		char c = 'A';
		System.out.println((int) c);

		char b = 65;
		System.out.println(b);
	}
}
