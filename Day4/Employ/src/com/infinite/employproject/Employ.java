package com.infinite.employproject;

public class Employ {
		private int emp_Id;;
		private String emp_Name;
		private String Emp_mail;
		private String emp_Mob_No;
		    private double emp_Dt_Join;
		    private double emp_Dept;
		    private double emp_Manager_Id;
		    private double emp_Avail_leave_Bal;
		@Override
		public String toString() {
		return "Employ [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", Emp_mail=" + Emp_mail + ", emp_Mob_No="
		+ emp_Mob_No + ", emp_Dt_Join=" + emp_Dt_Join + ", emp_Dept=" + emp_Dept + ", emp_Manager_Id="
		+ emp_Manager_Id + ", emp_Avail_leave_Bal=" + emp_Avail_leave_Bal + "]";
		}
		public Employ(int emp_Id, String emp_Name, String emp_mail, String emp_Mob_No, double emp_Dt_Join, double emp_Dept,
		double emp_Manager_Id, double emp_Avail_leave_Bal) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		Emp_mail = emp_mail;
		this.emp_Mob_No = emp_Mob_No;
		this.emp_Dt_Join = emp_Dt_Join;
		this.emp_Dept = emp_Dept;
		this.emp_Manager_Id = emp_Manager_Id;
		this.emp_Avail_leave_Bal = emp_Avail_leave_Bal;
		}
		public Employ() {
		super();
		// TODO Auto-generated constructor stub
		}
		public int getEmp_Id() {
		return emp_Id;
		}
		public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
		}
		public String getEmp_Name() {
		return emp_Name;
		}
		public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
		}
		public String getEmp_mail() {
		return Emp_mail;
		}
		public void setEmp_mail(String emp_mail) {
		Emp_mail = emp_mail;
		}
		public String getEmp_Mob_No() {
		return emp_Mob_No;
		}
		public void setEmp_Mob_No(String emp_Mob_No) {
		this.emp_Mob_No = emp_Mob_No;
		}
		public double getEmp_Dt_Join() {
		return emp_Dt_Join;
		}
		public void setEmp_Dt_Join(double emp_Dt_Join) {
		this.emp_Dt_Join = emp_Dt_Join;
		}
		public double getEmp_Dept() {
		return emp_Dept;
		}
		public void setEmp_Dept(double emp_Dept) {
		this.emp_Dept = emp_Dept;
		}
		public double getEmp_Manager_Id() {
		return emp_Manager_Id;
		}
		public void setEmp_Manager_Id(double emp_Manager_Id) {
		this.emp_Manager_Id = emp_Manager_Id;
		}
		public double getEmp_Avail_leave_Bal() {
		return emp_Avail_leave_Bal;
		}
		public void setEmp_Avail_leave_Bal(double emp_Avail_leave_Bal) {
		this.emp_Avail_leave_Bal = emp_Avail_leave_Bal;
		}
		}
		   
   
}
