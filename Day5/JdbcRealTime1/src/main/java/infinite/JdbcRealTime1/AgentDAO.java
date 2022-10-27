package infinite.JdbcRealTime1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;


public class AgentDAO {
	private static final Statement ConnectionHelper = null;
	private static Agent agent = null;
	private static final int agentId = 0;
	private static final List<Agent> agentlist = null;
	Connection Connection;
	PreparedStatement pst;
	public String updateAgent(Agent agentNew)throws ClassNotFoundException, SQLException{
		Agent agent= searchAgent(agentNew.getAgentId());
		if(agent!=null){
			String cmd = "update agent set name=?, city=?, Gender=?," +"name =? where agentId=?";
			
			Connection = ((Statement) Connection).getConnection();
			pst = Connection.prepareStatement(cmd);
			pst.setString(1, agentNew.getName());
			pst.setString(2, agentNew.getCity());
			pst.setDouble(4, agentNew.getPremium());
			pst.setInt(5, agent.getMaritalStatus());
			pst.executeUpdate();
			return "Employ Record updated";
			
		}
		return "Record Not Found";
	}
	public String deleteEmploy(int AgentId)throws ClassNotFoundException, SQLException{
	Agent agent = searchAgent(AgentId);
	if(agent!=null){
		Connection = ((Statement) Connection).getConnection();
		String cmd = "delete  from Agent where empno=?";
		pst = Connection.prepareStatement(cmd);
		pst.setInt(1,AgentId);
		pst.executeUpdate();
		return "Record deleted";
		}
	return "Employ record not found";
	
		
	}
	public String addAgent(Agent agent) throws ClassNotFoundException, SQLException{
		Connection = ConnectionHelper.getConnection();
		String cmd = "insert into Agent(AgentId,City,MaritalStatus,Gender,Premium)" 
				+"values(?,?,?,?'?)";
		pst = Connection.prepareStatement(cmd);
		pst.setInt(1, agent.getAgentId());
		pst.setString(2, agent.getCity());
		pst.setInt(3, agent.getMaritalStatus());
		pst.setDouble(4, agent.getPremium());
		
		pst.executeUpdate();
		return "Record inserted";

		
	}
	
	public Agent searchAgent(int AgentId )throws SQLException, ClassNotFoundException{
	Connection = ConnectionHelper.getConnection();
	String cmd = "select * from Agent where AgentId=?";
	pst = Connection.prepareStatement(cmd);
	pst.setInt(1,agentId);
	ResultSet rs =pst.executeQuery();
	Agent employ = null;
	if(rs.next()){
		agent = new Agent();
		agent.setAgentId(rs.getInt("AgentId"));
		agent.setName(rs.getString("Name"));
		agent.setCity(rs.getString("city"));
		
		agent.setPremium(rs.getDouble("Premium"));
	}
	return employ;
		
	}
		
	
	
	
	public List<Agent>showEmploy() throws SQLException, ClassNotFoundException{
		List<Agent> employlist = new ArrayList<Agent>();
		Connection = ((Statement) Connection).getConnection();
		String cmd = "select * from Employ";
		pst = Connection.prepareStatement(cmd);
		ResultSet rs =pst.executeQuery();
		Agent employ = null;
		while(rs.next()){
			employ = new Agent();
			agent.setAgentId(rs.getInt("AgentId"));
			agent.setName(rs.getString("Name"));
			agent.setCity(rs.getString("city"));
			
			agent.setPremium(rs.getDouble("Premium"));
			agentlist.add(agent);



		}
		return employlist;
		
	}
	public Agent searchAgent(Agent agent2) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Agent> ShowAgent() {
		// TODO Auto-generated method stub
		return null;
	}

}
