package com.publicissapient.programs;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class P14_OpenDbConnection {

	public static void main(String[] args) throws SQLException {
		
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while(drivers.hasMoreElements()) {
			Driver d=drivers.nextElement();
			System.out.println(d.getClass().getName());
		}
		String url = "jdbc:mysql://localhost:3306/northwind";
		String username = "root";
		String password = "Welcome#123";
		
		url = "jdbc:h2:tcp://localhost/~/PS_Training";
		username = "sa";
		password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Got a connection of type: " + conn.getClass().getName());
	}
}
