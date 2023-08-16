package com.web.service;

import org.springframework.stereotype.Service;

import com.web.entity.Emp;

@Service
public interface EmpService {
	public Emp saveEmp(Emp emp);
	public Emp deleteEmp(Integer empId);
	public Emp getEmp(Integer empId);
	public Emp updateEmp(Emp emp,Integer empId);
}
