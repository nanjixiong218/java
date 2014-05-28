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
		return ((String)input).toUpperCase();//向下转型，如果input为非String对象，会抛出运行时异常
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