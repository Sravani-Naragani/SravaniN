package infinite.JdbcRealTime1;

import java.sql.SQLException;
import java.util.Scanner;

public class AddAgentMain {
	public static void main(String[] args) {
		Agent agent= new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent name");
		agent.setName(sc.next());
		System.out.println("Enter City");
		agent.setCity(sc.next());
		
		System.out.println("Enter Premium");
		agent.setPremium(sc.nextDouble());
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.addAgent(agent));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		



		

	}

}
