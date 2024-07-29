package com.wipro.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	public static void main(String[] agr) {
	Queue queue = new LinkedList();

    
    queue.add("Apple");
    queue.add("Banana");
    queue.add("Cherry");
    queue.add("Date");
 

    // Displaying the Queue after removal
    System.out.println( queue);

    

    // Checking if the Queue is empty
    boolean isEmpty = queue.isEmpty();
    System.out.println("Is Queue empty? " + isEmpty);
   

}
}
