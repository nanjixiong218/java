package com.practice.page199;

public class Anonymous {
	public static void main(String args[]){
		Anonymous a = new Anonymous();
		Destination dIn = a.destination("xuhuiyuan", 111.11F);
		
	}
	public Destination destination(final String dest,final float price){
		return new Destination(){
			private int cost;
			{
				
				cost = Math.round(price);
				if(cost>100){
					System.out.println("over budget");
					//System.out.println(label);
					//这里访问不到lable,所以和构造函数的初始化顺序还是不一样，
					//这里是按顺序一步步执行的，构造函数是自动初始化完后执行的。
					//而且这个时候空间貌似都没有分配，根本都访问不到label，我本以为按理说应该是null
				}
			}
			private String label = dest;
			{
				System.out.println(label);
			}
			public String readLabel (){
				return label;
			}
		};
		
	}
	
}
class Destination {
	
}
