package com.Reg_app_2.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login_src implements registration {
	private Connection con;
	private Statement stmnt;

	@Override
	public void connectDB() {
		try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registrationapp1","root","test");
		   stmnt=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean verify(String email, String password) {
		try {
			   ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
          return  result.next();
            	  
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		return false;

    }

	@Override
	public void savereg(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet getallreg() {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration");
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleterecord(String name) {
		try {
			stmnt.executeUpdate("Delete from registration where name='"+name+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void UpadateReg(String email, String mobile) {
		try {
			stmnt.executeUpdate("Update registration set mobile='"+mobile+"' where email='"+email+"'");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
