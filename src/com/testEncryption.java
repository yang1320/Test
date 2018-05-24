package com;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import net.sf.json.JSONArray;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.tool.Base64EncoderUtf8;
import com.tool.Encryption;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import sun.security.provider.MD5;
public class testEncryption {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public  void testBase64Encoder() throws NoSuchAlgorithmException, IOException{
	
		BASE64Encoder  be=new  BASE64Encoder();
		BASE64Decoder  bd=new  BASE64Decoder();
		//Base64EncoderUtf8  be=new  Base64EncoderUtf8();
		
		byte[] bz=new byte[]{1,-127,13,1,-127,13};
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 byte[] mdbz= md.digest("test".getBytes());
		
		
		System.out.println("bzEncoding:"+be.encode(bz));
		System.out.println("bdEncoding:"+new String(bd.decodeBuffer(be.encode("test".getBytes()))));

		System.out.println("bz:"+bz);
		
		System.out.println("===="+"test".getBytes());
		System.out.println("mdbz:"+be.encode(mdbz));
		System.out.println("mdbz1:"+new String(mdbz,"utf-8"));

		
	//	getInstance("MD5");	
		
/*		
bzEncoding:AYENAYEN
bdEncoding:test
bz:[B@2ef1e4fa
====[B@306a30c7
mdbz:CY9rzUYh03PK3k6DJie09g==
mdbz1:	�k�F!�s��N�&'��
*/		
		
		
		
		
	}
	
	@Test
	public void showProviders(){
		 System.out.println(JSONArray.fromObject(Security.getProviders()));
	}

	
	
	public void Securit() throws NoSuchAlgorithmException, IOException{
		System.out.println("Hashing.md511()\t"+Hashing.md5().hashString("123456", Charsets.UTF_8));
		System.out.println("Encryption\t"+Encryption.encryption("123456"));
		MessageDigest md=MessageDigest.getInstance("MD5");
		BASE64Decoder bd=new BASE64Decoder();
		System.out.println("decodeBuffer\t"+new String(bd.decodeBuffer(Encryption.encryption("123456"))));
		System.out.println("digest\t"+new String(md.digest("test".getBytes()),"ISO-8859-1"));
		
/*		Hashing.md5()	098f6bcd4621d373cade4e832627b4f6
		Encryption	4QrcOUm6Wau+VuBX8g+IPg==
		decodeBuffer	�
		�9I�Y��V�W��>
		digest		kÍF!ÓsÊÞN&'´ö
		*/
	}
}
