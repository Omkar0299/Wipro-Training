package com.wipro.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMapClass4 {

	public static void main(String[] args) {
		HashMap<Integer,Student> studMap = new HashMap<Integer,Student>();
		
		Student s1 = new Student(100,"Om");
		Student s2 = new Student(5,"Raj");
		Student s3 = new Student(15,"Mayur");
		
		studMap.put(555, s1);
		studMap.put(666, s2);
		studMap.put(77, s3);
		
		for(Map.Entry<Integer, Student> obj : studMap.entrySet()) {
			Object key=obj.getKey();
			Object value=obj.getValue();
			System.out.println("key:"+key+ ", value:"+ value);		}
		

	}

}
