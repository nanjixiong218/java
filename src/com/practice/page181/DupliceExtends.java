package com.practice.page181;
//c++的多重继承菱形问题：体现在哪里呢？
public class DupliceExtends {

}
interface I11 {
	void first ();
}
interface I21 extends I11{
	void first();
}
interface I22 extends I11{
	void first();
}
class C11 implements I21,I22{
	public void first(){}
	public void second(){}
	public void third(){}
}