package com.wipro.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass3 {

	String name, author;
	int quantity;
	public SetClass3(String name, String author, int quantity ) {
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
	public static void main(String[] args) {
		LinkedHashSet<SetClass3> set = new LinkedHashSet<SetClass3>();
		
		SetClass3 set1= new SetClass3("Rich Dad Poor Dad","Robert", 5);
		SetClass3 set2= new SetClass3("Veer Saverkar","Sharad Pondse", 6);
		SetClass3 set3= new SetClass3("Little World","Kevyn", 5);
		
		set.add(set1);
		set.add(set2);
		set.add(set3);
		
		for(SetClass3 s:set) {
			System.out.println(s.name+" "+s.author+" "+s.quantity);
		}
		
		
	}

}
