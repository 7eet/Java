/*
*	rules of abstract methods applies also to default methods.
*/

interface A{
	default String stringInfo(){return "A";}
}
interface B {
	default String stringInfo(){return "B";}
}
class DefaultMethods implements A,B{
public  String stringInfo() {return "Class";}
	DefaultMethods(){
		System.out.println(stringInfo());	
	}	
	public static void main(String[] args){
		DefaultMethods i = new DefaultMethods();
	}
}
