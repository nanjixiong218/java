package com.practice.page210;

import java.util.ArrayList;
import java.util.List;

public class Control {
	private List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event e){
		this.eventList.add(e);
	}
	public void run(){
		int len = eventList.size();
		while(len>0){
			for(int i = 0; i<len; i++){
				if(eventList.get(i).ready()){
					eventList.get(i).action();
					eventList.remove(i);//这里remove会不会影响for循环的i指向？
					len--;
				}
			}
		}
	}

}
