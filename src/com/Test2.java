package com;

import java.net.URL;

import com.bean.Emp;

import net.sf.ehcache.CacheManager;
import net.sf.json.JSONObject;


public class Test2 {
	public static void main(String[] args)  {
		CacheManager singletonManager = CacheManager.create();
		System.out.println(JSONObject.fromObject(singletonManager));
	}
}
