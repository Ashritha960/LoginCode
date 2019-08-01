package com.risk.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.risk.model.Employee;
import com.risk.model.EmployeeDetails;
import com.risk.model.Login;
import com.risk.service.loginservice;




@Controller
public class EntryController {
	
	@Autowired
	loginservice loginserviceobj;
	
	@RequestMapping(value="/success")
	public String show(Model model)
	{
		/* List<Login> loginlist=loginserviceobj.getlogindetails(); */
	model.addAttribute("employeedetails", new EmployeeDetails());
	return "Login";

	}
	
	@RequestMapping(value="/nextpage",method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute ("employeedetails") EmployeeDetails employeedetails,BindingResult result)
	{
		
		if(result.hasErrors())
		{ 
			return "Login"; 
		}
		return "display";
	}
	
	/*
	 * @RequestMapping("/sample") private String sample(Model model) { List<Login>
	 * loginlist= loginserviceobj.getlogindetails(); model.addAttribute("list",
	 * loginlist); return "hello"; }
	 */
	
	// check user, using username // if it's there, Retrieve obj //
	  @RequestMapping("/validate")
	  public String processForm(@Valid @ModelAttribute("employeedetails") EmployeeDetails employeedetails, BindingResult result,Map<String,Object> map,Model model) 
	  
	  {
	  
	  if (result.hasErrors())
	  {
		  return "Login"; 
	  }
	  
	  
	  boolean userExists=loginserviceobj.checkLogin(employeedetails.getEmail(),employeedetails.getPassword());
	  
	  System.out.println(userExists);
	 
	  
	  if(userExists)
	  
	  { 
		  map.put("employeedetails", employeedetails);
		  return "loginsuccess"; 
	  }
	  else
	  { 
		model.addAttribute("hasError",true);  
		return "Login"; 
	  
	  }
	  
	  }
	 
	
	
	
}
