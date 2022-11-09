package com.infinite.Payroll;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {
	@Id
	@Column(name="empno")
 private int empno;
	@Column(name="empname")
 private String empname;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
 private Gender gender;
	
	@Column(name="salary")	
 private double salary;
	
	@Column(name="hra")
 private double hra;
	
	@Column(name="da")
 private double da;
	
	@Column(name="ta")
 private double ta;
	
	@Column(name="tax")
 private double tax;
	
	@Column(name="pf")
 private double pf;
	
	@Column(name="gross")
 private double gross;
	
	@Column(name="netpay")
 private double netpay;
	
	@Column(name="leaveavailable")
 private int leaveavailable;
	
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public double getDa() {
	return da;
}
public void setDa(double da) {
	this.da = da;
}
public double getTa() {
	return ta;
}
public void setTa(double ta) {
	this.ta = ta;
}
public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}
public double getPf() {
	return pf;
}
public void setPf(double pf) {
	this.pf = pf;
}
public double getGross() {
	return gross;
}
public void setGross(double gross) {
	this.gross = gross;
}
public double getNetpay() {
	return netpay;
}
public void setNetpay(double netpay) {
	this.netpay = netpay;
}
public int getLeaveavailable() {
	return leaveavailable;
}
public void setLeaveavailable(int leaveavailable) {
	this.leaveavailable = leaveavailable;
}
 
 
 
}
