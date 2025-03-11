package com.learn.stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamClient {
    
    // collect-> group 
    public static void countAlphabets(String[] array)
    {
    	System.out.println(Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
	
	
	public static void main(String[] args) {
		
		String str = "abbbcc";
	    String []array = str.split("");
		countAlphabets(array);
	}

}
