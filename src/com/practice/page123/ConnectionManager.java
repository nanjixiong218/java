/**
 * ����123ҳ��ϰ��8����ConnectionManager����һ��Connection����,Connection�޷��Լ������Լ���
 * ֻ��ͨ��ConnectionManager��ȡ
 */
package com.practice.page123;


public class ConnectionManager {
	private  int length =10; 
	private  Connection[] conns = new Connection[length] ;
	private  void fillConns(){//�����conns�������
		for(int i =0,len=this.length; i <len ; i++){
			this.conns[i] = Connection.makeConn();
		}
	}
	public ConnectionManager(){
		fillConns();
	}
	public ConnectionManager(int n){
		this.length = n;
		this.conns = new Connection[n];
		fillConns();
	}
	public  Connection getOneConn(){
		Connection result;
		if(length==0){
			result = null;
		}
		result =  conns[length-1];
		length = length-1;
		return result;
	}
}
class Connection{
	private Connection(){
		
	}
	public static Connection makeConn(){//���ϴ��ˣ��ڰ���������ʲ����������
		return new Connection();
	}
}
class CMExtend extends ConnectionManager{
	public void fillConns(){
		System.out.printf("I am %s", "xuhuiyuan");
	}
}
