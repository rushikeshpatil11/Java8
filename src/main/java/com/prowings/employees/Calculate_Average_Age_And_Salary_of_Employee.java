package com.prowings.employees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Calculate_Average_Age_And_Salary_of_Employee {

	public static void main(String[] args) {
		List<Employees> emp = new ArrayList<Employees>();

		emp.add(new Employees(101, "Shubham", 21, 15000, "Java"));
		emp.add(new Employees(101, "vaibhav", 23, 25000, "PHT"));
		emp.add(new Employees(101, "Swapnil", 32, 35000, "C#"));
		emp.add(new Employees(101, "Onkar", 22, 45000, "CPP"));
		emp.add(new Employees(101, "Rohit", 35, 55000, "Python"));

		System.out.println(emp);

		Double collect = emp.stream().collect(Collectors.averagingInt(Employees::getAge));
		System.out.println("Avg. Age => " + collect);

		Double collect2 = emp.stream().collect(Collectors.averagingDouble(Employees::getSalary));
		System.out.println("Avg. Salary => " + collect2);

		// Increment 10% of emp above age 25
		emp.stream().filter(e -> e.age > 25).forEach(e -> e.setSalary(e.getSalary() + (e.getSalary() * 0.10)));
		System.out.println(emp);

	}
}
