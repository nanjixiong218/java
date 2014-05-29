package com.practice.page182;

import java.util.Random;

public class RandomDoubles {
	public static void main (String args[]){
		//int a  = random.nextInt(10);
		//如果Random(47)这里的结果就是固定的8
		//System.out.println(a);
	}
	private static Random random = new Random(47);
	public double next(){return random.nextDouble();}
	
}


