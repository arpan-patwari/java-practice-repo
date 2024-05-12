package com.example.Springtransactionexample.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewDell
{

	public static void main(String[] args)
	{

		int r = 1;

		try
		{

		}

		finally
		{

		}

		Map<String, String> data = new HashMap<String, String>();
		data.put("arpan", "thi si bangalore");
		data.put("babu", "cheeni");

		System.out.println(data.entrySet().stream().filter(x -> x.getValue().contains("bangalore"))
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue())));

	}

}
