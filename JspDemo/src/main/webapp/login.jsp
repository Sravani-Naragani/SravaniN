<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form method="get" action="login.jsp">
 <center>        
  User Name:
  <input type="text" name="userName" /> <br/><br/>
  Password:
  <input type="password" name="passcode" /> <br/><br/>
  <input type="submit" value="Login"/>
 </center>
 <form>
<%
    if(request.getParameter("userName")!=null&& request.getParameter("passcode")!=null){
    	String user,pwd;
    	user = request.getParameter("userName");
    	pwd = request.getParameter("passcode");
    	if(user.equals("Infinite")&& pwd.equals("Infinite")){
    		%>
    		 <jsp:forward page="Menu.jsp"/>
    		 <% 
    	}else{
    		%>
    		 <jsp:include page="login.jsp "/>
    		<% 
    		out.println("***Invalid credentials***");
    	}
    }



%>
 </form>
</body>
</html>