package com.learn.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		
				
		String str = "abhishek";
		System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(ch->ch,Collectors.counting())));
		
		
		System.out.println(Arrays.stream(str.split("")).
				collect(Collectors.groupingBy(ch->ch,Collectors.counting())).
				entrySet().stream().filter(ch -> ch.getValue() > 1).collect(Collectors.toList()));
		
		
	}

}
