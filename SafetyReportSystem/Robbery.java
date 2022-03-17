
public class Robbery extends Incident {
	
	private String Robbery_records[];
	private String date[]; 
	private String Severity[]; 
	
	private int low_severity_count = 0;
	private int medium_severity_count = 0; 
	private int high_severity_count = 0; 
	private int count = 0; 
	
	
	public Robbery(){
		Robbery_records = new String[100]; 
	
	}
	
	public void add(String record) {
		   Robbery_records[count] = record; 
		   count +=1; 
	   }
	
	
	void Date(int month, int day, int year) {
		String date = Integer.toString(month) + '/' + Integer.toString(day) + '/' + Integer.toString(year); 
		
		System.out.println(date); 
	};
	
	void mean(int severity) {
		if(severity == 0) {
			low_severity_count += 1; 
			
		}
		else if(severity == 1) {
			medium_severity_count += 1; 
			
		}
		
		else if(severity == 2) {
			high_severity_count += 1; 
			
		}
		
		else {
			System.out.println("Invalid entry");
		}
	}
	
	void stddev() {}; 
	
	void Stats(int severity) {
		if(severity == 0) {
			
			double num = low_severity_count; 
			
			double denom = (low_severity_count + medium_severity_count + high_severity_count); 
			
			System.out.println("Low Severity mean: " + num/denom);
			
		}
		else if(severity == 1) {
			double num = medium_severity_count; 
			
			double denom = (low_severity_count + medium_severity_count + high_severity_count); 
			
			System.out.println("Medium Severity mean: " + num/denom); 
			
		}
		
		else if(severity == 2) {
			double num = high_severity_count; 
			
			double denom = (low_severity_count + medium_severity_count + high_severity_count); 
			
			System.out.println("High Severity mean: " + num/denom);
		}
		
		else {
			System.out.println("Invalid entry");
		}
	};
	
	
}


