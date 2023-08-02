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
@WebServlet("/logincontroller")
public class loginservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public loginservelet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	String email=request.getParameter("emailid");
	String password=request.getParameter("password");
	
	
	registration reg=new login_src();
	reg.connectDB();
	
	boolean status = reg.verify(email, password);
     if(status==true) {
    	 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/registration.jsp");
    	 rd.forward(request, response);
    	 
     }else {
    	 request.setAttribute("error", "WRONG USERNAME/PASSWORD");
    	 
    	 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    	 rd.forward(request, response);
     }
	
	
	}

}
