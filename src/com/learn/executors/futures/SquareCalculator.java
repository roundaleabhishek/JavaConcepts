package com.learn.executors.futures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {
	
	private ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
	
	public Future<Integer> calculate(Integer i)
	{
		return singleThreadExecutor.submit(() -> {
			Thread.sleep(1000);
			return i * i;
		});
	}
	
	

}
