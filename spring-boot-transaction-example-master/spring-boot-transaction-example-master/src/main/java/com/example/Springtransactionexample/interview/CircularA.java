package com.example.Springtransactionexample.interview;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularA
{
	// @Autowired
	CircularB circB;

	/*
	 * @Autowired public void set9999CircularB(CircularB circB) {
	 * System.out.println("inside setCircularB"); this.circB = circB; }
	 */

	// @Autowired

	public CircularA()
	{
		/*
		 * super(); Objects.requireNonNull(circB); this.circB = circB;
		 */

		System.out.println("circular A cons");
	}

	@Autowired
	public void setObj(CircularB circB)
	{
		System.out.println("Setter circular A");
		this.circB = circB;
	}

	@PostConstruct
	void test()
	{
		System.out.println("test methos");
	}

}
