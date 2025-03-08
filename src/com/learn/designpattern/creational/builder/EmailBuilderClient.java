package com.learn.designpattern.creational.builder;

public class EmailBuilderClient {
	
	public static void main(String[] args) {
		
		
		Email email = new Email.Builder().
				setFromAddress("from@email.com").
				setToAddress("to@email.com")
				.build();
		
		System.out.println(email);
		
		
	}

}
