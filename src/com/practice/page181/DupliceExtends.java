package com.practice.page181;
//c++�Ķ��ؼ̳��������⣺�����������أ�
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