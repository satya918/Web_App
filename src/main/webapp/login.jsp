<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

</head>
<body>
  <h2>login here...</h2>
  <form action="logincontroller" method="post">
  <PRE>
    USERNAME<input type="email" name="emailid"/>
    PASSWORD<input type="password" name="password"/>
    <input type ="submit" value="LOGIN"/>
    <input type="reset" value="RESET"/>
    </PRE>
  
  
  </form>
  <br>
      <%
     if(request.getAttribute("error")!=null){
    	 out.println(request.getAttribute("error"));
     }
      
      
      
      
      %>
  
  
</body>
</html>