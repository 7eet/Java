/*
	This also displays Persons information using predicate function.
*/
class PersonsInfo {
	private String name;
	private int age;
	private char gender;
	
	PersonsInfo(String name, int age, char gender){
			this.name = name;
			this.age = age;
			this.gender = gender;
	}
	
	public String toString() { return name+" "+age+" "+gender;}
	
	public static void main(String[] args) {
		PersonsInfo[] person = new PersonsInfo[3];
		person[0] = new PersonsInfo("Third",31,'M');
		person[1] = new PersonsInfo("Second",23,'M');
		person[2] = new PersonsInfo("First",31,'F');
		
		java.util.function.Predicate<PersonsInfo> check = (PersonsInfo ps) -> ps.age>=30 & ps.gender=='M';
		//java.util.function.Predicate<PersonsInfo> checkGender = (PersonsInfo ps) -> ps.gender =='M';
		printPersonsInfo(person,check);
		}
		
		private static void printPersonsInfo(PersonsInfo[] p,java.util.function.Predicate<PersonsInfo> check) {
		for(int i=0 ; i<p.length;i++) {
			if(check.test(p[i])) {
				System.out.println(p[i].toString());}
			}
		
		} 
}
