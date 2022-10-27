package com.infinite.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgentSearch
 */
public class AgentSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int agentId = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
	    int agentId = Integer.parseInt(request.getParameter("agentId"));
	    AgentDAO dao = new AgentDAO();
	    try {
	    	Agent agent = dao.searchAgent(agentId);
			if(agent!=null){
				out.println("Name " +agent.getName() + "<br/>");
				out.println("city " +agent.getCity() + "<br/>");
				out.println("MaritalStatus " +agent.getMaritalStatus() + "<br/>");
				out.println("Premium " +agent.getPremium() + "<hr/>");

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
