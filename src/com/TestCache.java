/*jadclipse*/// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.

package com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import net.sf.ehcache.*;
import net.sf.json.JSONObject;


public class TestCache
{

    public TestCache()
    {
    	
    }

    public static void main(String args1[]) throws CacheException, FileNotFoundException 
    {
    	CacheManager cacheManager=CacheManager.create(new FileInputStream(new File("source\\ehcache.xml")));
    	System.out.println(cacheManager.getCache("HelloWorldCache").getDiskStoreSize());
    	
    }

    public void cache()
    {

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