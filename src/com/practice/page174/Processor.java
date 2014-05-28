package com.practice.page174;

import java.util.Arrays;

abstract public class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	abstract Object process(Object input);
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