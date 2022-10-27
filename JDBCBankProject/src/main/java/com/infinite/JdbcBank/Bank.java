package com.infinite.JdbcBank;

public class Bank {
	private int accountNo;
	private String firstName;
	private String laststName;
	private String city;
	private String state;
	private int  amount;
	private String cheqFacil;
	private String accountType;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLaststName() {
		return laststName;
	}
	public void setLaststName(String laststName) {
		this.laststName = laststName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqFacil() {
		return cheqFacil;
	}
	public void setCheqFacil(String cheqFacil) {
		this.cheqFacil = cheqFacil;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", firstName=" + firstName + ", laststName=" + laststName + ", city="
				+ city + ", state=" + state + ", amount=" + amount + ", cheqFacil=" + cheqFacil + ", accountType="
				+ accountType + "]";
	}
	public Bank(int accountNo, String firstName, String laststName, String city, String state, int amount,
			String cheqFacil, String accountType) {
	
		this.accountNo = accountNo;
		this.firstName = firstName;
		this.laststName = laststName;
		this.city = city;
		this.state = state;
		this.amount = amount;
		this.cheqFacil = cheqFacil;
		this.accountType = accountType;
	}
	public Bank() {
	
		// TODO Auto-generated constructor stub
	}
}