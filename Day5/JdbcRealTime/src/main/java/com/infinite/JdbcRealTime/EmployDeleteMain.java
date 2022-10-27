package com.infinite.JdbcRealTime;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentDeleteMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ no  ");
		empno = sc.nextInt();
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.deleteEmploy(empno));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
