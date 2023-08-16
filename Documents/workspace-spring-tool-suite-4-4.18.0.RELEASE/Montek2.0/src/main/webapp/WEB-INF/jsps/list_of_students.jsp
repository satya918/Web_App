<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of all customers</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 20px;
  }
  h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #4285F4;
  }
  table {
    border-collapse: collapse;
    width: 100%;
  }
  th, td {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
  }
  th {
    background-color: #f2f2f2;
    color: #FF5733;
  }
  tr:nth-child(even) {
    background-color: #f2f2f2;
  }
  tr:nth-child(odd) {
    background-color: #e0e0e0;
  }
  td {
    color: #1E8449;
  }
  .home-link {
    position: fixed;
    bottom: 20px;
    right: 20px;
    background-color: #4285F4;
    color: white;
    padding: 10px 20px;
    border-radius: 5px;
    text-decoration: none;
  }
</style>
</head>
<body>
	<h2>LIST OF ALL STUDENTS...</h2>
	 <div class="error">${msg}</div>

	<a href="back" class="home-link">BACK</a>
	<table border='2'>
	<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>EmailId</th>
		<th>Mobile</th>
		<th>DOB</th>
		<th>Gender</th>
		<th>Qualification</th>
		<th>Action</th>
		<th>Action</th>
		</tr>
		
		<c:forEach var="cust"  items="${cust}">
		<tr>
		<td>${cust.firstname}</td>
		<td>${cust.lastname}</td>
		<td>${cust.email}</td>
		<td>${cust.mobile}</td>
		<td>${cust.dob}</td>
		<td>${cust.gender}</td>
		<td>${cust.qualification}</td>
		<td><a href="delete?id=${cust.id }">DELETE</a>
		<td><a href="update?id=${cust.id }">UPDATE</a>
		</tr>
		</c:forEach>
	</table>
	</body>
</html>