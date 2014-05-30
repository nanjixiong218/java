package com.practice.page210;

public abstract class Event {
	private long eventTime;
	private long delayTime;
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();//���������ʱ�������
	}
	public void start(){
		this.eventTime = System.nanoTime()+delayTime;
	}
	public Boolean ready(){
		return System.nanoTime()>this.eventTime;
	}
	abstract void action();//����Ĭ��Ҳ��public��ô���ͽӿ�һ�����������ǣ���ʵ�ֿ����ǰ�Ȩ�޵�

}
