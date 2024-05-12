package com.example.Springtransactionexample.interview;

import java.util.Arrays;
import java.util.List;

public class GlobalException
{

	public static void main(String args[])
	{
		String[] test =
		{ "ae", "ww", "qq" };

		List<String> list = Arrays.asList(test);

		list.stream().forEach(System.out::println);

	}
}
