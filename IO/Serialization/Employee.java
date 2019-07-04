import java.io.Serializable;

public class Employee implements Serializable{
	
	private static int id ;
	private String name = null;
	private int age = 0;
	private String department = null;
	
	public Employee(int id, String name, int age, String department){
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	public Employee(){
		this.id = 0;
		this.name = null;
		this.department = null;
		this.age =0;
	}
	
	public void setName(String name){this.name = name;}
	public String getName(){return name;}
	public void setDepartment(String department){this.department = department;}
	public String getDepartment(){return department;}
	public int getAge(){return age;}
	public void setAge(int age){this.age = age;}
	
	@Override
	public String toString(){
		return "Name: "+name+"\tId: "+id+"\tDepartment: "+department+"\tAge: "+age+"\n";
	}
}
