package com.wipro.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


//Write a program to create an ArrayList of integers. Add ten random integers to the list.
//Write methods to perform the following operations:
//Find the maximum and minimum value in the list.
//Sort the list in ascending and descending order.
//Remove duplicate elements from the list.

public class Assignment1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(2);
		list.add(10);
		list.add(15);
		list.add(1);
		list.add(88);
		list.add(99);
		list.add(10);
		list.add(9);
		
		System.out.println("Original list: " + list);

        
        
        System.out.println("Maximum value: " + max(list));
        System.out.println("Minimum value: " + min(list));

        
        asc(list);
        System.out.println("Sorted list in ascending order: " + list);

       
        desc(list);
        System.out.println("Sorted list in descending order: " + list);

        
      removeDuplicates(list);
        System.out.println("List after removing duplicates: " + list);
    }
	
	public static int max(ArrayList<Integer> list) {
		return Collections.max(list);
	}
	public static int min(ArrayList<Integer> list) {
		return Collections.min(list);
	}
	public static void asc(ArrayList<Integer> list) {
		 Collections.sort(list);
	}
	public static void desc(ArrayList<Integer> list) {
		 Collections.sort(list,Collections.reverseOrder());
	}
	
	public static void removeDuplicates(ArrayList<Integer> list) {
		HashSet<Integer> set = new HashSet<Integer>(list);
		list.clear();
		list.addAll(set);
	}

   


}

