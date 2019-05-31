//package com.practice.generic;
public class Gen1<T> {
	private T object;

	Gen1(T ob){
		
		this.object = ob;
	
	}

	public T getObject(){
	
		return this.object;
	}

	public String getType(){
	
		return ""+this.object.getClass().getName()+"";
	}
	
}
