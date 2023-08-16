<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<head>
    <title>Back Button Style</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            text-align: center;
        }

        .back-form {
            margin-top: 100px;
        }

        .back-btn {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #0066cc;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.2s ease;
        }

        .back-btn:hover {
            background-color: #004080;
        }
    </style>
</head>
<body>
    <div class="back-form">
        <form action="back" method="GET">
            <input type="button" value="Back" class="back-btn">
        </form>
    </div>
</body>
</html>