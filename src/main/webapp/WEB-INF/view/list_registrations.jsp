<%@page import="com.mysql.cj.jdbc.result.ResultSetFactory"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registrations</title>
</head>
<body>
<h2> ALL registrations...</h2>
   <table border='2'>
   <tr>
      <th>name</th>
      <th>city</th>
      <th>email</th>
      <th>mobile</th>
      <th>Delete</th>
      <th>Update</th>
   </tr>
   
   <%
   ResultSet res=(ResultSet)request.getAttribute("result");
   while (res.next()){
   
   
   %>
   <tr>
      <td><%=res.getString(1) %></td>
      <td><%=res.getString(2) %></td>
      <td><%=res.getString(3) %></td>
      <td><%=res.getString(4) %></td>
      <td><a href="Delete_servelet?name=<%=res.getString(1) %>">Delete</a></td>
      <td><a href="update?email=<%=res.getString(3) %>&mobile=<%=res.getString(4) %>">Update</a></td>
</tr>
   <%} %>
   
   

   </table>

</body>
</html>