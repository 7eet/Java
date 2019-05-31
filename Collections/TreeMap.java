//package practice.collection;
import java.util.*;
	
public class Sample{
	public static void main(String[] args){
		Map<Integer,String> map = new TreeMap<>();	
		 map.put(1,"a");
		 map.put(2,"b");
		 map.put(3,"c");
		 System.out.println(map);  //{1=a , 2=b, 3=c}
		map.containsKey(2);  // return true if present otherwise false.
		map.containsValue("z"); // return true if present otherwise false.	
		map.get(2);   // return value mapped by key or null	
	}
}
