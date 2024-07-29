package com.wipro.multithreading;
//Thread allows program to operate multiple operation at a time without disturbing main program, it runs in background.
//It can be created by extending the Thread class and overriding its run() method:
public class Test1 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Test1 obj = new Test1();
		obj.setName("Omkar");
		
		Test1 obj1 = new Test1();
		obj1.setName("Raj");
		
	
		obj.start();
		obj1.start();
	}
	

}
