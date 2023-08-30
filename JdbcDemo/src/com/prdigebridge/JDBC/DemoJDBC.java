package com.prdigebridge.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			//1 Load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2 Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Ember_2021");
			
			//3 createStatement mostly used for SQL queries
			Statement st=con.createStatement();
			
			st.execute("create table student(stdId int,stdName varchar(20))");
			
			con.close();
			System.out.println("table is created sucessfully");
	}

}
