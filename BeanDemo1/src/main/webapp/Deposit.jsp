<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanDepositAccount" class="com.infinite.bank.DepositAccount" scope="page"/>
<jsp:setProperty property="accountno" name="beanDepositAccount"/>
<jsp:setProperty property="deposit" name="beanDepositAccount"/>
Account No:
<b>
<jsp:getProperty property="accountno" name="beanDepositAccount"/> </b><br/>
Deposit Amount:
<b>
<jsp:getProperty property="deposit" name="beanDepositAccount"/>
</b>
</body>
</html>