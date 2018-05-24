package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;

import org.junit.Test;


public class testArrayAndList {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(1);
		list.add("a");
		list.add('c');
		list.add(new Object());
		System.out.println(list instanceof Iterable);
		System.out.println(list);
		/**
		 * true
			[1, a, c, java.lang.Object@15db9742]
		 */
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
	
	@SuppressWarnings("all")//无法消除编译时错误
	@Test
	public void testQueue(){
		Queue dq=new ConcurrentLinkedQueue();
		dq.add("1");
		dq.add('是');
		dq.addAll(Arrays.asList(new int[]{1,2}));
		
		for (Object object : dq) {
			System.out.println("bq遍历："+object);
		}
		
		System.out.println(dq.toArray());
	}
	
	@SuppressWarnings("all")
	@Test//测试集合数组转换后的数据内部结构
	public void testListType(){
		
		Collection set=new HashSet();
		set.add(1);
		Collection hs=new HashSet<Integer>();
		System.out.println("hs类型："+hs.getClass());
		System.out.println("添加结果："+Collections.addAll(hs, 1,1,1,1,"12k"));
		for (Object object : hs) {
			System.out.println("hs遍历："+object);
		}
		System.out.println(set.getClass());
		//对象的实际类型由赋予的类型决定而不是申明的类型;编译时对应的申明类型，使用时（程序运行时）使用的是赋予的类型。
//		泛型的约束，是由编译时确定而不是运行时。
		Object[] setSz=set.toArray();
		System.out.println("set 数组："+setSz);
		
		ArrayList setAl=(ArrayList)set;
		System.out.println("set 集合："+setAl);
		
		/**
		 * class java.util.HashSet
			set 数组：[Ljava.lang.Object;@68de145
		
		 */
		
	}
	
	//	泛型的约束，是由编译时(申明阶段)确定而不是运行时。
	@Test
	public void testType(){

		Collection<Integer> hsc=new HashSet<Integer>();
		System.out.println("hsc类型:"+hsc.getClass());
		hsc.add(1);
		hsc.add(4);
		/*hsc.add(a11);*/ // 基本类型可以自动转换，封装类型不会进行自动转换 
		for (Object object : hsc) {
			System.out.println("hsc:\t "+object);
		}
	}
	
	@Test//Arrays.asList产生的list对象会使用底层的数组作为其物理实现。
		//	进行涉及集合的操作时，基本类型最好使用其服装类型
	public void testArrays(){
		Integer[] a=new Integer[]{1,2,3,4};
		
		int b=1;
		int[] c={1,2};
		List<Integer> lint=Arrays.asList(a);
		
		System.out.println("lint:"+lint);
		
		//对集合元素反向排序后，因其底层实现与原数组关联，所以导致原数组的元素顺序改变
		lint.sort(Collections.reverseOrder());
		
		for (Integer integer : a) {
			System.out.println("a:"+integer);
		}
		System.out.println("集合本身："+lint);

		System.out.println("数组元素字符串可视化："+Arrays.toString(a));
		
		String[] ssz={"1","2","a","B","A","c"};
		
		System.out.println("ssz:"+ssz);
		System.out.println("ssz元素字符串可视化:"+Arrays.toString(ssz));
		List<String> sl=Arrays.asList(ssz);
		
		Collections.sort(sl);
		System.out.println("ssz排序后:"+sl);
		System.out.println("a:"+a);
		
		//Arrays.asList()会产生一个list基于一个固定大小的数组；
//		当对底层数据结构尺寸进行修改时发生异常！
		System.out.println(sl.add("a"));
	}
	
	/**
	 * 
	 * @Title: testSort   
	 * @Description: TODO(集合排序)        
	 * @param: 	 
	 * @return: void      
	 * @throws
	 */
	@Test
	 public void testSort(){
		 ArrayList<String> strAl=new ArrayList<String>();
			strAl.add("b");
			strAl.add("a");
			strAl.add("c");
			strAl.add("1");
			strAl.add("5");
			strAl.add("3");
			System.out.println("--strAl排序前--");
			for (String str: strAl) {
				System.out.println("strAl element:"+str);
			}
			
	        Collections.sort(strAl, new Comparator<String>() {    
	            @Override    
	            public int compare(String o1, String o2) {    
	                return o2.compareTo(o1);    
	            }    
	        });
	        
			System.out.println("--strAl排序后--");
			for (String str: strAl) {
				System.out.println("strAl element:"+str);
			}
	 }
	
	
}
