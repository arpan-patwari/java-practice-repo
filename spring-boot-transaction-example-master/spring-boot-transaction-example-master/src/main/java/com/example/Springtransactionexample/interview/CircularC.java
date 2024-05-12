package com.example.Springtransactionexample.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularC
{
	@Autowired
	CircularA circa;
	/*
	 * @PostConstruct void test() { circa.test(); }
	 */

	public CircularC()
	{
		/*
		 * super(); this.circa = circa;
		 */
		System.out.println("circular CC cons");
	}

}
