package com.shadowvip.util;

import java.io.PrintStream;

public class Print {
	/**
	 * 打印一行
	 * @param obj
	 */
	public static void print(Object obj){
		System.out.println(obj);
	}
	/**
	 * 打印空行
	 */
	public static void print(){
		System.out.println();
	}
	/**
	 * 不换行打印
	 */
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	/**
	 * 这个怎么用？
	 * @param format
	 * @param args
	 * @return
	 */
	public static PrintStream printf(String format,Object...args){
		return System.out.printf(format, args);
	}
	
}
