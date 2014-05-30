package com.practice.page210;

public abstract class Event {
	private long eventTime;
	private long delayTime;
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();//创建对象的时候就启动
	}
	public void start(){
		this.eventTime = System.nanoTime()+delayTime;
	}
	public Boolean ready(){
		return System.nanoTime()>this.eventTime;
	}
	abstract void action();//这里默认也是public的么，和接口一样？看来不是，其实现可以是包权限的

}
