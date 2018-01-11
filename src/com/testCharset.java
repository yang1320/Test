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

}
