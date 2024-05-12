package com.example.Springtransactionexample.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularB
{
	@Autowired
	CircularC circC;

	/*
	 * @Autowired public void setCircularB(CircularA circA) {
	 * System.out.println("inside setCircular"); this.circA = circA; }
	 */


	// @PostConstruct
	void test()
	{
		System.out.println("circular c test method");
	}

	public CircularB()
	{
		/*
		 * super(); this.circC = circC;
		 */
		System.out.println("circular BBB cons");
	}

}
