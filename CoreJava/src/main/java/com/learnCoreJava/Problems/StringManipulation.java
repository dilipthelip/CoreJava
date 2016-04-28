package com.learnCoreJava.Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringManipulation {


	/**
	 * This method is used to check the finally Constructed String has the Key elements or not
	 * @param iterator
	 * @param input
	 * @return
	 */
	public static boolean checkStringContinsKey(Set<String> set ,String input){
		boolean returnFlag=false;
		Iterator<String> iterator = set.iterator();
		String key = "";
		while(iterator.hasNext()){
			key = iterator.next();
			if(input.contains(key)){
				returnFlag =  true;
				break;
			}
		}

			
		return returnFlag;
	}

	public static void main(String[] args) {

		String input = "AABCD";
		Map<String,String> map = new LinkedHashMap<String, String>();
		map.put("AA" , "AB");
		map.put("AB" , "AC");
		map.put("AC" , "A");
		map.put("BC" , "AC");
		map.put("BB" , "B");
		System.out.println("Map : " + map);

		Set<String> set = map.keySet();

		Iterator<String> iterator = null;

		String key="";
		boolean flag=true;

		while(flag){
			iterator = set.iterator();
			while(iterator.hasNext()){
				key = iterator.next();
				if(input.contains(key)){
					//flag=true;
					input=input.replace(key, map.get(key));
				}
				System.out.println("Changed Input is :" + input);
			}

			flag = checkStringContinsKey(set,input);

		}


		System.out.println("Final output is : "+ input);






	}

}
