package com.shadowvip.util;

public class Range {
	/**
	 * 产生一个0——n的数组
	 * @param n
	 * @return
	 */
	public static int[] range(int n){
		int[] result = new int[n];
		for(int i = 0; i < n; i++){
			result[i] = i;
		}
		return result;
	}
	/**
	 * 产生一个start——end的数组
	 * @param start
	 * @param end
	 * @return
	 */
	public static int[] range(int start, int end){
		int n = end - start;
		int[] result = new int[n];
		for(int i = 0; i < n; i++){
			result[i] = start+i;
		}
		return result;
	}
	public static int[] range(int start, int end, int step){
		int n = (end - start)/step;
		int[] result = new int[n];
		for(int i = 0; i < n; i++){
			result[i] = start+i*step;
		}
		return result;
	}
}
