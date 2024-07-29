package com.wipro.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*Create a TreeMap to store student names (as keys) and their scores (as values). Write methods to:
Add new students and their scores.
Find the student with the highest score.
Display the students and their scores in descending order of scores.*/

public class Assignment4 {

	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		findHighestScore(map);
		displayDescendingOrder(map);
	}
		public static void addStudent(TreeMap<String, Integer> map, String name, int score) {

			Labour s1= new Labour("Rahul", 80);
			Labour s2= new Labour("Raju", 70);
			Labour s3= new Labour("Shubhma", 88);
			Labour s4= new Labour("Nikhil", 91);
	        map.put(name, score);
	    }
		public static void findHighestScore(TreeMap<String, Integer> map) {
	        if (map.isEmpty()) {
	            System.out.println("No students available.");
	            return;
	        }

	        String topStudent = null;
	        int topScore = Integer.MIN_VALUE;

	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > topScore) {
	                topScore = entry.getValue();
	                topStudent = entry.getKey();
	            }
	        }

	        System.out.println("Student with the highest score: " + topStudent + " with score " + topScore);
	    }

	    public static void displayDescendingOrder(TreeMap<String, Integer> map) {
	        if (map.isEmpty()) {
	            System.out.println("No students available.");
	            return;
	        }

	        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
	        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

	        System.out.println("Students and their scores in descending order:");
	        for (Map.Entry<String, Integer> entry : list) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

		

	}


