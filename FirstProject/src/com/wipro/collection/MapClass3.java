package com.wipro.collection;
import java.util.HashMap;
import java.util.Map;

public class MapClass3 {

	public static void main(String[] args) {
		
		HashMap<Object,Object> mMap= new HashMap<Object,Object>();
		mMap.put("Raju", 6);
		mMap.put(6, "Ram");
		mMap.put(4, "Hanuman");
		mMap.put("Lakshman", "Ram");
		mMap.put(6, "Bharat");
		
		for(Map.Entry<Object, Object> obj:mMap.entrySet()) {
			Object key = obj.getKey();
			Object value =obj.getValue();
			System.out.println("key:" +key+ ",value:"+value);
		}
		
		
		

	}

}
