package com;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;







import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;


public class TestJson {
	public static void main(String[] args) {
//		System.out.println(JSONObject.fromObject("{'name':'fly'}"));
		jsonToMap();
	}
	
	
	public static void jsonToMap(){
		String mapString="{'name':'fly','name1':'fly1','name2':"+null+"}";
		
		System.out.println(mapString);
		Map map=JSONUtils.getProperties(JSONObject.fromObject(mapString));
		
		System.out.println(map);
		
		
		System.out.println("_------------------------------");
		
		Map map1=new HashMap();
		
		map1.put("name", "1");
		map1.put("name2", "2");
		map1.put("name3", null);
		
		
		System.out.println(JSONObject.fromObject(map1));
	}
	
	@Test
	public void jsonConvert(){
		//String str="{name=fly,type=aa}";
		String str="{\"name\":\"fly\",\"type\":\"虫子\",\"test\":[{\"name\":\"fly\",\"type\":\"虫子\"}]}";
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("v1", "v1");
		map.put("v3", "v3");
		map.put("v2", "v2");
		
	
		Student stu=new Student();
		stu.age=10;
		stu.name="ss";
		stu.show();
		//String str="{\"firstName\": \"Brett\"}";
		Object obj = JSONObject.fromObject(str);
		
		System.out.println(obj);
		//System.out.println(((Map)obj));
	}
	static class Student{
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		public String name="bb";
		public int age=18;
		
		public void show(){
			System.out.println(this.name);
		}
		public Student(String name,int age) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.age=age;
		}
//		@Override
//		public String toString() {
//			return "Student [name=" + name + ", age=" + age + "]";
//		}
		
	}
	
	
	public String toJson(Object object) throws Exception{
		String jsonString;
		if (object==null)
			throw new Exception("the target can not be null!");
				
		try {
			if(object instanceof Iterable || object.getClass().isArray() ){ 
				jsonString=JSONArray.fromObject(object).toString();
			}else{
				jsonString=JSONObject.fromObject(object).toString();
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("json convert error!");
		}

		return jsonString;
	}
}
