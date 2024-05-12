package com.example.Springtransactionexample.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview
{
	public static void main(String[] args)
	{
		
		String x = "aassddjggnnmk  oldddd";
		CharSequence charX = x.subSequence(0, x.length());

		char[] c =
		Arrays.asList(x.toCharArray()).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
						.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();


		// System.out.println(c);

		Character c1 =
		x.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();

		int[] test =
		{ 3, 5, 3, 9, 3, 5, 2, 1, 2 };
		List<Integer> input = Arrays.stream(test).boxed().collect(Collectors.toList());

		System.out.println(
				input.stream().filter(item -> (Collections.frequency(input, item) > 1)).distinct().sorted()
						.collect(Collectors.toList())
				);
				// System.out.println(c1);
	}
}