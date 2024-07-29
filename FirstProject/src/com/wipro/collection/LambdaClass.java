package com.wipro.collection;

import java.util.TreeSet;

public class LambdaClass   {

	public static void main(String[] arg) {
	
		TreeSet<Mentor> mentor = new TreeSet<Mentor>((a,b)-> -a.getId().compareTo(b.getId()));
		
		Mentor s1 = new Mentor(5,"om");
		Mentor s2 = new Mentor(10,"Ram");
		Mentor s3= new Mentor(20,"Raju");
		Mentor s4 = new Mentor(55,"Sham");
		Mentor s5 = new Mentor(51,"Aditya");
		
		mentor.add(s1);
		mentor.add(s2);
		mentor.add(s3);
		mentor.add(s4);
		mentor.add(s5);
		
		for(Mentor m:mentor) {
			System.out.println(m);
		}
}
}
