<%@page import="com.infinite.student.SubjectsDAO"%>
<%@page import="com.infinite.student.FeedBack"%>

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
                SubjectsDAO obj = new SubjectsDAO();
                String fid = obj.generateFeedbackId();
                String studentname = (String)session.getAttribute("studentname");

String instructor = (String)session.getAttribute("instructor");
String subject = request.getParameter("subject");
String fbValue = request.getParameter("feedback");
out.println(fid);
out.println(studentname);
out.println(instructor);
out.println(subject);
out.println(fbValue);
FeedBack fb = new FeedBack();
fb.setFid(fid);
fb.setStudentname(studentname);
fb.setInstructor(instructor);
fb.setSubject(subject);
fb.setFbvalue(fbValue);
out.println(obj.recordFeedback(fb));
%>
</body>
</html>
