package com.wipro.exeption;

import java.util.Scanner;

public class ThrowClass5 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Enter age" );
		int input =scanner.nextInt();
		ThrowClass4 obj = new ThrowClass4();
		obj.ageMethod(input);

	}

}
