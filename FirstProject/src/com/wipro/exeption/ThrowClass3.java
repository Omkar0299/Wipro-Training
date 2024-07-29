package com.wipro.exeption;
import java.util.Scanner;
public class ThrowClass3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight" );
		int weigh = scanner.nextInt();
		ThrowClass2 obj = new ThrowClass2();
		obj.checkWeight(weigh);
	}

}
