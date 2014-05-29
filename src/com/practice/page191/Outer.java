package com.practice.page191;
//练习1,3
public class Outer {//在Outer内部访问Inner都是内部类的Inner，覆盖掉了外部的 Inner
	private String name ="xuhuiyuan";
	 class Inner{
		private String name ="mengying";
		public String toString(){
			return name;
		}
	}
	static class InnerStatic{
		
	}
	public  Inner to(){
		return new Inner();
	}
	public static void main(String args[]){
		Outer o  = new Outer();
		Outer.Inner in = o.to();
		//Outer.Inner = to();这句话不能执行，因为必须用外部类对象创建非静态内部类
		Outer.Inner o1= o.new Inner();//但是可以这样
		String result = in.toString();
		InnerStatic inS = new InnerStatic();//静态内部类，因为main方法在类内部，所以不需要Outer指定
		System.out.print(result);
	}

}
class Inner{//居然可以同时有两个Inner
	
}
