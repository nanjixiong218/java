package com.practice.page171;

import static com.shadowvip.util.Print.*;
public class FieldAccess {
	public static void main(String args[]){
		Base b = new Ex();
		b.say();
		print(b.n);//说明了域果然不具有多态性
		print(b.getN());//只用通过getN才能访问到子类的n，
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