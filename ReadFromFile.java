import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFromFile {
	
	String path;
	
	ReadFromFile(String p){
		path = p;
	}

	public ArrayList<String> readFile() throws Exception{ 
	  // We need to provide file path as the parameter: 
	  // double backquote is to avoid compiler interpret words 
	  // like \test as \t (ie. as a escape sequence) 
	  File file = new File(path); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  ArrayList<String> ar = new ArrayList<String>();
	  
	  String st; 
	  while ((st = br.readLine()) != null) ar.add(st);
	  
	  //st = br.readLine();
	  return ar;
	    //System.out.println(st); 
	
	  } 
}
