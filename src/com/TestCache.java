/*jadclipse*/// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.

package com;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.*;

public class TestCache
{

    public TestCache()
    {
    }

    public static void main(String args1[])
    {
    }

    public void cache()
    {
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().withCache("preConfigured", CacheConfigurationBuilder.newCacheConfigurationBuilder(java/lang/Long, java/lang/String, ResourcePoolsBuilder.heap(10L))).build();
        cacheManager.init();
        Cache preConfigured = cacheManager.getCache("preConfigured", java/lang/Long, java/lang/String);
        Cache myCache = cacheManager.createCache("myCache", CacheConfigurationBuilder.newCacheConfigurationBuilder(java/lang/Long, java/lang/String, ResourcePoolsBuilder.heap(10L)));
        myCache.put(Long.valueOf(1L), "da one!");
        String value = (String)myCache.get(Long.valueOf(1L));
        cacheManager.removeCache("preConfigured");
        cacheManager.close();
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