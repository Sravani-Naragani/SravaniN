<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="ShowRoom.jsp">
    <jsp:useBean id="beanDao" class="com.infinite.hotel.HotelDetailsDAO"/>
    
    
    <table border='3'>
        <tr>
         <th>roomId</th>
         <th>type</th>
         <th>status</th>
         <th>costperDay</th>
         
        </tr>
      <c:forEach var="ShowRoom" items="${beanDao.showroom()}">
          <tr>
              <td><c:out value="${ShowRoom.roomId}"></c:out></td>
              <td><c:out value="${ShowRoom.type}"/> </td>
              <td><c:out value="${ShowRoom.status}"/> </td>
              <td><c:out value="${ShowRoom.costperday}"/> </td>
             
              
              
          </tr>
      </c:forEach>
     </table>
     
</form>
</body>
</html>