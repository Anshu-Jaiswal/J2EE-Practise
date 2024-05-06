<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="springmvc.model.User"%>
    
       <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 	<h1>${Header}</h1>
 	<h1>${Desc}</h1>
<h1> Welcome ,${name }</h1>
<h1>Your email is ,${email }</h1>
<h1>Your Password is ,${passwords }</h1>
<h1>user password is  is ,${user.password }</h1>
</body>
</html>