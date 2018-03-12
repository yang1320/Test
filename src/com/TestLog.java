package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class TestLog {
	
//	static{
//		try {
//			System.out.println(new FileInputStream(new File("log4j.properties")));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String path = TestLog.class.getClass().getResource("/")
//                .getPath()
//                + "log4j.properties";
//        //String path="config/log4j.properties";
//        System.out.println("log4j configfile path=" + path);
//        PropertyConfigurator.configureAndWatch(path);
//	}
//	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream logInstream=TestLog.class.getResourceAsStream("log4j.properties");
        System.out.println("流："+JSONObject.fromObject(logInstream));

        Properties pro = new Properties();
        
        pro.load(logInstream);
        logInstream.close();
		PropertyConfigurator.configure(pro);
	
		Logger log = Logger.getLogger(TestLog.class);
		
		System.out.println("log属性："+log.getPriority());
		log.debug("debug!");
		log.info("jhhhhh!");
	}

	/**
	 * 
	 */
	@Test
	public void toFile(){
		
	}
	
	@Test
	public void toDadaBase(){
		
	}
}
