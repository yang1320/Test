package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.junit.Test;

import com.tool.FormateDate;

public class testIO {
	
	
	
	public static void main(String[] args) throws IOException {

			new testIO().flushCache();
			//	System.out.println("hello world!".getBytes().length);
	}
	
	@Test
	public void  IO(){
		File file=new File("/new.txt");
		
	}
	
	@Test
	public void read() throws IOException{
		File file=new File("E:\\Users\\yang\\workspace\\Test\\src\\read.txt");
		FileReader fr=new FileReader(file);
		char[] cz=new char[]{};
		fr.read(cz);
		System.out.println(new String(cz));
		
	
		
	}
	
	
	public static void write() throws IOException{
		File fileIn=new File("E:/temp/new.txt");
		InputStream in=new FileInputStream(fileIn);
		System.out.println("获取文件长度："+fileIn.length());
		File fileOut=new File("E:/temp/new1.txt");
		OutputStream out=new FileOutputStream(fileOut);
		
		int readSize=0;
		byte[] bz=new byte[100]; 
		while((readSize=in.read(bz))!=-1){	//每次读取一定字节数填充缓存字节数组，填满后进行下次读取。read（）单向移动读取
			out.write(bz, 0, readSize);
			System.out.println(readSize);
		}
		  in.close();
	      out.close();
		System.out.println("操作结束！");
		
	}
	
	
	//缓存刷新耗时测试
	public void flushCache() throws IOException{
		FileOutputStream fos=new FileOutputStream(new File("source/flush.txt"));
		int count=0;
		System.out.println("begin:"+FormateDate.getTime());
		while(true){
			fos.write("hello world!".getBytes());
			if(count%30==0){
				fos.flush();
			}
			if(count++==1000000){
				break;
			}
		}

		System.out.println("刷新后："+FormateDate.getTime());
		fos.close();
		System.out.println("写入测试成功！");
		
		File file1=new File("source/flush.txt");
		System.out.println(file1.length());
		
	}
	
}
