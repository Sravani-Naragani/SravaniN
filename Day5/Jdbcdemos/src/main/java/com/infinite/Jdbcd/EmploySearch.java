package com.infinite.Jdbcd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No ");
		empno = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/infinite","root","india@123");
			String cmd = "select * from Employ where empno=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				System.out.println("Employ No "+rs.getInt("empno"));
				System.out.println("Name "+rs.getString("name"));
				System.out.println("Department "+rs.getString("dept"));
				System.out.println("Designation "+rs.getString("desig"));
				System.out.println("Basic "+rs.getInt("basic"));
			}else{
				System.out.println("*RECORD NOT FOUND");}			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
