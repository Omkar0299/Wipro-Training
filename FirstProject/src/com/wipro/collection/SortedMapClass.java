package com.wipro.collection;
import java.util.SortedMap;
import java.util.TreeMap;
public class SortedMapClass {

	public static void main(String[] args) {
		SortedMap<Integer,String> sort = new TreeMap();
		
		sort.put(1, "Banana");
		sort.put(2, "Apple");
		sort.put(3, "GreenApple");
		sort.put(4, "Cherry");
		
		//System.out.println(sort);
		
		System.out.println(sort.headMap(3));
		System.out.println(sort.tailMap(3));
		System.out.println(sort.subMap(1, 3));

	}

}
