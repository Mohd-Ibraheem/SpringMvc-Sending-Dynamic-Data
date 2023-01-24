<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is jsp page</title>
</head>
<body>
<h1>Welcome to my page</h1>
<%  String str=(String)request.getAttribute("name"); 
 Integer in=(Integer)request.getAttribute("id");
 List<String> list=(List<String>)request.getAttribute("li");%>
 
<h1>Name:<%=str%></h1>
 <h1>Id:<%=in %></h1>
 <% for(String s:list){ %>
<h1><%=s %></h1>
<%} %>
</body>
</html>