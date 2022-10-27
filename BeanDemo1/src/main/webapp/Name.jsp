<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beamName" class="com.infinite.beandemo1.NameBean" scope="page"/>
<jsp:setProperty property="firstName" name="beamName"/>
<jsp:setProperty property="lastName" name="beamName"/>
First Name:
<b>
<jsp:getProperty property="firstName" name="beamName"/> </b><br/>
Last Name:
<b>
<jsp:getProperty property="lastName" name="beamName"/>
</b>
</body>
</html>