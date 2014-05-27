package com.practice.page174;

import com.practice.page174.Apply;

public class FiterAdaperExtends {
	
	public static void main(String args[]){//���ýӿ�Ҳ��ȫ���԰������Ͻ��Ľӿ������������ʵ��Processorû�������ִ��˰ɣ�
		Waveform w  = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)),w);
		Apply.process(new FilterAdapter(new HighPass(1.0)),w);
		Apply.process(new FilterAdapter(new BandPass(1.0,2.0)),w);
	}
}

class FilterAdapter extends Processor{
	Filter filter;
	public FilterAdapter(Filter filter){
		this.filter = filter;
	}
	public String name(){
		return this.filter.name();
	}
	public Waveform process(Object input){
		return filter.process((Waveform)input);
	}
}
