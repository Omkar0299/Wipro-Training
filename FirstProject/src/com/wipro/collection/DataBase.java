package com.wipro.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {
	
	public static List<Customer> getAll(){
		
		return Stream.of( new Customer(101,"Omkar", "omkar@gmail.com",Arrays.asList("555555","66666")),
				new Customer(102,"Raj", "raj@gmail.com",Arrays.asList("44444","88888")),
				new Customer(103,"Rahul", "rahul@gmail.com",Arrays.asList("11111","99999"))
				).collect(Collectors.toList());
				
	}

	
}
