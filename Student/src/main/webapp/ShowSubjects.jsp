<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanDao" class="com.infinite.canteenmanagement.CustomerDAO"/>
<table border ="3" align ="center"/>
<tr>

<th>subjectId</th>
<th>year</th>
<th>instructor</th>
<th>subject</th>
<th>theory</th>
<th>Customer userName</th>
<th>Customer password</th>

</tr>
<c:forEach var="customer" items="${beanDao.CustomerShow()}">
<tr>
<td>${customer.cust_name}</td>
<td>${customer.cust_city}</td>
<td>${customer.cust_name}</td>
<td>${customer.cust_email}</td>
<td>${customer.cust_userName}</td>
<td>${customer.cust_password}</td>
<td>${customer.cust_gender}</td>
</tr>




</c:forEach>



</body>
</html>