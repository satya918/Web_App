package com.Reg_app_2.model;

import java.sql.ResultSet;


public interface registration {
	public void connectDB();
	public boolean verify(String email,String password);
	public void savereg(String name,String city,String email,String mobile);
	public ResultSet getallreg();
	public void deleterecord(String name);
	public void UpadateReg(String email,String mobile);

}
