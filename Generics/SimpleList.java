//package com.practice.generic;
import java.util.*;
class SimpleList<T> {
	private List<T> list; 

	SimpleList(){}	

	private List<T> createList(){
		list = new ArrayList<T>();		
		return list;
	}

	private boolean addElement(T t){
		list.add(t);
		return true;
	}	
	
	private void printElements(){
		Iterator<T> iterator = list.iterator();		
		while(iterator.hasNext()) {
			var i = iterator.next();
			System.out.println(i);
		}
	}

public static void main(String []args) {
		System.out.println("Begin...");		
		SimpleList<Integer> SimpleList = new SimpleList<>();
		SimpleList.createList();
		SimpleList.addElement(3);
		SimpleList.addElement(4);
		SimpleList.printElements();
		System.out.println("Done");
	}
}
