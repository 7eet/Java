import java.nio.*;
import java.nio.file.*;
import static java.lang.System.out;
public class PathDemo{

	public static void main(String[] args){
		Path path = Paths.get("/home/dapps/Desktop/Tppp.java");
				
		System.out.println("Path: "+path.toString());
		

		for(var i = 0 ; i < path.getNameCount() ; i++ ){
			out.println("Element: "+i+" -> "+path.getName(i));
		}
		
		System.out.println("Get Root: "+path.getRoot());
		System.out.println("Get parent: "+path.getParent());	
		System.out.println("Get Filename: "+path.getFileName());
		Path parent = path.getParent();
		System.out.println("Is Absolute path: "+path.isAbsolute());
		System.out.println("To absolute path: "+path.toAbsolutePath());
	}
}
