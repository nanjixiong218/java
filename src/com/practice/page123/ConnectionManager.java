/**
 * 书中123页练习题8，用ConnectionManager管理一个Connection数组,Connection无法自己创建自己，
 * 只能通过ConnectionManager获取
 */
package com.practice.page123;


public class ConnectionManager {
	private  int length =10; 
	private  Connection[] conns = new Connection[length] ;
	private  void fillConns(){//把填充conns抽离出来
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
	public static Connection makeConn(){//书上错了，在包外根本访问不到这个函数
		return new Connection();
	}
}
class CMExtend extends ConnectionManager{
	public void fillConns(){
		System.out.printf("I am %s", "xuhuiyuan");
	}
}
