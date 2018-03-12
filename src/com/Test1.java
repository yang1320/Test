package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;





public class Test1 {
	
	public static Map map=new HashMap();
	public static int b=map.size();
	public static void main(String[] args){
		
		b=5;
		map.put("a", "");
		map.put("a1", "");
		// B 值保留	map.put("a2", "");		// B 值保留
		System.out.println(map.size());
		System.out.println(b);
		// B 值保留
	}
	

}
	

