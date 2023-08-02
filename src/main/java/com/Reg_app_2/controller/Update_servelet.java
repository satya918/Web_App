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

@WebServlet("/update")
public class Update_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Update_servelet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String email=request.getParameter("email");
	   String mobile=request.getParameter("mobile");
	   request.setAttribute("email", email);
	   request.setAttribute("mobile", mobile);
	   RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Update.jsp");
	   rd.forward(request, response);
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email=request.getParameter("email");
		   String mobile=request.getParameter("mobile");
		   
		   registration reg=new login_src();
		   reg.connectDB();
		   reg.UpadateReg(email, mobile);
		  
		   ResultSet result = reg.getallreg();
			
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/list_registrations.jsp");
		rd.forward(request, response);
			
	
	}

}
