package com.chase;

import java.sql.*;

public class Db{
    protected Connection conn=null;
    protected Statement stmt=null;
    protected ResultSet rs=null;
    private String username="root";//用户名
    private String password="123456";
    private String sql = "SELECT * FROM timesection_copy;";


    public int init() throws Throwable {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn= DriverManager.getConnection("jdbc:mysql://env.finedevelop.com:55703/directtest?zeroDateTimeBehavior=convertToNull"  ,username, password);
        stmt=conn.createStatement();
        return 0;
    }
    public int action() throws Throwable {
        rs=stmt.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        String println = "";
        for (int i = 1; i <= columnsNumber; i++) {
            println += rsmd.getColumnName(i)+"\t";
        }
        System.out.println(println);
        while (rs.next()) {
            println = "";
            for (int i = 1; i <= columnsNumber; i++) {
                String columnValue = rs.getString(i);
                println += columnValue+"\t";
            }
            System.out.println(println);
        }

        return 0;
    }
    public int end() throws Throwable {
        stmt.close();
        conn.close();
        return 0;
    }

    public static void main(String[] args) {
        Db dbtest = new Db();
        try {
            dbtest.init();
            dbtest.action();
            dbtest.end();
        }catch (Exception e){
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
