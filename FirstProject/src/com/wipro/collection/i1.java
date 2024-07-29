package com.wipro.collection;

public interface i1 {
	
	default void m1(int x, int y) {
		System.out.println("sum:" +(x+y));
		
	}
	static void m2(int x, int y) {
		System.out.println("sub:" +(x-y));
	}

}
