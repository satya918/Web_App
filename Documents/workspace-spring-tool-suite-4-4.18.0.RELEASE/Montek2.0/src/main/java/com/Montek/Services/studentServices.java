package com.Montek.Services;

import java.util.List;

import com.Montek.Entities.Student;


public interface studentServices {
	

	public void saveone(Student student); 
	public List<Student> listallstudents();
	public void deleteByid(long id);
	public Student updateId(long id);
		
	

}
