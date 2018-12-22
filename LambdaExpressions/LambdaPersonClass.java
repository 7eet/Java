class Person {
	private String name;
	private int age;
	private char gender;
	
	Person(String name, int age, char gender){
			this.name = name;
			this.age = age;
			this.gender = gender;
	}
	
	public String toString() { return name+" "+age+" "+gender;}
	
	public String getName() {return name;}
	
	public int getAge() {return age;}
	
	public char getGender() {return gender;}
	
}

public class LambdaPersonClass {
	 
	public static void main(String[] args) { 
	Person personF = new Person("First",23,'F');
	Person personS = new Person("Second",36,'F');
	Person personT = new Person("Third",40,'M');
	
	Checks check = p -> p.getAge()>=30 & p.getGender()=='M'; 
	printPersonInfo(personF,check);
	printPersonInfo(personS,check);
	printPersonInfo(personT,check);
	
}
	public static void printPersonInfo(Person p , Checks check) {
		if(check.test(p)) {System.out.println(p.toString());}
		else System.out.println("No");
	}
	interface Checks {
	boolean test(Person p);
}
 }
