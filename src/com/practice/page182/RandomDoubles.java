package com.practice.page182;

import java.util.Random;

public class RandomDoubles {
	public static void main (String args[]){
		//int a  = random.nextInt(10);
		//���Random(47)����Ľ�����ǹ̶���8
		//System.out.println(a);
	}
	private static Random random = new Random(47);
	public double next(){return random.nextDouble();}
	
}


