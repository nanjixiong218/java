package com.practice.page171;

import static com.shadowvip.util.Print.*;
public class FieldAccess {
	public static void main(String args[]){
		Base b = new Ex();
		b.say();
		print(b.n);//˵�������Ȼ�����ж�̬��
		print(b.getN());//ֻ��ͨ��getN���ܷ��ʵ������n��
		print(b.getn());//
	}
}
abstract  class Base{
	public int n=2;
	public int getN(){
		return n;
	}
	public int getn(){
		return n;
	}
	public Base(){
		say();
	}
	public abstract void say();
}
class Ex extends Base{
	public int n=1;
	public int getN(){
		return n;
	}
	public int getn(){
		return n;
	}
	public void say(){
		print(n);
	}
}