interface A{
	int MIN = 1;
}
interface B {
	int MIN = 2;
}
class Constants implements A,B{

	Constants(){
		System.out.println(MIN);                      // ambigious state.(which variable call
										//compiler either A or B.)
		System.out.println(A.MIN);
		System.out.println(B.MIN);
		
	}	
	public static void main(String[] args){
		Constants i = new Constants();
	}
}
