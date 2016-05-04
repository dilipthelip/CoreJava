package com.learnCoreJava.Problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringManipulation1 {
	
	public static void main(String[] args) {
		
		String input = "AABCDBC";
		char[] c1 = input.toCharArray();
		char[] c2 = input.toCharArray();
		
		
		Map<String,String> map = new LinkedHashMap<String, String>();
		map.put("BC" , "AC");
		map.put("AA" , "AB");
		map.put("AB" , "AC");
		map.put("AC" , "A");
		map.put("BB" , "B");
		System.out.println("Map : " + map);

		Set<String> set = map.keySet();

	}

}
