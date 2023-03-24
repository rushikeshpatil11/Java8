package com.prowings.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeOnBasisOfNameSalaryDate {

	public static void main(String[] args) {
		List<Employees> emp = new ArrayList<Employees>();

		emp.add(new Employees(101, "Shubham", 21, 15000, "Java"));
		emp.add(new Employees(101, "vaibhav", 23, 25000, "PHT"));
		emp.add(new Employees(101, "Swapnil", 32, 35000, "C#"));
		emp.add(new Employees(101, "Onkar", 22, 45000, "CPP"));
		emp.add(new Employees(101, "Rohit", 35, 55000, "Python"));

		List<Employees> collect = emp.stream().sorted(
				(e1, e2) -> e1.age.compareTo(e2.age) + e1.name.compareTo(e2.name) + e1.salary.compareTo(e2.salary))
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}
