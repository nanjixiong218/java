package com.practice.page174.interfaces;

import com.practice.page174.BandPass;
import com.practice.page174.Filter;
import com.practice.page174.HighPass;
import com.practice.page174.LowPass;
import com.practice.page174.Waveform;

public class FilterProcessor {
	public static void main(String args[]){
		Waveform w  = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)),w);
		Apply.process(new FilterAdapter(new HighPass(1.0)),w);
		Apply.process(new FilterAdapter(new BandPass(1.0,2.0)),w);
	}
}

class FilterAdapter implements Processor{
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
