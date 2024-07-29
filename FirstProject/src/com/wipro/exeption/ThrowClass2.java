package com.wipro.exeption;

public class ThrowClass2 {

	public void checkWeight(int weight) {
		if(weight >100) {
			System.out.println("Valid weight" );
		}
		else {
			try {
				throw new InvalidProductException();
			}catch(InvalidProductException ae) {
				System.out.println("Invalid weight" );
			}
			
		}
	}
}
