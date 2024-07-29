package com.wipro.multithreading;

public class Test4 {

	public static void main(String[] args) {
		
	Runnable obj =()->{
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	};
	
	//Runnable obj=()->System.out.println(Thread.currentThread().getName());
	
	
	
	Thread t = new Thread(obj);
	t.setName("Omkar");
	t.start();
	
	Thread t1 = new Thread(obj);
	t1.setName("wipro");
	t1.start();

	
	}
}
