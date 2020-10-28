package file_app;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	public  void addfile() {
		System.out.println("Select the file you want to add:");
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		Scanner addinput=new Scanner(System.in);
		String name=addinput.nextLine();
		try {
			fos=new FileOutputStream(name);
			Sets s=new Sets();
			s.addset(name);
			System.out.println("File  " +name+" added Successfully");
		} catch (FileNotFoundException e) {
		System.out.println(e); 
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
