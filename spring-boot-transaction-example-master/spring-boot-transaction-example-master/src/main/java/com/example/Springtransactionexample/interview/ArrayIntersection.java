package com.example.Springtransactionexample.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection
{

	public static void main(String[] args)
	{
		System.out.println(
		intersection(new int[]
				{ 3, 56, 456, 3424, 1, 2 }, new int[]
				{ 1, 2, 456, 2, 1, 56, 3424 }));
		;
	}

	public static List<Integer> intersection(int[] nums1, int[] nums2)
	{
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> result = new ArrayList<Integer>();
		
		int f=0;
		int s=0;
		while (f < nums1.length && s < nums2.length)
		{
			if(nums1[f]==nums2[s])
			{
				result.add(nums1[f]);
				s++;
				f++;
			}
			else if(nums1[f]>nums2[s])
			{
				s++;
			}
			else
			{
				f++;
			}
			
		}
		return result;
	}
}
