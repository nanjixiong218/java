package com.practice.page191;
//��ϰ1,3
public class Outer {//��Outer�ڲ�����Inner�����ڲ����Inner�����ǵ����ⲿ�� Inner
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
		//Outer.Inner = to();��仰����ִ�У���Ϊ�������ⲿ����󴴽��Ǿ�̬�ڲ���
		Outer.Inner o1= o.new Inner();//���ǿ�������
		String result = in.toString();
		InnerStatic inS = new InnerStatic();//��̬�ڲ��࣬��Ϊmain���������ڲ������Բ���ҪOuterָ��
		System.out.print(result);
	}

}
class Inner{//��Ȼ����ͬʱ������Inner
	
}
