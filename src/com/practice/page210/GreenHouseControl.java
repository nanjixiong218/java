package com.practice.page210;
import static com.shadowvip.util.Print.*;

import java.util.ArrayList;
import java.util.List;
public class GreenHouseControl extends Control{
	//继承的类中到底有没有eventList属性？因为是private的，所以应该是没有吧？
	//但是可以通过继承来的方法访问到private属性
	public static void main(String args[]){
		
		GreenHouseControl gc =new GreenHouseControl();
		//LightOff loff = gc.new LightOff(1223);//如果main方法是在另一个类中，lightOff可以创建，因为它是public的
		//LightOn lon = gc.new LightOn(1223);//如果main方法是在另一个类中，lightOn恐怕就不能创建了
		List<Event> eventList = new ArrayList<Event>();
		gc.addEvent(gc.new BellOn(10));
		gc.addEvent(gc.new LightOn(20));
		gc.addEvent(gc.new LightOff(400));
		eventList.add(gc.new LightOn(200));
		eventList.add(gc.new LightOff(400));
		gc.addEvent(gc.new Restart(1000, eventList));//restart的run重复eventList中的事件,只有3个事件
		//不会出现嵌套的无限循环么？能够执行到terminate么？
		if(args.length==1){
			gc.addEvent(new GreenHouseControl.Terminate(Long.parseLong(args[0])));
		}
		gc.run();//第一轮run有5个事件
		
		
		
	}
	public void test(){
		new LightOff(11);//私有内部类可以在其所在外部类访问到（非static方法中）
		
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
			addEvent(new BellOn(100));//设置每次restart的时候响铃时间
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
