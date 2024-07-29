package com.wipro.exeption;

public class ThrowsExampleClass  {

	public void div() throws ArithmeticException {
		int z= 100/0;
		System.out.println("Division is :" +z);
	}
}

