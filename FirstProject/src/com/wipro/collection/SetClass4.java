package com.wipro.collection;

import java.util.HashSet;
import java.util.Set;

public class SetClass4 {

	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		Set set = new HashSet();
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		set.add("Banana");
		set.add("Orange");
		
		//set.remove("Banana");
		set.add("Apple");
		System.out.println(set);
		
		
		System.out.println(set.contains("Cherry"));
		
		for(Object s:set) {
			System.out.println(s);
		}
		
		

	}

}
