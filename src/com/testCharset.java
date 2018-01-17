package com;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

import net.sf.json.JSONArray;


public class testCharset {
	public static void main(String[] args) throws UnsupportedEncodingException {
		testEncoding();
		byte[] bz=new byte[]{104,101,108,108,111};
		
		System.out.println("ISO8859-1:"+new String(bz,"ISO8859-1") );
		System.out.println("UTF-8:"+new String(bz,"UTF-8") );
		System.out.println("GBK:"+new String(bz,"GBK") );

	}
	
	public static void testEncoding() throws UnsupportedEncodingException{
		String target=new String(("hello").getBytes(),"ISO8859-1");
		System.out.println(JSONArray.fromObject(target.getBytes()));
	}
	
	public static void getCharsetName() {
		 Set names=Charset.availableCharsets().keySet();
	      for (Iterator iter = names.iterator(); iter.hasNext();) {
	          String charsetName = (String) iter.next();
	          if(Charset.isSupported(charsetName)){
	              System.out.println(charsetName);
	         }
	     }
	}

	
	public void encoding() throws UnsupportedEncodingException{
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
