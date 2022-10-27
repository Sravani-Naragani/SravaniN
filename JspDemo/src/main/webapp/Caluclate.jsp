<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Caluclate.jsp">
<center>
First No:
<input type="number" name="firstNo" /><br/><br/>
Second No:
<input type="number" name="SecondNo" /><br/><br/>
<input type="submit" value="Caluclation" />
</center>
</form>
   <%
      if(request.getParameter("firstNo")!=null &&
      request.getParameter("SecondNo")!=null) {
    	  int firstNo, SecondNo, result;
    	  firstNo = Integer.parseInt(request.getParameter("firstNo"));
    	  SecondNo = Integer.parseInt(request.getParameter("SecondNo"));
    	  result = firstNo + SecondNo;
    	  out.println("sum is " +result+ "<br/>");
    	  result = firstNo - SecondNo;
    	  out.println("sub is " +result+ "<br/>");
    	  result = firstNo * SecondNo;
    	  out.println("Mul is " +result+ "<br/>");



      }
%>
</body>
</html>