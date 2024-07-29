package com.wipro.collection;

import java.util.Set;
import java.util.HashSet;

//HashSet is an unordered collection of an elements,only store unique values.
public class SetClass {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("Sham");
		set.add(55);
		set.add("Sham");
		set.add(45);
		set.add(55);
		set.add(null);
		set.add("Omkar");
		set.add(66);
		set.add(null);
		for(Object s: set) {
			System.out.println(s);
		}

	}

}
