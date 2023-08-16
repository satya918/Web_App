<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>update page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 20px;
        }

        form {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        form pre {
            margin-bottom: 15px;
        }

        form input[type="text"],
        form input[type="number"],
        form input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        form input[type="submit"] {
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 4px;
        }

        form input[type="submit"]:hover {
            background-color: #45a049;
        }

        /* Optional: Style the error message if needed */
        .error {
            color: red;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <form action="updatecust" method="post">
        <pre>
            <input type="hidden" name="id" value="${del.id}"/>
            firstName<input type="text" name="firstname" value="${del.firstname}"/>
            lastName<input type="text" name="lastname" value="${del.lastname}"/>
            emailId<input type="text" name="email" value="${del.email}"/>
            mobile<input type="number" name="mobile" value="${del.mobile}"/>
            Dob<input type="date" name="dob" value="${del.dob}"/>
            GENDER<input type="text" name="gender" value="${del.gender}"/>
            Qualification<input type="text" name="qualification" value="${del.qualification}"/>

            <input type="submit" value="Update"/>
        </pre>
    </form>
   
</body>
</html>