package com.wipro.collection;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		Map m= new HashMap();
		
		m.put(23,"Mandar");
		m.put("Rahul","Mandar");
		m.put(23,"Sham");
		m.put("Raju",5);
		m.put(24,"sundar");
		
		for(Object obj: m.entrySet()) {
			Map.Entry entry = (Map.Entry)obj;
			Object key =entry.getKey();
			Object value=entry.getValue();
			System.out.println("key:" +key+ ", value:"+value);
		}
		
		
		
	}

}
