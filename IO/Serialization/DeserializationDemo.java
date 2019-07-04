import java.io.*;
public class DeserializationDemo{
	public static void main(String[] args){
		
		try(
		FileInputStream fileIn = new FileInputStream("serial.txt");
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);){
		
		Object obj = objectIn.readObject();
		if(obj instanceof Employee){
			Employee emp = (Employee)obj;
			System.out.println(emp);
			System.out.println("Done");
		}
			
			
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException c){
			c.printStackTrace();
		}
	
	}
}