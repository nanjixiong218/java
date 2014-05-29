package com.practice.page200;
/*
 * 对比实现工厂方法：使用内部类
 */

public class Factories {
	public  static void ServiceConsumer(ServiceFactory fact){
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
}

interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{
	Service getService();
}
class ImplementService1 implements Service{
	private ImplementService1(){}
	public void method1(){
		System.out.println("ImplementsService1 method1!");
	}
	public void method2(){
		System.out.println("ImplementsService1 method1!");
	}
	public static ServiceFactory factory(){ 
		return new ServiceFactory(){
		public Service getService(){
			return new ImplementService1();
		}
		
	};
	}
}
class ImplementService2 implements Service{
	
	private ImplementService2(){}
	public void method1(){
		System.out.println("ImplementsService2 method1!");
	}
	public void method2(){
		System.out.println("ImplementsService2 method1!");
	}
	public static ServiceFactory fact= new ServiceFactory(){
		public Service getService(){
			return new ImplementService2();
		}
		
	};
}

