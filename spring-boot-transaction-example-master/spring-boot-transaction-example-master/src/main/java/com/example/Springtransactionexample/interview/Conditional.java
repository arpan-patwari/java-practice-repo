package com.example.Springtransactionexample.interview;

import javax.annotation.PostConstruct;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Conditional
{
	private final String conditionalValue = "Conditional bean is present";

	private String condition;

	@PostConstruct
	public void init()
	{
		log.info("Conditional generated with value " + this.conditionalValue);

		if (this.condition != null)
		{
			log.info("param value for condition : " + condition);
		}
	}
}
