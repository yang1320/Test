package com;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;










import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;




public class Test1 {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(JSONArray.fromObject(args));
		String target=new String(("hello").getBytes(),"ISO8859-1");
		System.out.println(JSONArray.fromObject(target.getBytes("utf-8")));
		System.out.println(JSONArray.fromObject(target.getBytes("gbk")));
		System.out.println(JSONArray.fromObject(target.getBytes("ISO8859-1")));
		
		System.out.println("-----------中文及其它字符------------");
		String target1=new String(("ㆎヅ즈").getBytes("utf-8"),"utf-8");// ㆎ为韩语
		System.out.println("target1:\t"+target1);
		System.out.println(JSONArray.fromObject(target1.getBytes("utf-8")));
		System.out.println(JSONArray.fromObject(target1.getBytes("gbk")));
		System.out.println(JSONArray.fromObject(target1.getBytes("ISO8859-1")));
		System.out.println(JSONArray.fromObject(target1.getBytes("Unicode")));
	
		System.out.println("-----------分割线------------");
		System.out.println(JSONArray.fromObject("中".getBytes("utf-8")));
		System.out.println(JSONArray.fromObject("中".getBytes("gbk")));
		System.out.println(JSONArray.fromObject("中".getBytes("ISO8859-1")));
		System.out.println(JSONArray.fromObject("中".getBytes("Unicode")));
		
		 
	}

	
	
	


}
