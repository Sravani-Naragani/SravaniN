package com.infinite.JspJdbc2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;


public class EmployDAO {
	Connection Connection;
	PreparedStatement pst;
	public int validate(String user, String pwd)throws ClassNotFoundException, SQLException{
		Connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Login where userName=? and passcode=?";
		pst = Connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, pwd);
		ResultSet rs =pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");

		return count;
		
		
	}
	public String updateEmploy(Employ employNew)throws ClassNotFoundException, SQLException{
		Employ employ= searchEmploy(employNew.getEmpno());
		if(employ!=null){
			String cmd = "update employ set name=?, Dept=?, desig=?,"
		+ "Basic =? where empno=?";
			Connection = ConnectionHelper.getConnection();
			pst = Connection.prepareStatement(cmd);
			pst.setString(1, employNew.getName());
			pst.setString(2, employNew.getDept());
			pst.setString(3, employNew.getDesig());
			pst.setInt(4, employNew.getBasic());
			pst.setInt(5, employNew.getEmpno());
			pst.executeUpdate();
			return "Employ Record updated";
			
		}
		return "Record Not Found";
	}
	public String deleteEmploy(int empno)throws ClassNotFoundException, SQLException{
	Employ employ = searchEmploy(empno);
	if(employ!=null){
		Connection = ConnectionHelper.getConnection();
		String cmd = "delete  from Employ where empno=?";
		pst = Connection.prepareStatement(cmd);
		pst.setInt(1,empno);
		pst.executeUpdate();
		return "Record deleted";
		}
	return "Employ record not found";
	
		
	}
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException{
		Connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ(name,dept,desig,basic)"
				+"values(?,?,?,?)";
		pst = Connection.prepareStatement(cmd);
		pst.setString(1, employ.getName());
		pst.setString(2, employ.getDept());
		pst.setString(3, employ.getDesig());
		pst.setInt(4, employ.getBasic());
		pst.executeUpdate();
		return "Record inserted";

		
	}
	
	public Employ searchEmploy(int empno)throws SQLException, ClassNotFoundException{
	Connection = ConnectionHelper.getConnection();
	String cmd = "select * from Employ where empno=?";
	pst = Connection.prepareStatement(cmd);
	pst.setInt(1,empno);
	ResultSet rs =pst.executeQuery();
	Employ employ = null;
	if(rs.next()){
		employ = new Employ();
		employ.setEmpno(rs.getInt("empno"));
		employ.setName(rs.getString("Name"));
		employ.setDept(rs.getString("dept"));
		employ.setDesig(rs.getString("desig"));
		employ.setBasic(rs.getInt("basic"));
	}
	return employ;
		
	}
		
	
	
	
	public List<Employ>showEmploy() throws SQLException, ClassNotFoundException{
		List<Employ> employlist = new ArrayList<Employ>();
		Connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = Connection.prepareStatement(cmd);
		ResultSet rs =pst.executeQuery();
		Employ employ = null;
		while(rs.next()){
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("Name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
			employlist.add(employ);



		}
		return employlist;
		
	}

}
