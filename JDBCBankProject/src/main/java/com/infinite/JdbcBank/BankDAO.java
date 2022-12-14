package com.infinite.JdbcBank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDAO {

	Connection connection;
	PreparedStatement pst;
	public String withdrawAccount(int accountNo,double withdrawAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if(bank!=null){
			double balance = bank.getAmount();
			if(balance-withdrawAmount >= 1000){
				String cmd = "update Bank set Amount=amount-? " + "where AccountNo=?";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, withdrawAmount);
				pst.executeUpdate();
				cmd = "Insert into Trans(AccountNo,TransAmount,TransType) "
						+ " values(?,?,?)";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, withdrawAmount);
				pst.setString(3,"D");
				pst.executeUpdate();
				return "Amount debited";
	}else{
		return "insufficient Funds";
		}
	}
	return "Account No not Found";
	}
	
	public String depositAccount(int accountNo,double depositamount) 
			throws ClassNotFoundException,SQLException{
		Bank bank = searchAccount(accountNo);
	if(bank!=null){
		connection = ConnectionHepler.getConnection();
		String cmd= "update Bank set Amount=Amount+? where "
				+ "AccountNo=? ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setDouble(2, depositamount);
		pst.executeUpdate();
		cmd = "Insert into Trans(AccountNo,TransAmount,TransType) "
				+ " values(?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setDouble(2, depositamount);
		pst.setString(3,"C");
		pst.executeUpdate();
		return "Amount credited";

	}
	return "Account No Not Found";
	}

	public String closeAccount(int accountNo) throws ClassNotFoundException,SQLException{
		Bank bank = searchAccount(accountNo);
		if(bank!=null){
			String cmd= "update bank set status='inactive' where accountno=?";
			connection = ConnectionHepler.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return "Account Closed....";	
		}
		return "Account Not Found";
	}
	
	
	public Bank searchAccount(int accountNo) 
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHepler.getConnection();
		String cmd = "select * from Bank where AccountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank = null;
		if(rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLaststName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getInt("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("accountType"));
		}
		return bank;
	}
	
	public String createAccount(Bank bank) 
			throws ClassNotFoundException, SQLException {
		int accountNo = generateAccountNo();
		bank.setAccountNo(accountNo);
		String cmd = "insert into Bank(AccountNo, FirstName, "
				+ "LastName, city,State,Amount, CheqFacil,"
				+ "AccountType) values(?,?,?,?,?,?,?,?)";
		connection = ConnectionHepler.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLaststName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setInt(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account Created...";
	}
	
	public int generateAccountNo() 
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHepler.getConnection();
		String cmd = "select case when max(accountNo) is NULL"
				+ " then 1 else max(accountNo)+1 end accno "
				+ "from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
}
