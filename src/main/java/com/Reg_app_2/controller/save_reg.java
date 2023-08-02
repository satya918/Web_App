package com.Reg_app_2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Reg_app_2.model.login_src;
import com.Reg_app_2.model.registration;

@WebServlet("/savereg")
public class save_reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public save_reg() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String name=request.getParameter("name");
		  String city=request.getParameter("city");
		  String email=request.getParameter("email");
		  String mobile=request.getParameter("mobile");

	
		  registration reg= new login_src();
		  reg.connectDB();
		  reg.savereg(name, city, email, mobile);
		  
		  request.setAttribute("msg", "RECORD IS SAVED!!");
		  
		  RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/registration.jsp");
	    	 rd.forward(request, response);
	
	}

}
