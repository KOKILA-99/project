package file_app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchFile {
	public void searchFile() throws FileNotFoundException {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the file you need to search");
			String search=sc.nextLine();
			File obj= new File(search);
			
			if(!obj.exists()) {
			
			throw new FileNotFoundException();
		}	
			else {
				Sets s=new Sets();
				int c=s.searchset(search);
				System.out.println("The file "+search+" found  in position "+(c+1));

			}
	} 
		
	}


