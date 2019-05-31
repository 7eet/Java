//package com.practice.generic;
//import com.practice.generic.*;

public class Gen1Demo {
	
	public static void main(String[] args){
	
		Gen1<Integer> integerObject = new Gen1<Integer>(40);

		int value = integerObject.getObject();
		
		System.out.println(value);

		String typeOfObject = integerObject.getType();

		System.out.println(typeOfObject);
	}

}
