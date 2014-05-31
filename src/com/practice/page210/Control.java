package com.practice.page210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class Control {
	private List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event e){
		this.eventList.add(e);
	}
	public void run(){
		//这里的需用迭代器都不可以
		while(eventList.size()>0){
			
			for(Event e :new ArrayList<Event>(eventList)){
				if(e.ready()){
					e.action();
					eventList.remove(e);
				}
			}
		}//还有一个问题  ：为什么restart的时候Belling也执行了？
		
	}

}
