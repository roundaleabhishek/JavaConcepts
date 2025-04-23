package com.learn.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumClass {
	
	// arr = {1,8,15,2,5}
	//output should return index of 2 numbers
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,8,15,2,5};
		int target = 10;
		int index[] = twoSum(arr,target);
		System.out.println("Index Values");
		Arrays.stream(index).forEach(i -> System.out.println(i));
		
	}

	private static int[] twoSum(int[] arr, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int remaining = 0;
		for(int i = 0; i < arr.length; i++)
		{
			remaining = target - arr[i];
			if(map.containsKey(remaining))
			{
				int result[] = {map.get(remaining),i};
				return result;
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		return null;
	}

}
