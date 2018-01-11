package com;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableFont.FontName;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class testExcel {
		/**
		 * *Excel是我们平时工作中比较常用的用于存储二维表数据的，JAVA也可以直接对Excel进行操作，
		 * 介绍两种操作Excel的方式，分别为：jxl和poi。
		 * 
		 * @param args
		 * @throws InvocationTargetException 
		 * @throws IllegalArgumentException 
		 * @throws IllegalAccessException 
		 * @throws ClassNotFoundException 
		 * @throws SecurityException 
		 * @throws NoSuchMethodException 
		 * @throws WriteException 
		 * @throws RowsExceededException 
		 * @throws IOException 
		 * @throws BiffException 
		 */
	
	
	 
		public static void main(String[] args) throws RowsExceededException, WriteException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, BiffException {
		// TODO Auto-generated method stub

			//new testExcel().write();
			new testExcel().read();
			

	}
		
	
	public  void write() throws RowsExceededException, WriteException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException{
		List<Student1> sl=new ArrayList<Student1>();
		
		Student1 stu1=new Student1();
		stu1.setAge(11);
		stu1.setName("name1");
		stu1.setSs(new Long(1));
		
		Student1 stu2=new Student1();
		stu2.setAge(12);
		stu2.setName("name2");
		stu2.setSs(new Long(2));

		
		Student1 stu3=new Student1();
		stu3.setAge(13);
		stu3.setName("name3");
		stu3.setSs(new Long(3));
		sl.add(stu1);
		sl.add(stu2);
		sl.add(stu3);
		
		//Student.class.getFields()[0].getName();
		List<String> list=new ArrayList<String>();
		Field[] field =Student1.class.getDeclaredFields();
		 List<Field> lf=Arrays.asList(field);
		for (Field fields :lf) {
			list.add(fields.getName());
		}
		list.remove("serialVersionUID");

 		
		File fExcel=new File("E://test//tExcel.xls");
		if(!fExcel.exists()){
			fExcel.createNewFile();
		}

			WritableWorkbook workBook=Workbook.createWorkbook(fExcel);
			WritableSheet sheet=workBook.createSheet("firstSheet", 0);
			for (int k=0;k<list.size();k++) {
				WritableCellFormat wcf=new WritableCellFormat(new WritableFont(WritableFont.createFont("华文行楷"),14, WritableFont.BOLD, false));
				sheet.addCell(new Label(k,0,"标题"+k,wcf));
			}
			
			
			for (int i=0;i<sl.size();i++) {
				for (int k=0;k<list.size();k++) {
					Class<Student1> clz=(Class<Student1>) Class.forName("com.Student1");
					
						Method m = clz.getMethod("get"+formateField(list.get(k)), new Class[]{});
						sheet.addCell(new Label(k,i+1,m.invoke(sl.get(i), new Object[]{}).toString()));

					
				}
				  
			}
			workBook.write();
			workBook.close();
			System.out.println("操作成功！");
		     
	}
	
	public String formateField(String name){
		
		return new StringBuilder().append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).toString();
		
	}
	
	public void read() throws BiffException, IOException{
		File fExcel=new File("E://test//tExcel.xls");
		
		Workbook wwb=Workbook.getWorkbook(fExcel);
		Sheet[] sheets=wwb.getSheets();
		
		List<Student1> ls=new ArrayList<Student1>();
		for (Sheet sheet : sheets) {
			int rows=sheet.getRows();
			//int cols=sheet.getColumns();
			
			for (int i=0;i<rows-1;i++) {
				Student1 stu=new Student1();
				int k=0;//起始列
				//for (int k=0;k<cols;k++) {
					stu.setName(sheet.getCell(k,i+1).getContents());//i起始行，i+1从第二行开始读取有效数据
					stu.setAge(Integer.valueOf(sheet.getCell(k+1,i+1).getContents()));
					stu.setSs(Long.valueOf(sheet.getCell(k+2,i+1).getContents()));
					ls.add(stu);
				//}
			}
		}
		
		for (Student1 student1 : ls) {
			System.out.println(student1);
		}
	}

}
