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
					//������ʲ���lable,���Ժ͹��캯���ĳ�ʼ��˳���ǲ�һ����
					//�����ǰ�˳��һ����ִ�еģ����캯�����Զ���ʼ�����ִ�еġ�
					//�������ʱ��ռ�ò�ƶ�û�з��䣬���������ʲ���label���ұ���Ϊ����˵Ӧ����null
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
