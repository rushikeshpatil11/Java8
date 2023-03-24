package com.prowings.stream;

public class Employee {
	
	int empid;
	String name;
	String dept;
	Double salary;
//	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, String dept, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
