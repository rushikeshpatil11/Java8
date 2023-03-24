package com.prowings.stream;

public class Employees {

	int id;

	String name;

	int age;

	double salary;

	String dept;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int id, String name, int age, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}

}
