package com.practice.page182;

import java.nio.CharBuffer;

//用接口实现的适配器

public class AdapterRandomDoubles extends RandomDoubles implements Readable{
	private int count;
	public AdapterRandomDoubles(int count){
		this.count=count;
	}
	public int read(CharBuffer cb){
		if(count--==0){
			return -1;
		}
		String result = Double.toString(next())+" ";
		cb.append(result);
		return result.length();
	}
}
