package com.practice.page174;
import static com.shadowvip.util.Print.*;




public class Apply {
	public static void process(Processor p,Object s){//����ǲ���ģʽ
		print("ʹ��:"+p.name());
		print(p.process(s));
	}
	public static String s = "my name is xuhuiyuan!";
	public static void main(String args[]){
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
	}
}
