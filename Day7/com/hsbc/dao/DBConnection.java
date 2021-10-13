package com.hsbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBConnection {

	public static Connection establishedConnection() throws SQLException,ClassNotFoundException{
		Class.forName(Driver.class.getName());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbcdb","root","Pooja");
		return con;
	}
}
