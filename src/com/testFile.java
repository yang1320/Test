package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:/test/testCreateFile.txt");
		//file.createNewFile();
		FileOutputStream out=new FileOutputStream(file);
		
		System.out.println(file);
		
	}

}
