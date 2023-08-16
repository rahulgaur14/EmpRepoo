package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Emp;
import com.web.repository.Repo;
@Service
public class ServiceImp implements EmpService{

	@Autowired
	public Repo repo;
	
	@Override
	public Emp saveEmp(Emp emp) {
		Emp e1 = repo.save(emp);
		// TODO Auto-generated method stub
		return e1;
	}

	@Override
	public Emp deleteEmp(Integer empId) {
		repo.deleteById(empId);
		return null;
		
	}

	@Override
	public Emp getEmp(Integer empId) {
		Emp e2 = repo.findById(empId).get();
		return repo.save(e2);
	}

	@Override
	public Emp updateEmp(Emp emp, Integer empId) 
	{
		Emp e3 = repo.findById(empId).get();
		e3.setEmpId(empId);
		e3.setEmpName(emp.getEmpName());
		e3.setEmpPosition(emp.getEmpPosition());
		e3.setEmpMail(emp.getEmpMail());
		e3.setEmpLocation(emp.getEmpLocation());
		e3.setEmpNumber(e3.getEmpNumber());
		e3.setEmpSalary(emp.getEmpSalary());
		e3.setEmpPF(emp.getEmpPF());
		e3.setNetSalary(emp.getNetSalary());		
		return repo.save(e3);
	}



}
