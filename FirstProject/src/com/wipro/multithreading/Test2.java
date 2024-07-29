package com.wipro.multithreading;

//Another way to create a thread is to implement the Runnable interface:
public class Test2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
