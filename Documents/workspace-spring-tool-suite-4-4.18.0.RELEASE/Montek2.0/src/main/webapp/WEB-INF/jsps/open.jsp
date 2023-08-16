<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 0;
			background-color: #f4f4f4;
		}
		
		form {
			width: 300px;
			margin: 20px auto;
			background-color: #fff;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
		}

		label {
			display: block;
			margin-bottom: 5px;
			font-weight: bold;
		}

		input[type="email"],
		input[type="text"] {
			width: 100%;
			padding: 8px;
			margin-bottom: 10px;
			border: 1px solid #ccc;
			border-radius: 3px;
		}

		input[type="submit"] {
			background-color: #007bff;
			color: #fff;
			padding: 10px 15px;
			border: none;
			border-radius: 3px;
			cursor: pointer;
		}

		input[type="submit"]:hover {
			background-color: #0056b3;
		}
	</style>
</head>
<body>
<h3 align="center">Provide credentials</h3>
	<form action="saveone" method="post">
		<label for="Email">Email:</label>
		<input type="email" name="Email" required>
		<label for="Password">Password:</label>
		<input type="password" name="Password" required>
		<input type="submit" value="Save">
	</form>
</body>
</html>