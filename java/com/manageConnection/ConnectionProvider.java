package com.manageConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	
  public static Connection getConnection()
  {
	 try {
		 
		return
				DriverManager.getConnection("jdbc:mysql://localhost:3306/prachi","root","MySQL");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	 
	  
  }
}
