package com.wipro.singleton;

public class Main {
	
	public static void main(String[] str) {
		
		SingletonClass s=SingletonClass.method();
		System.out.println("Hash code is:"+s.hashCode());
		SingletonClass s1=SingletonClass.method();
		System.out.println("Hash code is:"+s1.hashCode());

	}

}
