
interface A{
	static String stringInfo(){return "A";}
}
interface B {
	static String stringInfo(){return "B";}
}
class StaticMethods implements A,B{
//public  String stringInfo() {return "Class";}
	StaticMethods(){
		System.out.println("..");	
		System.out.println(A.stringInfo());
		System.out.println(B.stringInfo());
	}	
	public static void main(String[] args){
		StaticMethods i = new StaticMethods();
	}
}
