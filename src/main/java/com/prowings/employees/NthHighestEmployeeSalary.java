package com.prowings.employees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NthHighestEmployeeSalary {

	public static void main(String[] args) {
		List<Employees> emp = new ArrayList<Employees>();

		emp.add(new Employees(101, "Shubham", 21, 15000, "Java"));
		emp.add(new Employees(101, "vaibhav", 23, 25000, "PHT"));
		emp.add(new Employees(101, "Swapnil", 32, 35000, "C#"));
		emp.add(new Employees(101, "Onkar", 22, 45000, "CPP"));
		emp.add(new Employees(101, "Rohit", 35, 55000, "Python"));

		Employees employees = emp.stream().sorted(Comparator.comparingDouble(Employees::getSalary)).skip(emp.size() - 2)
				.findFirst().get();
		System.out.println(employees);
	}
}
