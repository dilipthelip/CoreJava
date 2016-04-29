package com.learnCoreJava.Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *	String Problem :
 * It the String contains AA replace with AB. Pattern is given below
 * Original String->Replace String
 * 		AA->AB
 * 		AB->AC
 * 		AC->A
 * 		BC->AC
 * 		BB->B
 * Print the Final Output
 * @author Z001QGD
 *
 */
public class StringManipulation {


	/**
	 * This method is used to check the finally Constructed String has the Key elements or not.
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
		
		//System.out.println("Enter something here : ");
		String input ="";
		/*try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    input = bufferRead.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}*/

		input = "AABCDBC";
		Map<String,String> map = new LinkedHashMap<String, String>();
		map.put("BC" , "AC");
		map.put("AA" , "AB");
		map.put("AB" , "AC");
		map.put("AC" , "A");
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
					input=input.replaceFirst(key, map.get(key));
				}
				System.out.println("Changed Input is :" + input);
			}

			flag = checkStringContinsKey(set,input);

		}


		System.out.println("Final output is : "+ input);






	}

}
