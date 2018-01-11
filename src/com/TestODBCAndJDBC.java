package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import net.sf.json.JSONObject;
//import sun.jdbc.odbc.JdbcOdbcDriver; jdk1.7对应类

public class TestODBCAndJDBC {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		jdbc();
		odbc();
	}
	
	/**
	 *  jdk 1.8 不在使用odbc方式。如果仍要使用需还jdk1.8之前的版本 
	 *  
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void odbc() throws SQLException, ClassNotFoundException {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Properties p = new Properties();  
        p.put("charSet", "GBK"); 
        p.put("user", "system");
        p.put("password", "Accp1234");
		Connection conn= DriverManager.getConnection("jdbc:odbc:"+"oracleodbc",p);  
		
		PreparedStatement pst=conn.prepareStatement("select '中' from dual ");
		ResultSet rs=pst.executeQuery();
		while (rs.next()) {
			System.out.println("查询结果："+rs.getObject(1));
		}
		pst.close();
		conn.close();
	}
	
	public static void jdbc() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException{
		
		Class.forName("oracle.jdbc.OracleDriver");
		Properties p = new Properties();  
		p.load(new FileInputStream(new File("source/conn.properties")));
		Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl",p);  
		
		PreparedStatement pst=conn.prepareStatement("select 'ッ' from dual ");
		ResultSet rs=pst.executeQuery();
		while (rs.next()) {
			System.out.println("查询结果："+rs.getObject(1));
		}
		pst.close();
		conn.close();
	}

}
