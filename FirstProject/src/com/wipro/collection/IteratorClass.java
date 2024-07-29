package com.wipro.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorClass {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i= 1; i<=10;i++) {
			arrayList.add(i);
			}
		ListIterator<Integer> itr =arrayList.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		

	}

}
