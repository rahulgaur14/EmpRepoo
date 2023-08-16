package com.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class Emp {
	static double pf = 0;
	@Id
	private int empId;
	private String empName;
	private String empPosition;
	private String empMail;
	private String empLocation;
	private Long empNumber;
	private double empSalary;
	private double netSalary;
	private double empPF;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int empId, String empName, String empPosition, String empMail, String empLocation, Long empNumber,
			double empSalary, double netSalary, double empPF) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPosition = empPosition;
		this.empMail = empMail;
		this.empLocation = empLocation;
		this.empNumber = empNumber;
		this.empSalary = empSalary;
		this.netSalary = netSalary;
		this.empPF = empPF;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public Long getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(Long empNumber) {
		this.empNumber = empNumber;
	}
	public double getEmpSalary() {
		
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public double getEmpPF() {
		
		pf = empSalary*8.15/100;
		return pf;
	}
	public void setEmpPF(double empPF) {
		this.empPF = empPF;
	}
	public double getNetSalary() {
		netSalary = 0;
		netSalary = empSalary - pf;
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

}
