package com.Reg_app_2.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Reg_app_2.model.login_src;
import com.Reg_app_2.model.registration;

@WebServlet("/Delete_servelet")
public class delete_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public delete_servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name=request.getParameter("name");
	registration reg=new login_src();
	reg.connectDB();
	reg.deleterecord(name);
	ResultSet result = reg.getallreg();
	
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/list_registrations.jsp");
rd.forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
