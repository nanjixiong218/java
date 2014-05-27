package com.practice.page174;

public class Waveform {
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return "Waveform"+id;
	}
}
