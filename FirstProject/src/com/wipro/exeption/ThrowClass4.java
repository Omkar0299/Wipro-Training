package com.wipro.exeption;

import java.util.Scanner;
public class ThrowClass4 {

	public void ageMethod(int age) {
		if(age<=120) {
			
				System.out.println("Valid age");
		}else {
			try {
				throw new InvalidAgeException();
			}catch(InvalidAgeException e) {
				System.out.println("Invalid age");
			}
		}
	}
	

}
