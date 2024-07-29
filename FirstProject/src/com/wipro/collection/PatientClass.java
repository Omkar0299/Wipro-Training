package com.wipro.collection;

import java.util.TreeSet;

public class PatientClass {

	public static void main(String[] args) {
	
		TreeSet<Patient> set = new TreeSet<Patient>();
		
		Patient p1= new Patient(100,"Zahir");
		Patient p2= new Patient(500,"Fakar");
		Patient p3= new Patient(600, "Tarik");
		Patient p4= new Patient(60, "Yusuf");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		for(Patient o:set) {
			System.out.println(o);
		}
	}

}
