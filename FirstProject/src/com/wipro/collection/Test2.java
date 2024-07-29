package com.wipro.collection;
import java.util.ArrayList;

//If operation is add/update/delete use LinkedList
import java.util.LinkedList;
import java.util.List;
public class Test2 {

	public static void main(String[] args) {
		

		List list = new LinkedList();
		list.add(55);
		list.add("Ravan");
		list.add("Shubham");
		list.add('a');
		list.add(55);
		list.add(2,"Om");
		System.out.println(list);
		System.out.println(list.add(55));
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.getFirst());
	
	for(Object l:list) {
		System.out.println(list);
	}

}
}
