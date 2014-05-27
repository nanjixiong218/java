package com.practice.page123;
import com.practice.page123.*;


public class Test {
	public static void main(String args[]){
		ConnectionManager cm = new ConnectionManager();
		CMExtend cmt = new CMExtend();//这里向上转型根本无法访问到fillConns书上156页又错了？
		cmt.fillConns();
	}
	
	
}
