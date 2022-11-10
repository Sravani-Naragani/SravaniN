<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:violet;">

<form method="get" action="AddCustomer.jsp">
	<center>
		<div style="color:blue;">Enter UserId :
		<input type="number" name ="userId"/><br/><br/> </div>
		<div style="color:blue;">Enter password :
		<input type="text" name ="pass"/><br/><br/></div>
		
		<div style="color:blue;">Enter First Name :
		<input type="text" name ="firstName"/><br/><br/></div>
		
		<div style="color:blue;">Enter last Name :
		<input type="text" name ="lastName"/><br/><br/> </div>
		
		<div style="color:blue;">Enter Contact No:
		<input type="text" name ="contactNo"/><br/><br/> </div>
		
		<div style="color:blue;">Enter Id Proof :
		<input type="text" name ="idProof"/><br/><br/> </div>
		
		<div style="color:blue;">Enter City :
		<input type="text" name ="city"/><br/><br/> </div>
		
		<input type="submit" value ="Insert"/><br/><br/>
	</center>
<c:if test="${param.userId != null}">
	<jsp:useBean id="beanDao" class="com.infinite.hotel.HotelDetailsDAO"/>
	<jsp:useBean id="customer" class="com.infinite.hotel.CustomerDetails" />
	
	    <jsp:setProperty property="*" name="customer"/>
	    <c:out value="${beanDao.addCustomer(customer)}"/>
</c:if>
</form>
</body>
</html>
