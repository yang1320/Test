/*jadclipse*/// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.

package com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.Emp;
import com.tool.FormateDate;

import net.sf.ehcache.*;
import net.sf.json.JSONObject;


public class TestCache
{

		private static 	CacheManager cacheManager=null;
		static{
			try {
				cacheManager=CacheManager.create(new FileInputStream(new File("source/ehcache.xml")));
			} catch (CacheException | FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}

    public TestCache()
    {
    	
    }

    public static void main(String args1[]) throws CacheException, FileNotFoundException 
    {
    	ApplicationContext ac= new FileSystemXmlApplicationContext("source/applicationContext.xml");
    	System.out.println("简单ben:"+ac.getBean("testCache"));
    }

    public void cache()
    {

    }
    
    /**
     * 
     * @Title: flushCache   
     * @Description: TODO(刷新缓存 仅对增删改操作)        
     * @param: @param name 缓存名称
     * @param: @param elmentName 节点名称（缓存键）
     * @param: @param obj 缓存值
     * @return: void      
     * @throws
     */
    public void flushCache(String name,String elmentName,Object obj){
    	cacheManager.getCache(name).put(new Element(elmentName, obj));
    }
    
    public void addCache(String name,String elmentName,Object obj){
    	cacheManager.getCache(name).put(new Element(elmentName, obj));
    }
    
    public void updateCache(String name,String elmentName,Object obj){
    	cacheManager.getCache(name).put(new Element(elmentName, obj));
    }
    
    public Object showCache(String name,String elmentName){
    	Cache  cache=cacheManager.getCache(name);
    	Element el=cache.get(elmentName);
    	System.out.println("===="+cache+":"+el);
      	System.out.println("显示的cache值为："+cacheManager.getCache(name).get(elmentName).getObjectValue());
      	 
    	return el.getObjectValue();
    }
    
    public Set getMakeSet(){
    	Set set=new HashSet<Emp>();
    	for (int i = 0; i < 10000; i++) {
			Emp emp=new Emp("张三"+i, i);
			set.add(emp);
		}
       	for (int i = 0; i < 1000; i++) {
    			Emp emp=new Emp("李四"+i, i);
    			set.add(emp);
    		}
       	return set;
    }
    
    /**
     * @param elmentName 
     * @param name 
     * 
     * @Title: testClearCache   
     * @Description: TODO(测试清除某一缓存)        
     * @param: 	 
     * @return: void      
     * @throws
     */
    public static void testClearCache(String name, String elmentName){
    	cacheManager.getCache(name).remove(elmentName);
    }
    
    @Cacheable(value="TestCache",key="#pa")
    public String getCacheStr(String pa){
    	System.out.println("into 111!");
    	return "111!";
    }
}


/*
	DECOMPILATION REPORT

	Decompiled from: C:\Users\yang\Desktop\test.jar
	Total time: 79 ms
	Jad reported messages/errors:
	Exit status: 0
	Caught exceptions:
*/