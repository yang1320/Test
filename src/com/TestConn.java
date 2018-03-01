/*jadclipse*/// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.

package com;

import java.io.PrintStream;
import java.sql.*;

public class TestConn
{

    public TestConn()
    {
    }

    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://123.207.16.83:3306/test1", "root", "1320");
            System.out.println((new StringBuilder("123.207.16.83链接为：")).append(conn).toString());
            for(ResultSet rs = conn.prepareStatement(" select count(*) from emp ").executeQuery(); rs.next(); System.out.println((new StringBuilder("emp 统计总数：")).append(rs.getInt(1)).toString()));
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "1320");
            System.out.println((new StringBuilder("本地链接为：")).append(conn).toString());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}


/*
	DECOMPILATION REPORT

	Decompiled from: C:\Users\yang\Desktop\test.jar
	Total time: 123 ms
	Jad reported messages/errors:
	Exit status: 0
	Caught exceptions:
*/