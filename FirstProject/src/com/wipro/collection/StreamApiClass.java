package com.wipro.collection;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiClass {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Apple", "Banana","Graphes","Cherry", "Dates");
		
		List<String> l=list.stream().filter(x->x.startsWith("B")).collect(Collectors.toList());
		System.out.println(l);
		
		List<String> stList=list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(stList);
		//list.stream().map(x->x.toUpperCase()).collect(Collectors.toList()).forEach(x->System.out.println(x));
		
		list.stream().sorted((x,y)->x.compareTo(y)).forEach(x->System.out.println(x));	
		
		List<Integer> intList = Arrays.asList(5,1,4,9,12,15,19);
		
		Optional<Integer> min= intList.stream().min((x,y)->x.compareTo(y));		
		min.ifPresent(value->System.out.println(value));
		
		Optional<Integer> max =intList.stream().max((x,y)->x.compareTo(y));
		max.ifPresent(value->System.out.println(value));
		
		Map<String,Integer> ageMap = new LinkedHashMap<>();
		
		ageMap.put("philip", 37);
		ageMap.put("rk", 35);
		ageMap.put("sameera", 25);
		ageMap.put("kushvanth", 65);
		
		List<Integer> doubleValues = ageMap.values().stream().map(x -> x*2).collect(Collectors.toList());
		
		
		System.out.println(doubleValues);
		
		List<Customer> cusList=DataBase.getAll();
		List<List<String>> phoneList= cusList.stream().map(x->x.getPhoneNumbers()).collect(Collectors.toList());
		
		System.out.println(phoneList);
		List<String> l1=cusList.stream().flatMap(x->x.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(l1);
		}
}


