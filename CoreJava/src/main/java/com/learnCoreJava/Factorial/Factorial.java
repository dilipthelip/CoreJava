package com.learnCoreJava.Factorial;

import java.math.BigInteger;

public class Factorial {
	
	private static BigInteger factorial(BigInteger integerBig){
		int noOfIterations = integerBig.intValue();
		BigInteger finalVal = new BigInteger("1");
		
		for (int i = 1;i<=noOfIterations;i++){
				
			finalVal = finalVal.multiply(BigInteger.valueOf(i));
		}
		
		return finalVal;
		
	}
	
	public static void main(String[] args) {
		
		BigInteger bigInteger=new BigInteger("50");
		bigInteger = factorial(bigInteger);
		System.out.println(" finalVal : "+ bigInteger);
	}

}
