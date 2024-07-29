package com.wipro.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
//Create a HashSet of strings. Add five unique strings and three duplicate strings to the set. 
//Write a method to:
//Print all unique strings.
//Check if a specific string is present in the set.

public class Assignment2 {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		set.add("Dates");
		set.add("Cherry");
		
		set.add("Apple");
		set.add("Dates");
		set.add("Cherry");
		
		printUnique(set);
		
		checkString(set);
		
		//System.out.println(set.contains("Cherry"));
		
	}
	public static void printUnique(HashSet<String> set) {
		
        for (String s : set) {
            System.out.println(s);
        }
	}
        public static void checkString(HashSet<String> set) {
        	Scanner sc= new Scanner(System.in);
        	System.out.println("Enter any String:");
        	String input=sc.nextLine();
        	if(set.contains(input)) {
        		System.out.println("Valid");
        	}else {
        		System.out.println("Invalid");
        	}
        	sc.close();
        }
		
	
	
	
}
