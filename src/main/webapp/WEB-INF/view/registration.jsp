<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>REGISTER HERE...</h2>
				<form action ="savereg" method="post">
				<pre>
				
				NAME<input type="text" name="name"/>
				CITY<input type="text" name="city"/>
				EMAIL<input type="text" name="email"/>
				MOBILE<input type="text" name="mobile"/>
				<br/>
				<input type="submit" value="save"/>

				
				</pre>
				
  </form>
  <br/>
  <%
  if(request.getAttribute("msg")!=null){
    
    out.println(request.getAttribute("msg"));
    	
    }
    

  
  %>
    
</body>
</html>