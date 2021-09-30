package com.yash.ems.web;


import java.util.*;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

@Controller
@RequestMapping(value="/")
public class EmployeeController 
{
	private EmployeeService service;
	
	 @RequestMapping(value = "/list",method = RequestMethod.GET)
		public String getList(ModelMap model) 
		{
			List<Employee> emplist = service.findAll();
			model.addAttribute("emplist", emplist);
			return "empllist";
		}
	        
	    
	  
		
		 
}
