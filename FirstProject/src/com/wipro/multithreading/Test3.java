package com.wipro.multithreading;

public class Test3 {

	public static void main(String[] args) {
	
	Runnable obj = new Test2();	
	
	Thread t = new Thread(obj);
	t.setName("Leo");
	
	Thread t1 = new Thread(obj);
	t1.setName("Rolex");
	
	t.start();
	t1.start();

	}

}

