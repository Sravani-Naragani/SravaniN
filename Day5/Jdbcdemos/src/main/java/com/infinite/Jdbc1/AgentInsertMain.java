package com.infinite.Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentInsertMain {
	public static void main(String[] args) {
		String name, City, gender ;
		double premium;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter city");
		City = sc.next();
		System.out.println("Enter gender");
		gender = sc.next();
		System.out.println("Enter premium");
		premium = sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/exam","root","india@123");
			String cmd= "insert into Agent(name,City,gender,Premium)" +"values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, name);
			pst.setString(2,City );
			pst.setString(3,gender );
			pst.setDouble(4, premium);
			pst.executeUpdate();
			System.out.println("Agent record inserted");

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

