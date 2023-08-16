package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.web.entity.Emp;
import com.web.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	public EmpService service;
	@PostMapping("/save")
	public String saveEmp(@RequestBody Emp emp)
	{
		String msg = "";
		Emp e2 = service.saveEmp(emp);
		
		if(e2!=null)
		{
		System.out.println("test......");
			msg = "Data is inserted successfully";
		}
		else
		{
			msg = "Data is not inserted";
		}
		return msg;		
	}
	
	@DeleteMapping("/delete/{empId}")
	public String deleteEmlpoyee(@PathVariable Integer empId)
	{
		Emp e3 = service.deleteEmp(empId);
		String msg = null;
		if(e3==null)
		{
			msg = "Data deleted successfully";
		}
		else
		{
			msg = "No data deleted";
		}
		
		return msg;
	}
	
	@RequestMapping("/get/{empId}")
	public Emp getEmp( @PathVariable Integer empId)
	{
		Emp e4 = service.getEmp(empId);
		return e4;
		
	}
	
	@PutMapping("/update/{empId}")
	public Emp updateEmp(@RequestBody Emp emp, @PathVariable Integer empId)
	{
		Emp e5 = service.updateEmp(emp, empId);
		return e5;
		
	}
	
	

}
