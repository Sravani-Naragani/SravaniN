package infinite.JdbcRealTime1;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentDeleteMain {
	public static void main(String[] args) {
		int AgentId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter agent no  ");
		AgentId = sc.nextInt();
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.deleteEmploy(AgentId));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
