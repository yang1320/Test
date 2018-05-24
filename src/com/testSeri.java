package com;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.bean.Emp;




public class testSeri {
	public static void main(String[] args) throws Exception {
		
		//		new testSeri().testSerializable();
//		new testSeri().testDeSerializable();
		
//		new testSeri().SerializeByXml();
//		new testSeri().DeSerializeByXml();
		
		//new testSeri().testReflect(new Student1());
		   ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("E:\\test\\test1.txt"));
	   Student1 stu=new Student1();
	   System.out.println(stu);
		   out.writeObject(stu);
		   System.out.println(stu);
		   out.writeObject(11111111);
	}
	
	
    //序列化
    public void testSerializable() throws IOException{
    	Student1 stu1=new Student1();
    	stu1.setAge(13);
    	stu1.setName("张三");
    	stu1.setSs(Long.valueOf("1"));
    	//File file=	new File("E:\test\testSerializable.txt");
    	//file.createNewFile();
    	FileOutputStream outStream=new FileOutputStream(new File("E:\\test\\testSerializable.txt"));
    	
    	ObjectOutputStream objOutputStream=new ObjectOutputStream(outStream);
    	
    	objOutputStream.writeObject(stu1);
    	
    	System.out.println("写入成功！");
    
    	
    	
    	
    	
    }
    
    //反序列化
    public void testDeSerializable() throws ClassNotFoundException, IOException{
    	File file=new File("E:/test/testSerializable.txt");
    	FileInputStream inStream=new FileInputStream(file);
    	
    	ObjectInputStream objInputStream=new ObjectInputStream(inStream);
    	System.out.println((Student1)objInputStream.readObject());
    	System.out.println("读取成功!");
    	
    	
    }
    
    
    public void SerializeByXml() throws IOException{
    	Emp emp1=new Emp("张三", 18);
    	Emp emp2=new Emp("李四", 20);
    	Emp emp3=new Emp("王五", 22);
    	List<Emp> empList=new  ArrayList<Emp>();//Arrays.asList(new Emp[]{emp1,emp2,emp3});
    	empList.add(emp1);
    	empList.add(emp2);
    	empList.add(emp3);
    	
    	
    	OutputStream out=new FileOutputStream(new File("source/empList.xml")); 
    	XMLEncoder xe=new XMLEncoder(out);
    	xe.writeObject(empList);
    	xe.close();
    	System.out.println("写入成功");
    	
    }
    
    public void DeSerializeByXml() throws IOException{
    	InputStream in=new FileInputStream(new File("source/empList.xml")); 
    	XMLDecoder xd=new XMLDecoder(in);
    	List list=(List) xd.readObject();
//    	Object obj= xd.readObject();
    	xd.close();
    	System.out.println(JSONArray.fromObject(list));
//    	System.out.println(JSONObject.fromObject(obj));//obj本质为元素集合，虽然类型为Object同样报错
    	System.out.println("输出成功！");   
    }
}
