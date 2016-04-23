package com.learnCoreJava.BigDecimal;

import java.math.BigDecimal;

public class BigDecimalPractice {
	
	public static void main(String[] args) {
		
		BigDecimal bigDecimal=new BigDecimal("1.5667");
		BigDecimal bigDecimal1=new BigDecimal("1.5668");
		
		System.out.println(bigDecimal1.subtract(bigDecimal));
		System.out.println(bigDecimal1.add(bigDecimal));
		
		Double double1 = new Double("1.5667");
		Double double2 = new Double("1.5668");
		System.out.println(double2 - double1);
		System.out.println(double1+double2);
	}

}
