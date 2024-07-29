package com.wipro.collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapClass2 {

	public static void main(String[] args) {
		HashMap<Integer,String> lMap= new HashMap<Integer,String>();
		lMap.put(4, "Leo");
		lMap.put(55, "Leo Das");
		lMap.put(2, "Rolex");
		lMap.put(41, "Tiger");
		
		for(Map.Entry<Integer, String> obj: lMap.entrySet()) {
			
			Object key=obj.getKey();
			Object value=obj.getValue();
			System.out.println("key:"+key+ ", value:"+ value);
			}

	}

}
