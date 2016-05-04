package com.learnCoreJava.Factorial;

import java.math.BigInteger;
import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.learnCoreJava.CommonUtil;

public class Factorial {
	
	private static Logger logger = Logger.getLogger(Factorial.class.getName());
	
	
	private static BigInteger factorial(BigInteger integerBig) throws Exception{
		int noOfIterations = integerBig.intValue();
		BigInteger finalVal = new BigInteger("1");
		
		for (int i = 1;i<=noOfIterations;i++){
				
			finalVal = finalVal.multiply(BigInteger.valueOf(i));
		}
		
		factorial1();
		return finalVal;
		
	}
	
	private static void factorial1() throws Exception {
		// TODO Auto-generated method stub
		factorial2();
	}

	private static void factorial2() throws Exception {
		// TODO Auto-generated method stub
		
		String s = null;
		
		s.toLowerCase();
		
	}
	
	
	public static void main(String[] args) {
		
		BigInteger bigInteger=new BigInteger("50");
		try {
			bigInteger = factorial(bigInteger);
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(CommonUtil.getStackTrace(e));
			
		}
	}

}
