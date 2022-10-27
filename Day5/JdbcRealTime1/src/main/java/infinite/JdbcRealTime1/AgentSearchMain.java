package infinite.JdbcRealTime1;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearchMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter Employ Number");
		empno= sc.nextInt();
		AgentDAO dao= new AgentDAO();
		try {
			Agent agent = dao.searchAgent(agent);
			if(agent!=null){
				System.out.println(agent);
			
			}else{
				System.out.println("***Record not found***");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

