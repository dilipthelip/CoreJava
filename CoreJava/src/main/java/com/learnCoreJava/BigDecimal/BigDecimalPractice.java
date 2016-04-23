package com.learnCoreJava.BigDecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalPractice {
	
	public static void main(String[] args) {
		
		BigDecimal bigDecimal=new BigDecimal("1.573");
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); 
		NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.CANADA); 
		String s = n.format(bigDecimal);
		String s1 = n1.format(bigDecimal);
		System.out.println("Cash value is  : "+ s);
		System.out.println("Cash value is  : "+ s1);
		BigDecimal bigDecimal1=new BigDecimal("1.5668");
		
		System.out.println(bigDecimal1.subtract(bigDecimal));
		System.out.println(bigDecimal1.add(bigDecimal));
		
		Double double1 = new Double("1.5667");
		Double double2 = new Double("1.5668");
		System.out.println(double2 - double1);
		System.out.println(double1+double2);
	}

}
