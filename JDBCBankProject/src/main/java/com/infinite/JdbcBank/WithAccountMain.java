package com.infinite.JdbcBank;

import java.sql.SQLException;
import java.util.Scanner;

public class WithAccountMain {
	public static void main(String[] args) {
		int accountNo;
		double withdrawAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo = sc.nextInt();
		System.out.println("Enter withdraw amont");
		withdrawAmount = sc.nextDouble();
		BankDAO dao = new BankDAO();
		
		try {
			System.out.println(dao.withdrawAccount(accountNo, withdrawAmount));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
