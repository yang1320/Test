package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


public class testArrayAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
	
		System.out.println(list instanceof Iterable);
	}
	
	@Test
	public void testContains(){
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("1", 2);
		System.out.println(map.values().contains(1));
		
	}
	
	@Test
	public void  testSet(){
		Set set=new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println("set.size:"+set.size());
		
		
	}
	
	@Test
	public  void arrayAndListConvert(){
		int[] intsz=new int[]{1,2,3};
		List intList=Arrays.asList(1,2,3);
		System.out.println("原始："+intsz);
		System.out.println("集合："+intList);
		
		for (Object object : intList) {
			System.out.println("------:"+object);
		}
		System.out.println("数组："+intList.toArray());
		
		/**
		 * 原始：[I@27fa135a
			集合：[1, 2, 3]
			------:1
			------:2
			------:3
			数组：[Ljava.lang.Integer;@46f7f36a

		 */
		
		
	}

	@Test
	public void testOfArrList(){
		Integer[] intarr=new Integer[]{1,2};
		List list = Arrays.asList(intarr);
		List<Object> obj=Arrays.asList(new Object());
		System.out.println("判断对象是否为数组:\t"+list.getClass().isArray());//仅数组时为true;集合为false
		System.out.println("ss"+list.get(0));
		for (Integer integer : intarr) {
			System.out.println(integer);
		}
	}
	
	
}
