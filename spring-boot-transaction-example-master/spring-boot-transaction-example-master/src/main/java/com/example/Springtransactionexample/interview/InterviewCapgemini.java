package com.example.Springtransactionexample.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewCapgemini
{
	public static void main(String[] args)
	{

		String str = "capgeminibangalore";

		System.out.println(
		str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
						.entrySet().stream().filter(x -> x.getValue() == 2l).findFirst().get());

		// List<Character> listOfCharacter = Arrays.asList(str.toCharArray());

		Set<Character> uniquieSet = new LinkedHashSet<Character>();
		Set<Character> result = new LinkedHashSet<Character>();

		List<Character> charList = str.chars().mapToObj(x -> Character.valueOf((char) x)).toList();

		charList.stream().forEach(x -> {

			if (uniquieSet.contains(x))
			{
				result.add(x);
			} else
			{
				uniquieSet.add(x);
			}

		});

		System.out.println(result.stream().findFirst().get());

		System.out.println(charList.stream().filter(x -> charList.contains(x)).findFirst().get());

		System.out.println(charList);

		System.out.println(
				charList.stream().filter(x -> Collections.frequency(charList, x) > 1).collect(Collectors.toSet()));

		System.out.println(charList.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())));

		System.out.println(charList);

		System.out.println("==============================================");

		Integer[] test =
		{ 1, 2, 3, 2, 3, 7 };

		List<Integer> givenList = Arrays.asList(test);

		System.out.println(givenList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1l).map(Map.Entry::getKey).toList());

		;

		List<Long> givenList11 = givenList.stream().mapToLong(x -> x.longValue()).mapToObj(x -> x).toList();

		System.out.println(givenList11);

		List<Integer> distinctList =

				Arrays.asList(test).stream().distinct().collect(Collectors.toList());

		List<Integer> duplicate = distinctList.stream().filter(x -> !distinctList.contains(x))
				.collect(Collectors.toList());

		Set<Integer> testl = givenList.stream().filter(x -> Collections.frequency(givenList, x) == 1)
				.collect(Collectors.toSet());

		System.out.println(testl);
		System.out.println(distinctList);

	}
}
