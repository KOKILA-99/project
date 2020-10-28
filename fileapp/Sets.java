package file_app;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	 public static final Set<String> file=new TreeSet<String>();
	 public void add() {
		File path= new File("E:\\phase1_project\\MyProject");
		FilenameFilter textFilefilter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				String Name = name.toLowerCase();
	            if (Name.endsWith(".txt")) {
	               return true;
	            } else {
	               return false;
			}
			}
			
		};
		String filesList[] = path.list(textFilefilter);
		for(String fileName : filesList) {
	         file.add(fileName);
		}
	 }
	 public int searchset(String name) {
		 int index = -1;
	        if(file.contains(name)){
	            index = ((TreeSet<String>)file).headSet(name).size();            
	        }
	        
	        return index;
	 }
	 public void display() {
		 Iterator<String> i = file.iterator();
	        while (i.hasNext()) 
	            System.out.println(i.next());
	 }
	public void addset(String name) {
		file.add(name);
	}
	public void deleteset(String name) {
		file.remove(name);
	}
        
}
