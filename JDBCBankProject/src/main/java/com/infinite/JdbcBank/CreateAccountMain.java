package com.infinite.JdbcBank;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		BankDAO dao = new BankDAO();
		Bank bank = new Bank();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter FirstName");
		bank.setFirstName(sc.next());
		System.out.println("Enter LastName");
		bank.setLaststName(sc.next());
		System.out.println("Enter city");
		bank.setCity(sc.next());
		System.out.println("Enter State");
		bank.setState(sc.next());
		System.out.println("Enter Amount");
		bank.setAmount(sc.nextInt());
		System.out.println("Enter cheqFacil Yes/No");
		bank.setCheqFacil(sc.next());
		System.out.println("Enter AmountType");
		bank.setAccountType(sc.next());
		
			try {
				System.out.println(dao.createAccount(bank));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
