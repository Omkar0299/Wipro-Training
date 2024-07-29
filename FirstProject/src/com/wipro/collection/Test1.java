package com.wipro.collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Test1 {
//If operation is retrival then use ArrayList
	public static void main(String[] args) {
		
		List list = new ArrayList();
		/*list.add(Integer.valueOf(56));
		list.add(new String("Omkar"));
		list.add(Boolean.valueOf(false));
		list.add(Character.valueOf('p'));
		list.size();*/
		
		
		list.add(55);
		list.add("Ram");
		list.add("Sham");
		list.add('a');
		list.add(55);
		list.add(2,"Om");
		System.out.println(list);
		System.out.println(list.add(55));
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.getFirst());
		System.out.println(list.contains("Ra"));
		list.clear();
		System.out.println(list.size());
		
		
		
	}

}
