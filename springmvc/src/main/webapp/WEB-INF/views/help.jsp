<%@page import="java.time.LocalDateTime"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
	String name = (String)request.getAttribute("name");
	Integer rollNo = (Integer)request.getAttribute("rollNo");
	LocalDateTime  time = (LocalDateTime)request.getAttribute("time");
%>
<h1>This is the help page</h1>

<h1>Hello My name is <%= name %> </h1>
<h1>RollNo is <%= rollNo %></h1>

<h1>Date Time is <%=time.toString()  %></h1>

<hr>
<h1>Using Expression language</h1>

<h1>My name is  ${name}</h1>
<h1>My RollNo is  ${rollNo}</h1>

<c:forEach var="item" items="${marks }">
 <h1>${item}</h1>
</c:forEach>

 



</body>
</html>