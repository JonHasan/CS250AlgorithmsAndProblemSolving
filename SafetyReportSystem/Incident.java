import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Incident {

	int day; 
	int month; 
	int year; 
	
	abstract void Date(int day, int month, int year) ;

	abstract void Stats(int severity);

	abstract void mean(int severity);
	
	public void displayStats(String filename){
    	
    	// variables for holding character count and line count 
    	int line_count = 0;
    	int char_count = 0; 
    	
    	//Make bufferedReader object and read first line
    	  try {
    		  BufferedReader inStream = new BufferedReader (new FileReader(filename)); 
    		  String line = inStream.readLine(); 
    		  
    		  //Loop through all lines while counting all characters. Increment counts
    		  while (line != null) { 
    			  for(int i = 0; i < line.length(); i++){
    				 char_count += 1; 
    			  }
    				  
    			  line_count += 1; 
    			  line = inStream.readLine(); 
    		  }
    		  
    		  //print out counts 
    		  System.out.println("Lines: " + line_count);
    		  
    		  System.out.println("Chars: " + char_count);
        	   
        	  
    		  inStream.close(); 
    		  
    	  } catch (FileNotFoundException e) {
    		  System.out.println("File not found: " + filename + "\n");
    		  e.printStackTrace(); 
    	  } catch (IOException e) {
    		  System.out.println("IOERROR: " + e.getMessage() + "\n"); 
    		  e.printStackTrace(); 
    	  }
    	  
    	  
    } // displayStats()
	
	int numIncidents(int low, int med, int high) {
		return (low + med + high); 
		
	}
	  
	
	
}
