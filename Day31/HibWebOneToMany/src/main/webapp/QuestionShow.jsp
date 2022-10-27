
<%@page import="com.infinite.hib.Question"%>
<%@page import="com.infinite.hib.SessionHelper"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	SessionFactory sf = SessionHelper.getConnection();
	Session s=sf.openSession();
	Query q=s.createQuery("from Question");
	List<Question> list=q.list();
%>
	<table border="3">
		<tr>
			<th>Question Id</th>
			<th>Question name</th>
			
		</tr>
<%
	for(Question e : list) {
%>
	<tr>
		
		<td><%=e.getId() %>  </td>
		<td><%=e.getQname() %> </td>
		
	</tr>
<%
	}
%>
	</table>
</body>
</html>
