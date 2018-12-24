import java.util.List;
import java.util.ArrayList; 
public class ArrayListString{
	public static void main(String[] args){
		List<String> listOfString = new ArrayList<String>();
		System.out.println("Size of list: "+listOfString.size());  
// size() - give the size of arraylist.   
		System.out.println("Is it empty ? "+listOfString.isEmpty());    
 // .isEmpty() - gives true if list is empty. Otherwise, gives false.
		
		/* Adding elements to list by .add() method
			There are two methods for adding element in ArrayList:
		 		1)  add(E element) 
		 		2)  add(index,E element )		 		
		*/
		System.out.println("Adding elements to list...");
		listOfString.add("First");    
		listOfString.add("Second");
		listOfString.add("Third");
		listOfString.add(3,"Fourth");       // adding "fourth" string at index 3
		listOfString.add("Fourth");                
// yes, an ArrayList can contains duplicate values.
		listOfString.add(0,"Zero");    // adding "zero" string at index 0
		
		System.out.println("Print List: "+listOfString);
		System.out.println("Size of list: "+listOfString.size());
		System.out.println("Is list Empty? "+listOfString.isEmpty());
		System.out.println("list contains string \"Zero\" ? "+listOfString.contains("Zero"));   
// contains(E e) - gives true if the Object is in the arraylist. Otherwise , gives false.
//System.out.println(listOfString.contains(3));
		System.out.println("index of(\"Fourth\") : "+listOfString.indexOf("Fourth"));    
// return(index) first occurence of element
		System.out.println("Last index of (\"Fourth\") : "+listOfString.lastIndexOf("Fourth"));   
// return(index) last occurence of element
		System.out.println("Get element at index 3 : "+listOfString.get(3));
		
		System.out.println("Replace the third index with \"3\" ."+listOfString.set(3,"3"));   
// replace string "3" at index 3 
		System.out.println("List after replace: "+listOfString);
		System.out.println("Remove string \"Zero\" from list. "+listOfString.remove(0)); 
// removes element at index zero.
		
		System.out.println("Remove String \"3\" ."+listOfString.remove("3"));
// removes string "3" from list.

		System.out.println("Now List is :  "+listOfString);
		System.out.println("Remove everything");
		listOfString.clear();
		System.out.println("After clear : "+listOfString);
		
		//String[] copyOfArrayList = listOfString.toArray(new String[listOfString.size()]);

		
 	}
}
