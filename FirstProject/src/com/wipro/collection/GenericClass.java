package com.wipro.collection;

import java.util.LinkedList;

public class GenericClass {

	public static void main(String[] args) {
		
		LinkedList<Integer> stud = new LinkedList<Integer>();
		
		for(int i=10;i>0;i--) {
			
				stud.add(i);
				
			}
			for(Integer o:stud) {
				if(o%2!=0) {
					System.out.println(o);
				}
			}
		}
		
		
		
		

	}


