<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.infinite.Payroll.LeaveTable" %>
    <%@ page import="java.util.List" %>
     <%@ page import="com.infinite.Payroll.EmployDAO" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
          <c:set var="empno" value="${param.empno}"/>
          <jsp:useBean id="beanDao" class="com.infinite.Payroll.EmployDAO"/>                              
          <form action="SearchLeave.jsp" method="post">
                
          <input type="number" name="empno"/><br/><br/>
                
           <input type='submit' value='SearchLeave' >
                
                                
      <c:if test="${param.empno != null}">
       <table border='3'>
        <tr>
               <th>leaveId </th>
               <th>empno </th>
               <th>leaveStartDate</th>
                <th>leaveEndDate</th>
                <th>noOfDays</th>
                 <th>leaveReason</th>
                 <th>lossOfPay</th>
                 
                    </tr>
                               
                
                    <c:set var="empno" value="${param.empno}"/>
                  <c:forEach var="leave" items="${beanDao.searchleave(param.empno)}">
<tr>
        <td><c:out value="${leave.leaveId}"/> </td>
        <td><c:out value="${leave.empno}"/> </td>
        <td><c:out value="${leave.leaveStartDate}"/> </td>
        <td><c:out value="${leave.leaveEndDate}"/> </td>
        <td><c:out value="${leave.noOfDays}"/> </td>
        <td><c:out value="${leave.leaveReason}"/> </td>
        <td><c:out value="${leave.lossOfPay}"/> </td>
        
        
   </c:forEach>
     </c:if>                
                 
 </table>
  <br/>
  </form>
</body>
</html>
