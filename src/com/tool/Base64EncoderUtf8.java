package com.tool;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.misc.BASE64Encoder;
import sun.misc.CharacterEncoder;


public class Base64EncoderUtf8 extends BASE64Encoder {

	@Override
	 public String encode(byte abyte0[])
	    {
	        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
	        String s = null;
	        try
	        {
	            encode(((InputStream) (bytearrayinputstream)), ((OutputStream) (bytearrayoutputstream)));
	            s = bytearrayoutputstream.toString("UTF-8");
	        }
	        catch(Exception exception)
	        {
	            throw new Error("CharacterEncoder.encode internal error");
	        }
	        return s;
	    }
}
