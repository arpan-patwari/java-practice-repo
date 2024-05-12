package com.example.Springtransactionexample.interview;

import javax.annotation.PostConstruct;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Conditional
{
	private final String conditionalValue = "Conditional bean is present";

	private String condition;

	@PostConstruct
	public void init()
	{
		System.out.println("Conditional generated with value " + this.conditionalValue);

		if (this.condition != null)
		{
			System.out.println("param value for condition : " + condition);
		}
	}
}
