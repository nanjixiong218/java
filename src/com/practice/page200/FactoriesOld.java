package com.practice.page200;
/*
 * 对比实现工厂方法：不使用内部类
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
//比较结果：用内部类实现果然更加优雅，首先，不需要在外部为每个service实现都对应实现一个工厂类,然后还要创建工厂对象，这样实际上已经失去了工厂的意义。
//把工厂挪到了实现内部作为内部方法使用，语义性更明确，且在内部可以调用私有构造函数，这样构造函数就可以设为private了，用上old方法因为在工厂类中还是要new，所以构造方法至少要package权限
