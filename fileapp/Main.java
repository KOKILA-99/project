package file_app;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
     public static void main(String args[]){
    	 boolean c = true;
        System.out.println("WELCOME TO Lockers Pvt. Ltd.");
        Sets s=new Sets();
        s.add();
        
        do {
        	try {
    		System.out.println("The choices are:");
            System.out.println("1.Display files in ascending order\n2.Adding a file\n3.Delete a file\n4.Search a file\n5.Close the application");
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the choice:");
        	int choice=sc.nextInt();
    	switch(choice) {
    	case 1:
    		System.out.println("Displaying files in ascending order");
    		s.display();
    		break;
    	case 2:
    		AddFile add=new AddFile();
    		add.addfile();
    		break;
    	case 3:
    		DeleteFile delete= new DeleteFile();
    		try {
				delete.deletefile();
			} catch (FileNotFoundException e) {
				System.out.println("The requested File Not Found ");
			}
    		break;
    	case 4:
    		SearchFile search=new SearchFile();
    		try {
    			search.searchFile();
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFound ");
			}
    		break;
    	case 5:
    		System.out.println("Exiting from the application");
    		System.exit(0);
    		break;
    	default:
    		System.out.println("Choose the valid options");   		
    		break;
    	}
    	System.out.println("Press y to continue or press any other keys to exit ");
    	char x = sc.next().charAt(0);
    	if(x!='y') {
    	   c=false;
    	   System.out.println("Closing the application");
    	}
        	}
    	catch(Exception e)
        {
        	System.out.println("Give the correct input");
        	}
    	}while(c);
        }
}
