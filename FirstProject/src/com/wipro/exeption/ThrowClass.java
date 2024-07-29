package com.wipro.exeption;

import java.util.Scanner;
public class ThrowClass {

	public static void main(String[] str) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name is" );
		String name= scanner.nextLine();
		if(name.startsWith("O")){
		try {
			 
				throw new ArethameticException();
			
		}catch(ArethameticException e) {
			System.out.println("Name should not start with O");
		}
		}
		
		else{
			System.out.println("Welcome :" +name);
		}
	}
}
