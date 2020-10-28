package file_app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
public class DeleteFile {
	public void deletefile() throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file you need to delete");
		String del=sc.nextLine();
		File obj= new File(del);
		if(!obj.exists()) {
		System.out.println("Choose from the available files to delete");
		Sets s=new Sets();
		s.display();
		throw new FileNotFoundException();
	}	
		else {
			Sets s=new Sets();
			s.deleteset(del);
			obj.delete();
			System.out.println("Deleted Successfully");
		}
} 
}