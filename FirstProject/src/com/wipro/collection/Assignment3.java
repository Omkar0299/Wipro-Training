package com.wipro.collection;

import java.util.LinkedList;
import java.util.Scanner;

//Implement a LinkedList of custom objects (e.g., Student class with fields id, name, grade).
//Write methods to:
//Add a new student to the list.
//Remove a student by their id.
//Find a student by their name.


public class Assignment3 {

    public static void main(String[] args) {
        LinkedList<Studentt> studList = new LinkedList<Studentt>();
        
        addStudent(studList);
        
        removeStudent(studList, 1);
        //System.out.println(studList);

        findStudent(studList);
    }

    public static void addStudent(LinkedList<Studentt> studList) {
        Studentt s1 = new Studentt(1, "Omkar", 'A');
        Studentt s2 = new Studentt(2, "Rahul", 'B');
        Studentt s3 = new Studentt(3, "Pratik", 'C');
        Studentt s4 = new Studentt(4, "Saurabh", 'D');
        
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
    }
    
    public static void removeStudent(LinkedList<Studentt> studList, int id) {
        Studentt studentToRemove = null;
        for (Studentt student : studList) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            studList.remove(studentToRemove);
            System.out.println("Removed student with ID: " + id);
            
        } else {
            System.out.println("Student with ID: " + id + " not found.");
        }
        
    }

    public static void findStudent(LinkedList<Studentt> studList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name to find Student:");
        String name = scanner.nextLine();
        
        boolean studentFound = false;
        for (Studentt student : studList) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Valid Student: ID = " + student.getId() + ", Name = " + student.getName() + ", Grade = " + student.getGrade());
                studentFound = true;
                break;
            }
        }
        if (!studentFound) {
            System.out.println("Invalid Student");
        }
    }
    	
    }
