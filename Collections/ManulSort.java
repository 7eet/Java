
import java.util.*;
	
public class ManulSort implements Comparable<ManulSort>{
	private String name;
	private int id;
	
	ManulSort(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}

	public int getId(){
		return this.id;
	}

	public String toString(){
		return "Id:"+id+" Name:"+name+".";
	}
	
	public static void main(String[] args){
		List<ManulSort> list = new ArrayList<>();
		
		ManulSort ManulSort1 = new ManulSort("d",23);
		ManulSort ManulSort2 = new ManulSort("k",3);
		ManulSort ManulSort3 = new ManulSort("a",1);
		ManulSort ManulSort4 = new ManulSort("e",2);

		list.add(ManulSort1);
		list.add(ManulSort2);
		list.add(ManulSort3);
		list.add(ManulSort4);

		for(ManulSort s : list) System.out.println(s);
		
		Collections.sort(list);

		System.out.println();
		
		for(ManulSort s : list) System.out.println(s);

	}

	@Override
	public int compareTo(ManulSort s){
		return this.id-s.id;
	}
}
