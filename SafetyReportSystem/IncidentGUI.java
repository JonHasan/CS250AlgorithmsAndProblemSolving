import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class IncidentGUI extends JFrame implements ActionListener{
	//Define components of class here 
	
	private JLabel prompt = new JLabel("Choose a safety issue to report:  ");
	private JRadioButton Assault;
	private JRadioButton Vandalism;
	private JRadioButton Robbery;
	
	private JRadioButton Low_Severity;
	private JRadioButton Moderate_Severity;
	private JRadioButton High_Severity;
	
	
	private JTextArea Description;
	
	private JButton Record; 
	
	private JButton Stats;
	private JTextArea StatsSummary; 
	
	private JButton Clear; 
	
	Assault assault;
	
	Robbery robbery; 
	
	Vandalism vandalism; 

	IncidentGUI(){
		
	
	      //Create the flowLayout
	     getContentPane().setLayout(new FlowLayout());  //added 
	     
	     assault = new Assault(); 
	     
	     robbery = new Robbery(); 
	     
	     vandalism = new Vandalism(); 
	    
	     Assault = new JRadioButton("Assault", true);
	     Vandalism = new JRadioButton("Vandalism");
	     Robbery = new JRadioButton("Robbery");
	     
	     Low_Severity = new JRadioButton("Low Severity", true);
	     Moderate_Severity = new JRadioButton("Moderate Severity");
	     High_Severity = new JRadioButton("High Severity"); 
	      
	     Description = new JTextArea("", 5,20);
	      
	     
	     StatsSummary = new JTextArea("", 5, 20); 
	
	     Record = new JButton("Record"); 
	     Stats = new JButton("Print statistics");
	     
	      
	      
	     //Add elements of GUI as well as define actionlisteners for events 
	    getContentPane().add(prompt);
	     
	    ButtonGroup bgroup = new ButtonGroup(); 
		bgroup.add(Assault); 
		bgroup.add(Vandalism);
		bgroup.add(Robbery); 
		
		 ButtonGroup cgroup = new ButtonGroup(); 
			cgroup.add(Low_Severity); 
			cgroup.add(Moderate_Severity);
			cgroup.add(High_Severity); 
	     
	     
	     
	     
	     
	      
	     getContentPane().add(Assault);
	     Assault.addActionListener( this );
	      
	     getContentPane().add(Vandalism);
	     Vandalism.addActionListener( this );
	      
	     getContentPane().add(Robbery);
	     Robbery.addActionListener( this );
	     
	     getContentPane().add(Low_Severity);
	     Assault.addActionListener( this );
	      
	     getContentPane().add(Moderate_Severity);
	     Vandalism.addActionListener( this );
	      
	     getContentPane().add(High_Severity);
	     Robbery.addActionListener( this );
	      
	     getContentPane().add(StatsSummary); 
	     
	     getContentPane().add(Stats);
	     Stats.addActionListener( this );
	    
	     
	     getContentPane().add(Description);
	     
	     getContentPane().add(Record); 
	     Stats.addActionListener(this);
	     
	 
	      
	     
	     
	     getContentPane().add(Record); 
	     Record.addActionListener(this);
	      
	      
	}
	    

	
	public void actionPerformed(ActionEvent e ) {
		int check;
		
		if(e.getSource() == Record) {
			
		 
		
			if(Assault.equals(true)) {
				check = 1; 
			}
			else if(Vandalism.equals(true)) {
				check = 2; 
		
		}
		
		else {
			check = 3; 
			}
		
		
		//Use switch statement to check for different operators 
		
		switch(check) {
		
		case 1:
			
			if(Low_Severity.equals(true)) {
			
			assault.add(Description.getText());
			
			//assault.low_severity_count+= 1; 
			}
			else if(Moderate_Severity.equals(true)) {
				assault.add(Description.getText());
				
				//medium_severity_count+= 1;
			}
			
			else {
				assault.add(Description.getText());
				
				//high_severity_count+= 1;
			}
			
			break; 
		case 2:
			
			if(Low_Severity.equals(true)) {
				
				vandalism.add(Description.getText());
				
				//low_severity_count+= 1; 
				}
				else if(Moderate_Severity.equals(true)) {
					vandalism.add(Description.getText());
					
					//medium_severity_count+= count;
				}
				
				else {
					vandalism.add(Description.getText());
					
					//high_severity_count+= 1;
				}
			
		case 3: 
			
			if(Low_Severity.equals(true)) {
				
				robbery.add(Description.getText());
				
				//low_severity_count+= count; 
				}
				else if(Moderate_Severity.equals(true)) {
					robbery.add(Description.getText());
					
					//moderate_severity_count+= count;
				}
				
				else {
					robbery.add(Description.getText());
					
					//high_severity_count += 1;
				} 
			
	
		}
	
		
		if(e.getSource() == Stats && Assault.equals(true)) {
			System.out.println("Assault statistics"); 
			
			//assault.mean(severity); 
			
			assault.numIncidents( 1,  2, 3); 
			
		}
		
		else if(e.getSource() == Stats && Vandalism.equals(true)) {
			System.out.println("Vandalism Statistics");
			 
			
			//vandalism.mean(severity); 
			
			vandalism.numIncidents(1,2,3); 
			
	}
		else if(e.getSource() == Stats && Robbery.equals(true)) {
			System.out.println("Robbery Statistics"); 
			
			//robbery.mean(severity); 
			
			robbery.numIncidents(1,2,3); 
		}
		
		else {
			Description.setText("");
			StatsSummary.setText("");
		}
		
		
		
	}
	}
	
		
	
	//main method, makes the GUI
	public static void main(String args[]) {
		IncidentGUI Incident = new IncidentGUI(); 
		Incident.setSize(500,200); 
		Incident.setVisible(true);
	}

	
}