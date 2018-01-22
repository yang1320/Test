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
            Connection conn = DriverManager.getConnection("jdbc:mysql://118.89.25.163:3306/test1", "root", "123456");
            System.out.println((new StringBuilder("118.89.25.163\u8FDE\u63A5\uFF1A")).append(conn).toString());
            for(ResultSet rs = conn.prepareStatement(" select count(*) from emp ").executeQuery(); rs.next(); System.out.println((new StringBuilder("emp \u603B\u6761\u6570\uFF1A")).append(rs.getInt(1)).toString()));
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "123456");
            System.out.println((new StringBuilder("\u672C\u5730\u8FDE\u63A5\uFF1A")).append(conn).toString());
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