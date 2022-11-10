<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body {

  background-image: url('agent0.jpg');

  background-repeat: no-repeat;

  background-size: cover;

}

</style>

</head>
<body style="background-color:violet;">
<form action="AddHotel.jsp">
	<center>
        <div style="color:blue;">Hotel Name :
        <input type="text" name ="hotelName"/> <br/><br/></div>
       <div style="color:blue;">Address1 :
                <input type="text" name ="address1"/> <br/><br/></div>
        <div style="color:blue;">Address2 :
                <input type="text" name ="address2"/> <br/><br/></div>
        <div style="color:blue;">City :
                <input type="text" name ="city"/> <br/><br/></div>
        <div style="color:blue;">Zipcode:
                 <input type="text" name ="zipcode"/> <br/><br/></div>
        <div style="color:blue;">Contact No :
                <input type="text" name ="contactNo"/> <br/><br/></div>
        <div style="color:blue;">Rating :    
                <input type="number" name ="rating"/> <br/><br/></div>
        <div style="color:blue;">Review :
                 <input type="text" name ="review"/> <br/><br/></div>
        <div style="color:blue;">About Us:
                  <input type="text" name ="aboutus"/> <br/><br/></div>
        
        <input type="submit" value ="Insert"/><br/><br/>
    
    </form>

	
	
<c:if test="${param.hotelName!= null }">
    
	<jsp:useBean id="dao" class="com.infinite.hotel.HotelDetailsDAO" />
	<jsp:useBean id="hotel" class="com.infinite.hotel.HotelDetails" />
		
	
	<jsp:setProperty property="*" name="hotel"/>
	<c:out value="${dao.addhotel(hotel)}"/>
</c:if>


</body>
</html>