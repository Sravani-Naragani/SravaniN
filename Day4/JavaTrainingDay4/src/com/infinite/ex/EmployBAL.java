package com.infinite.ex;

public class EmployBAL {
	
	static StringBuilder sb = new StringBuilder();
	
	public boolean isValid(Employ employ){
		boolean valid=true;
		if(employ.getEmpno() < 0){
			valid=false;
			sb.append("Employ no cannot be negative or zero\r\n");
			
		}
		if(employ.getName().length() < 6){
			valid=false;
			sb.append(" employ name contains min 5 chars..\r\n");
		}
		if (employ.getD)
		if(employ.getBasic() < 5000 || employ.getBasic() > 8000){
			valid=false;
			sb.append("employ Basic must between 5000 andd 8000...\r\n");
			
		}
		return valid;
	}
}

