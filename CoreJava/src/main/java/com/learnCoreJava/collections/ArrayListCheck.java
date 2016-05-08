package com.learnCoreJava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCheck {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(){
			{
				add("String A");
				add("String B");
				add("String C");
			}

		};

		List<String> list1 = new ArrayList<String>(){
			{
				add("String J");
				add("String B");
				add("String C");
			}

		};
		
		/**
		 * Using equals method.
		 */
		for(int i=0;i<list.size();i++){

			for(int j=0;j<list1.size();j++){
				if(list.get(i).equals(list1.get(j))){
					System.out.println(list.get(i));
				}
			}
		}
		
		/**
		 * Using contains implementation.
		 */
		for(int i=0;i<list.size();i++){
				if(list1.contains(list.get(i))){
					System.out.println(list.get(i));
				}
			}
	}
}
