package com;

import java.io.IOException;

import net.sf.json.JSONObject;

public class TestCMD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Object obj=Runtime.getRuntime().exec("ipconfig/all");
		System.out.println("cmd执行结果：\t"+JSONObject.fromObject(obj));
	}

}
