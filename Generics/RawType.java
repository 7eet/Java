//package com.practice.Baseeric;
class Base<T> {
	
	T obj;
	
	Base(T o){
		
		this.obj = o;
	}
	
	T getOb(){
		return this.obj;
	}
}


public class RawType{

	public static void main(String[] args){
		
		Base<Integer> iOb = new Base<>(2);  
	
		Base<Double> dOb = new Base<>(2.0);
	
		Base gOb = new Base(23);  // gives warning because, this is 
					// raw type 

		dOb = gOb; 
		
		double value = (Double)dOb.getOb();
		
		System.out.println(value);	
	

	}
}
