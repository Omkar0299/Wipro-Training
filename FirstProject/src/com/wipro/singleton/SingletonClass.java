package com.wipro.singleton;

public class SingletonClass {
	private static SingletonClass singleton;
	
	private SingletonClass() {
		
	}
	public static SingletonClass method() {
		
		if(singleton==null) {
			singleton =new SingletonClass();
		}
		return singleton;
	}

}
