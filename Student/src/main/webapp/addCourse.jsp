<%@page import="com.infinite.student.SubjectsDAO"%>
<%@page import="com.infinite.student.CourseList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
                CourseList courseList = new CourseList();
                courseList.setCourseno(request.getParameter("courseId"));
                courseList.setDuration(Integer.parseInt(request.getParameter("duration")));
                java.sql.Date startdate = java.sql.Date.valueOf(request.getParameter("Startdate")); 
                java.sql.Date enddate = java.sql.Date.valueOf(request.getParameter("Enddate"));
                courseList.setStartdate(startdate);   
                courseList.setEnddate(enddate);
                courseList.setHod(request.getParameter("hod"));
                SubjectsDAO obj = new SubjectsDAO();
                obj.addCourse(courseList);
%>
</body>
</html>
