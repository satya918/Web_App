package com.Montek.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Montek.Entities.Student;
import com.Montek.Repository.studentRepository;

@Service
public class studentServiceImpl implements studentServices {
	
	
	@Autowired
	private studentRepository studentRepo;
	
	
	@Override
	public void saveone(Student student) {
		studentRepo.save(student);
		
	}

	@Override
	public List<Student> listallstudents() {
		List<Student> customers = studentRepo.findAll();
		return customers;
	}

	@Override
	public void deleteByid(long id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student updateId(long id) {
		Optional<Student> findById = studentRepo.findById(id);
		Student customer = findById.get();
		return customer;
	}

}
