package com.learning.algo.interview;

import java.util.Random;

public class PI {
	
	public static double calPI(int N){
		Random rd = new Random();
		int count = 0;
		int temp =N;
		while(temp-- > 0){
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		if(x*x + y*y <1)
			count++;
		}
//		System.out.println(count/N);

		return (double) 4.0*count/N;
	}
	
	public static void main(String[] args) {
		System.out.println(calPI(100000));
	}
	

}
