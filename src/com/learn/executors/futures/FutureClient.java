package com.learn.executors.futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FutureClient {
	
	
	public static void main(String[] args) {
		
		Future<Integer> future = new SquareCalculator().calculate(10);
		


		while(!future.isDone()) {
		    System.out.println("Calculating...");
		    try {
				Thread.sleep(300);
				Integer result = future.get();
				System.out.println(result);
				
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		
	}

}
