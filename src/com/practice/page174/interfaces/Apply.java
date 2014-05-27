package com.practice.page174.interfaces;

import static com.shadowvip.util.Print.print;

import java.util.Arrays;
abstract class StringProcessor implements Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);//这里必须用public，因为接口中的方法都是public，继承不允许降权
}

class Upcase extends StringProcessor{
	@Override
	public String process(Object input){//基类中的方法为public，继承的时候必须是Public，java继承不允许降权
		return ((String)input).toUpperCase();//向下转型，如果input为非String对象，会抛出运行时异常
	}
}
class Downcase extends StringProcessor{
	@Override
	public String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Splitter extends StringProcessor{
	@Override
	public String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
public class Apply {
	public static void process(Processor p,Object s){//这就是策略模式
		print("使用:"+p.name());
		print(p.process(s));
	}
	public static String s = "my name is xuhuiyuan!";
	public static void main(String args[]){
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
	}
}
