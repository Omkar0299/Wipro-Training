package com.wipro.collection;

import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet is an orderd collection of an elements, only store unique values.
public class SetClass2 {

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(66);
		set.add(55);
		set.add(null);
		set.add(55);
		set.add("Rahul");
		set.add('a');
		set.add("Rahul");
		set.add('a');
		set.add("Ram");
		set.remove("Ram");
		System.out.println("After removing Ram:" + set);
		
		for(Object o:set) {
			System.out.println(o);
		}
		

	}

}
