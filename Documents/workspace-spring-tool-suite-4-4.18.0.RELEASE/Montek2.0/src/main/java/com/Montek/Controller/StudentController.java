package com.Montek.Controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Montek.Entities.Login;
import com.Montek.Entities.Student;
import com.Montek.Repository.Login_Repository;
import com.Montek.Services.studentServices;


@Controller
public class StudentController {
	
	@Autowired
	private studentServices studentServ;

	@Autowired
	private Login_Repository logrepo;
	
	
	@RequestMapping("/Start")
	public String startapp() {
		return "login1";
	}
	
	@RequestMapping("/login")
	public String verify(
	    @RequestParam("email") @NotBlank String email,
	    @RequestParam("password") @NotBlank String password,
	    Model model
	) {
	    Login regd = logrepo.findByEmail(email);
	    if (regd != null && regd.getEmail().equals(email) && regd.getPassword().equals(password)) {
	        model.addAttribute("msg", "WELCOME TO LDTECH REGISTRATION PORTAL");
	        return "reg";
	    } else {
	        model.addAttribute("msg", "Invalid username or password");
	        return "login1";
	    }
	}

		
	
	
	@RequestMapping("/signup")
	public String fillform() {
		return "open";
	}
	
	@RequestMapping("/saveone")
	public String savecred(@ModelAttribute("Login") @Valid Login log, BindingResult bindingResult, ModelMap model) {
	    if (bindingResult.hasErrors()) {
	        return "open"; // Return to the form if validation errors exist
	    }

	    logrepo.save(log);
	    model.addAttribute("msg", "DATA SAVED SUCCESSFULLY!");
	    return "login1";
	}

	@RequestMapping("/back")
	public String startapp2() {
		return"menu";
	}
	
	@RequestMapping("/open")
	public String create() {
		return "reg";
	}
	@RequestMapping("/save")
	public String savedetails(@ModelAttribute("x") @Valid Student student, BindingResult bindingResult, Model model) {
	    if (bindingResult.hasErrors()) {
	        return "login1"; // Return to the form if validation errors exist
	    }

	    model.addAttribute("msg", "RECORD IS SAVED");
	    studentServ.saveone(student);
	    return "menu";
	}


	@RequestMapping("/listall")
	public String listallstudent(Model model) {
		List<Student> customers = studentServ.listallstudents();
		model.addAttribute("cust", customers);
		return"list_of_students";
	}
	@RequestMapping("/delete")
	public String deleterecord(@RequestParam("id")Long id,Model model) {
		studentServ.deleteByid(id);
		List<Student> customers = studentServ.listallstudents();
		model.addAttribute("cust", customers);
		model.addAttribute("msg","RECORD DELETED SUCCESSFULLY ! ! !");
		return"list_of_students";
	}
	@RequestMapping("/update")
	public String updaterecord(@RequestParam("id")long id,Model model) {
		Student custom = studentServ.updateId(id);
		model.addAttribute("del", custom);
		
		
		return"updates";
	}
	@RequestMapping("/updatecust")
	public String updatedetails(@ModelAttribute("x")Student custom,Model model) {
		model.addAttribute("msg", "RECORD IS SAVED");
		studentServ.saveone(custom);
		
		List<Student> customers = studentServ.listallstudents();
		model.addAttribute("cust", customers);
		return"list_of_students";
		
	
	
	}

	

}
