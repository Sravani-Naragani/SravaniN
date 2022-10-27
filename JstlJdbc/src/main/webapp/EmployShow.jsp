<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
 driver="com.mysql.jdbc.Driver"
 url="jdbc:mysql://localhost:3306/infinite"
 user="root"
 password="india@123"
/>
<sql:query var="employQuery" dataSource="${conn}">
select * from Employ
</sql:query>
<c:forEach var="employ" items="${employQuery.rows}">
    Employ No:
    <c:out value="${employ.empno}"/> <br/><br/>
    Employ Name:
    <c:out value="${employ.name}"/> <br/><br/>
    Department:
    <c:out value="${employ.dept}"/> <br/><br/>
    Designation:
        <c:out value="${employ.desig}"/> <br/><br/>
    Basic:
        <c:out value="${employ.empno}"/> <hr/>
        <form action="EmployShow.jsp">
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
	
		<tr>
		<c:forEach var="employ" items="${employQuery.rows}">
			<td><c:out value="${employ.empno}" /> </td>
			<td><c:out value="${employ.name}" /> </td>
			<td><c:out value="${employ.dept}" /> </td>
		    <td><c:out value="${employ.desig}" /> </td>
			<td><c:out value="${employ.basic}" /> </td>
			
		</tr>
	
		</c:forEach>
	
	</table>
	
	</form>

</c:forEach>
</body>
</html>