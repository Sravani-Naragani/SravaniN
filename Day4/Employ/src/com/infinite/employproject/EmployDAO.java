package com.infinite.employproject;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	
	static List<Employ> employlist;
	
	static{
		employlist = new ArrayList<Employ>();
		}
	public String updateEmployDao(Employ employNew){
		Employ employFound = searchEmployDao(employNew.getEmpno());
		if(employFound!=null){
			for (Employ employ : employlist) {
				if(employ.getEmpno() == employNew.getEmpno()){
					employ.setName(employNew.getName());
					employ.setDept(employNew.getDept());
					employ.setGender(employNew.getGender());
					employ.setDesign(employNew.getDesign());
					employ.setBasic(employNew.getBasic());
				}
			}
			return "Employ record updated";
		}
		return "employ record notfound";
	}
	public String deleteEmployDao(int empno){
		Employ employFound = searchEmployDao(empno);
		if(employFound!=null){
			employlist.remove(employFound);
			return "Employ Record Deleted"; 
		}
		return "Employ Record Not Found"; 
	}
	public Employ searchEmployDao(int empno){
		Employ employFound =null;
		for (Employ employ : employlist) {
			if(employ.getEmpno()==empno){
				employFound = employ;
			}
		}
		return employFound;
	}
	public List<Employ> showEmployDao() {
		return employlist;
		
	}
	public String addEmployDao(Employ employ){
		employlist.add(employ);
		return "Employ record inserted...";
	}

}
