package com.wipro.collection;

import java.util.SortedSet;

import java.util.TreeSet;
public class SortedSetClass {

	public static void main(String[] args) {
		
		SortedSet s= new TreeSet();
		s.add(1);
		s.add(5);
		s.add(44);
		s.add(2);
		s.add(3);
		s.add(6);
		s.add(8);
		
		
		System.out.println(s.tailSet(5));
		System.out.println(s.headSet(8));
		System.out.println(s.subSet(6, 44));
		
		for(Object o:s) {
			//System.out.println(o);
			
		}
		

	}

}
