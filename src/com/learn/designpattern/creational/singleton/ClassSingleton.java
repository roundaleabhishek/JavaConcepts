package com.learn.designpattern.creational.singleton;

public final class ClassSingleton {
	
	private static ClassSingleton INSTANCE = null;
	
	private ClassSingleton()
	{
		//this is private constructor
	}
	
	public static ClassSingleton getInsance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new ClassSingleton();
		}
		return INSTANCE;
	}
	
	

}
