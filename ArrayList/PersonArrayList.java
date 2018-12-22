import java.util.*;
class Person{
	String name;
	int age;
	char gender;
	
	private Person(){}
	
	public Person(String name,int age, char gender){
		this.name = name;
		this.age = age ;
		this.gender = gender;
	} 
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}
	
	@Override
	public String toString(){
		return name+" "+age+" "+gender+" ";
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Person){
			Person p = (Person)obj;
			if(this.name==p.name){
				if(this.age == p.age){
					if(this.gender == p.gender) return true;
					else 
						return false;
				}
				else 
					return false;
			}
			else 
				return false;
		}
		else 
			return false;
	} 
	
	

}

public class PersonArrayList{
	public static void main(String[] args){
		
		// creating Person object
		Person p = new Person("jef",23,'M');
		Person p1 = p;                                           // creating another person object 
										  //with reference to previous.
		
			// creating ArrayList.
			// here, argument 5 means initial capacity of arraylist is 5.
			// if you do not specify any argument, then default capacity is 10.
		ArrayList<Person> pList = new ArrayList<Person>(5);    
			
			// size gives you how many elements are in ArrayList
		System.out.println("Size of arraylist when it is instantiaed: "+pList.size());
			//adding elements to list.
		pList.add(p);
		pList.add(new Person("Bill",40,'F'));
		pList.add(p1);
		pList.add(new Person("Bill",40,'M'));
		
		System.out.println("Size of list : (after adding elements)  "+pList.size());
		System.out.println(pList);      // printing list.
		
		// if you comment equals method then
		// this displays false.It means it doesn't contain this person.
		// same for following two.
		
		System.out.println("contains person jef,23,M: "+ pList.contains(new Person("jef",23,'M')));   
		System.out.println("first occurence of Bill,40,F: "+pList.indexOf(new Person("Bill",40,'F')));

		System.out.println("last index of jef,23,M: "+pList.lastIndexOf(new Person("jef",23,'M')))	;	
			//removing Person object at index 0.
		pList.remove(0);
			// removing person object having name,age,gender are Bill40,F respectively.
		pList.remove(new Person("Bill",40,'F'));
		System.out.println("After removing Person at index 0 and Person Bill,40,F  .");
			
		Iterator<Person> i = pList.iterator();        
		while(i.hasNext()) { System.out.println(i.next());}
		
		//printEqualityTest(p, new Person("jef",23,'M'));
		
			// arry of person object		
		Person[] person = new Person[0];
			 	
		System.out.println("length of array when instantiated."+person.length);
			// moving arraylist to normal array.
		person = pList.toArray(new Person[0]); 
		
		for(Person ps : person) System.out.println(ps);

		System.out.println("Length of array after moving list to array is : "+person.length);
	}
			// method for equality test for person objects.
		public static void printEqualityTest(Person p1 , Person p2) {
			System.out.println("p1 == p2 : "+(p1==p2));
			System.out.println("p1.equalsp2 : "+p1.equals(p2)); 
		}	
		
			
}
