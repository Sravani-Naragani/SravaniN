package infinite.JdbcRealTime1;

import java.sql.SQLException;
import java.util.List;

public class AgentShowAllMain {
	private static final String agentlist = null;

	public static void main(String[] args) {
		
		AgentDAO dao = new AgentDAO();
		try {
			List<Agent> employlist = dao.ShowAgent();
			for (Agent agent : agentlist) {
				System.out.println(agent);
				
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

