<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update registrations here</title>
</head>
<body>

    <h2>Update registrations here...</h2>
    <form action="update" method="post">
    EMAIL<input type="email" name="email" value="<%= request.getAttribute("email")%>"/>
    MOBILE<input type="number" name="mobile" value="<%=request.getAttribute("mobile") %>"/>
    <input type="submit" value="UPDATE"/>
    
    
    
    
    
    </form>

</body>
</html>