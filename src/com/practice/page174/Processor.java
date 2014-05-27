package com.practice.page174;

import java.util.Arrays;

public class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	 Object process(Object input){
		return input;
	}
}
class Upcase extends Processor{
	@Override
	String process(Object input){
		return ((String)input).toUpperCase();//����ת�ͣ����inputΪ��String���󣬻��׳�����ʱ�쳣
	}
}
class Downcase extends Processor{
	@Override
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor{
	@Override
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}