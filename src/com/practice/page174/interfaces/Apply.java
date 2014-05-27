package com.practice.page174.interfaces;

import static com.shadowvip.util.Print.print;

import java.util.Arrays;
abstract class StringProcessor implements Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);//���������public����Ϊ�ӿ��еķ�������public���̳в�����Ȩ
}

class Upcase extends StringProcessor{
	@Override
	public String process(Object input){//�����еķ���Ϊpublic���̳е�ʱ�������Public��java�̳в�����Ȩ
		return ((String)input).toUpperCase();//����ת�ͣ����inputΪ��String���󣬻��׳�����ʱ�쳣
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
