package com;

import interfaceAndExtends.Interface1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bean.Company;
import com.bean.Emp;
import com.bean.Sex;
import com.yangfeiself.tool.JsonConvert;





public class Test1 {
	

	public static void main(String[] args) throws InterruptedException{
		Emp emp=new Emp();
		emp.setSex(Sex.man);
		Company c=new Company();
		c.setEmp1(emp);
		System.out.println(c);
	}
	

}
	

