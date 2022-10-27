<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.infinite.Jspjdbc.Employ"%>
<%@page import="com.infinite.Jspjdbc.EmployDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%
    EmployDAO dao = new EmployDAO();
     List<Employ> employlist = dao.showEmploy();
     
     %>
     <table border="3">
     <tr>
     <th>Employ No</th>
     <th>Employ Name</th>
     <th>Department</th>
     <th>Designation</th>
     <th>Basic</th>
     
     <%
     for(Employ employ : employlist){
     %>
     <tr>
        <td><%=employ.getEmpno() %></td>
        <td><%=employ.getName() %></td>
        <td><%=employ.getDept() %></td>
        <td><%=employ.getDesig() %></td>
        <td><%=employ.getBasic() %></td>
        
       
        
        
     <% 
     }
    %>
     
     </table>
 </tr>
</body>
</html>