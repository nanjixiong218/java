package com.shadowvip.util;

import java.io.PrintStream;

public class Print {
	/**
	 * ��ӡһ��
	 * @param obj
	 */
	public static void print(Object obj){
		System.out.println(obj);
	}
	/**
	 * ��ӡ����
	 */
	public static void print(){
		System.out.println();
	}
	/**
	 * �����д�ӡ
	 */
	public static void printnb(Object obj){
		System.out.print(obj);
	}
	/**
	 * �����ô�ã�
	 * @param format
	 * @param args
	 * @return
	 */
	public static PrintStream printf(String format,Object...args){
		return System.out.printf(format, args);
	}
	
}
