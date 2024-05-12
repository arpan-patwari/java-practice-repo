package com.example.Springtransactionexample.interview;

import java.util.Objects;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student
{
	private String name;
	private int id;

	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return Objects.hash(this.id);
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		Student stu = (Student) obj;
		return this.name.equals(stu.name);
	}

}
