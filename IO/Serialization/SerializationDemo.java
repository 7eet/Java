import java.io.*;
public class SerializationDemo{
	
	
	public static void main(String[] args){
			
			try(FileOutputStream fileOut = new FileOutputStream("serial.txt");
					ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)){
					
					Employee emp = new Employee(1,"Steph",31,"Marketing");
					
					objectOut.writeObject(emp);
					System.out.println("Successful.");
					
					}catch(FileNotFoundException f){f.printStackTrace();}
					catch(IOException e){e.printStackTrace();}
	}
}