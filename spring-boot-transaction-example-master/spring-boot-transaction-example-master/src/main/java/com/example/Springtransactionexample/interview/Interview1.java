package com.example.Springtransactionexample.interview;

import java.util.ArrayList;
import java.util.List;

public class Interview1
{

	private Interview1()
	{
	}

	private static int counter = 0;

	private static List<Interview1> objects = new ArrayList<>();

	private String param;
	/*
	 * public static void main(String[] args) {
	 * 
	 * }
	 */

	@SuppressWarnings("finally")
	public static Interview1 getInstance()
	{
		synchronized (Interview1.class)
		{
				if (counter < 2)
				{
					objects.add(new Interview1());
					counter++;
				}
				return objects.get(counter - 1);
		}



	}

	public String getParam()
	{
		return param;
	}

	public void setParam(String param)
	{
		this.param = param;
	}
}
