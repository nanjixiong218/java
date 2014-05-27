package com.practice.page174;
import static com.shadowvip.util.Print.*;




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
