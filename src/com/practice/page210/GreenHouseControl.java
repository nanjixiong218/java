package com.practice.page210;
import static com.shadowvip.util.Print.*;

import java.util.ArrayList;
import java.util.List;
public class GreenHouseControl extends Control{
	//�̳е����е�����û��eventList���ԣ���Ϊ��private�ģ�����Ӧ����û�аɣ�
	//���ǿ���ͨ���̳����ķ������ʵ�private����
	public static void main(String args[]){
		
		GreenHouseControl gc =new GreenHouseControl();
		//LightOff loff = gc.new LightOff(1223);//���main����������һ�����У�lightOff���Դ�������Ϊ����public��
		//LightOn lon = gc.new LightOn(1223);//���main����������һ�����У�lightOn���¾Ͳ��ܴ�����
		List<Event> eventList = new ArrayList<Event>();
		gc.addEvent(gc.new BellOn(10));
		gc.addEvent(gc.new LightOn(20));
		gc.addEvent(gc.new LightOff(400));
		eventList.add(gc.new LightOn(200));
		eventList.add(gc.new LightOff(400));
		gc.addEvent(gc.new Restart(1000, eventList));//restart��run�ظ�eventList�е��¼�,ֻ��3���¼�
		//�������Ƕ�׵�����ѭ��ô���ܹ�ִ�е�terminateô��
		if(args.length==1){
			gc.addEvent(new GreenHouseControl.Terminate(Long.parseLong(args[0])));
		}
		gc.run();//��һ��run��5���¼�
		
		
		
	}
	public void test(){
		new LightOff(11);//˽���ڲ���������������ⲿ����ʵ�����static�����У�
		
	}
	private  class LightOn extends Event{
		public LightOn(long delayTime){
			super(delayTime);
		}
		public void action(){
			print("light on!");
		}
	}
	public class LightOff extends Event{
		public LightOff(long delayTime){
			super(delayTime);
		}
		public void action(){
			print("light off!");
		}
	}
	private  class BellOn extends Event{
		public BellOn(long delayTime){
			super(delayTime);
		}
		public void action(){
			addEvent(new BellOn(100));//����ÿ��restart��ʱ������ʱ��
			print("Belling!");
		}
	}
	private class Restart extends Event{
		private List<Event> eventL; 
		public Restart (long delayTime, List<Event> eventL){
			super(delayTime);
			this.eventL = eventL;
		}
		public void action(){
			int i = 0,len = eventL.size();
			for(i=0; i<len; i++){
				addEvent(eventL.get(i));
			}
			addEvent(this);
			run();
		}
	}
	private static class Terminate extends Event{
		public Terminate(long delayTime){
			super(delayTime);
		}
		public void action(){
			print("everying Terminal!");
		}
	}
}
