package com.Mavan.FirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      try {
    	  
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodbk?user=root&password=root");
    	  stmt = con.createStatement();
    	  rs = stmt.executeQuery("select * from ucucbank");
    	  while(rs.next()) {
    		  System.out.println(rs.getInt(1) +" " + rs.getString(2) + " " + rs.getInt(3));
    	  }
    	  
    	  con.close();
    	  stmt.close();
    	  rs.close();
      }catch (Exception e) {
		e.printStackTrace();
	}
      
    }
}
