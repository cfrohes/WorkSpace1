package com.JDBC.transaction;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Moneytransper {
	public static void main(String[] args) {
		
	Connection con = null;
//	PreparedStatement pstmt1 = null;
//	PreparedStatement pstmt2 = null;
ResultSet rs = null;
	CallableStatement cs = null;
	Scanner sc = new Scanner(System.in);
//	String sql1 = "update ucucbank set balance=balance-? where accNo=?";
//	String sql2 = "update ucucbank set balance=balance+? where accNo=?";
	String sql = "call hello(?)";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodbk?user=root&password=root");
		cs = con.prepareCall(sql);
		System.out.println("Enter the account number to fetch the details--");
		int accNo = sc.nextInt();
		cs.setInt(1,  accNo);
		boolean res = cs.execute();
		if(res == true) {
			
			 rs=cs.getResultSet();
			 while(rs.next()) {
				 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) );
			 }
		}
		else {
			System.out.println(cs.getUpdateCount());
		}
		con.close();
		cs.close();
		
//		pstmt1 = con. prepareStatement(sql1);
//		pstmt2 = con.prepareStatement(sql2);
		//System.out.println("Enter from AccoNo , ToAccNo and Amount to transefer:");
		int fan = sc.nextInt();
		int tan = sc.nextInt();
		int amount = sc.nextInt();
//		pstmt1.setInt(1, amount);
//		pstmt1.setInt(2, fan);
//		pstmt2.setInt(1, amount);
//		pstmt2.setInt(2, tan);
//		
		//con.setAutoCommit(false);
//		int nora = pstmt1.executeUpdate();
//		System.out.println(nora + "(row)s affected.");
//		
//		nora = pstmt2.executeUpdate();
//		System.out.println(nora + "(row)s affected.");
		//con.commit();
		
		
		con.close();
//		pstmt1.close();
//		pstmt2.close();
		sc.close();
		
	}catch(Exception e) {
		
		try {
			con.rollback();
		}catch(Exception l) {
			e.printStackTrace();
			
		}
		//e.printStackTrace();
	}
	}
	}
