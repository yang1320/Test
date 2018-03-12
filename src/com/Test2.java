package com;

import java.net.URL;
import java.util.Random;

import org.junit.Test;

import com.bean.Emp;

import net.sf.ehcache.CacheManager;
import net.sf.json.JSONObject;


public class Test2 {
	public static void main(String[] args) throws InterruptedException  {
		//		4/7
		while(true){
			System.out.println((5*1000*60*60+new Random().nextInt(2*1000*60*60))/3);
			Thread.sleep(2*1000);
		}
		
		
	}
	
	static boolean re(){
		System.out.println("into!");
		return true;
		
	}
	
	@Test
	public void testCalc() {
		System.out.println((double)7930111/3600/1000);
		
	}
}
