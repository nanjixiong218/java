package com.practice.page182;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable{
	private static Random random= new Random(47);//这个47是干嘛的，seed是什么东西
	private static final char[] uppers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	
	private int count;
	public RandomWords(int  count){
		this.count =count;
	}
	
	public int read(CharBuffer cb){
		if(count--==0){
			return -1;
		}
		cb.append(uppers[random.nextInt(uppers.length)]);
		cb.append(lowers[random.nextInt(lowers.length)]);
		cb.append(vowels[random.nextInt(vowels.length)]);
		cb.append(" ");
		return 1;//意义何在？
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(new RandomWords(5));
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}
}
