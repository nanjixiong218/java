package com.practice.page200;
/*
 * �Ա�ʵ�ֹ�����������ʹ���ڲ���
 */

public class FactoriesOld {
	public  static void ServiceConsumer(ServiceFactoryOld fact){
		ServiceOld s = fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String args[]){
		ServiceConsumer(new Imp1FactoryOld1());
		ServiceConsumer(new Imp1FactoryOld2());
	}
}
interface ServiceOld{
	void method1();
	void method2();
}
interface ServiceFactoryOld{
	ServiceOld getService();
}
class ImplementServiceOld1 implements ServiceOld{
	public ImplementServiceOld1(){}
	public void method1(){
		System.out.println("ImplementsService1 method1!");
	}
	public void method2(){
		System.out.println("ImplementsService1 method1!");
	}
	
	
}
class Imp1FactoryOld1 implements ServiceFactoryOld{
	public ServiceOld getService(){
		return new ImplementServiceOld1();
	}
}
class ImplementServiceOld2 implements ServiceOld{
	public ImplementServiceOld2(){}
	public void method1(){
		System.out.println("ImplementsService2 method1!");
	}
	public void method2(){
		System.out.println("ImplementsService2 method1!");
	}
	
}
class Imp1FactoryOld2 implements ServiceFactoryOld{
	public ServiceOld getService(){
		return new ImplementServiceOld2();
	}
}
//�ȽϽ�������ڲ���ʵ�ֹ�Ȼ�������ţ����ȣ�����Ҫ���ⲿΪÿ��serviceʵ�ֶ���Ӧʵ��һ��������,Ȼ��Ҫ����������������ʵ�����Ѿ�ʧȥ�˹��������塣
//�ѹ���Ų����ʵ���ڲ���Ϊ�ڲ�����ʹ�ã������Ը���ȷ�������ڲ����Ե���˽�й��캯�����������캯���Ϳ�����Ϊprivate�ˣ�����old������Ϊ�ڹ������л���Ҫnew�����Թ��췽������ҪpackageȨ��
