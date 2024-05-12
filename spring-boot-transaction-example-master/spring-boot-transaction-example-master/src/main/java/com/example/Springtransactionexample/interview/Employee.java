package com.example.Springtransactionexample.interview;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee implements Comparator<Employee>
{
	private Integer salary;
	private String name;



	@Override
	public int compare(Employee o1, Employee o2)
	{
		return o1.getSalary().compareTo(o2.getSalary());
	}


}
