/*
*	If a class implementing interfaces then, it must override abstract method.
*	Otherwise it won't compile.
*/

interface A{
	String stringInfo();
}
interface B {
	String stringInfo();
}
class AbstractMethods implements A,B{
public String stringInfo() {return "Class";}
	AbstractMethods(){
		System.out.println(stringInfo());		
	}	
	public static void main(String[] args){
		AbstractMethods i = new AbstractMethods();
	}
}
