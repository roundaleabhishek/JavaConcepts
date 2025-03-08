package com.learn.designpattern.creational.singleton;

public class SingletonClient {
	
	public static void main(String[] args) {
		
		System.out.println("1->"+ClassSingleton.getInsance());
		System.out.println("2->"+ClassSingleton.getInsance());
		System.out.println("3->"+ClassSingleton.getInsance());
		// here as we can see the same output is printed 
		// that is same instance is returned
		
	}

}
