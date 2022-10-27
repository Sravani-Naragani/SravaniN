package com.infinite.Jsf;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;


@ManagedBean
@SessionScoped
public class Employ implements Serializable{
	private int empno;
	private String name;
	private String dept;
	private String design;
	private double  basic;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", design=" + design + ", basic="
				+ basic + "]";
	}
	public Employ(int empno, String name, String dept, String design, double basic) {
	
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.design = design;
		this.basic = basic;
	}
	public Employ() {
		
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}



}
