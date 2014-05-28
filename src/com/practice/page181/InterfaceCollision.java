package com.practice.page181;

class InterfaceCollision {//可以没有任何public类
	public static void main(String args[]){
		System.out.print("");
	}
}
interface I1 {void f();}
interface I2 {int f(int i);}
interface I3 {int f();}
interface I4 {void f();}
class C {public int f(){return 1;}}
class C1 implements I1,I4{
	public void f(){}
}
class C2 extends C implements I3{
	
}


