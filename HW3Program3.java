import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW3Program3 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		//imports birthday record file with scanner (assigned file to scanner object)
		
		Scanner sc = new Scanner(new File("BirthdayRecord.txt"));
		
			// Turn scanner object to string with while loop
		
		while(sc.hasNext()) {
			
			   String lineOfText = sc.nextLine();
			   
			   if (lineOfText.startsWith("Month")) {
				   continue; 
			   }
			    //Delimit string by "," and tokenize//
			   StringTokenizer st = new StringTokenizer(lineOfText, ",");
			   
			   
		        // created an ArrayList object//
		        List<String> elements = new ArrayList<String>();
		 
		        // go through StringTokenizer tokens//
		        while(st.hasMoreTokens()) {
		 
		        // add tokens to Array list//
		            elements.add(st.nextToken());
		        }
		        {
		        //Convert Array elements from string to double/calculate with defined methods
		        	
		        String  month = elements.get(0);
		        
		        double monthDub = Double.valueOf(month); 
		        
		        double x = monthToYear(monthDub);
		        
                String day = elements.get(1);
		        
		        double dayDub = Double.valueOf(day);
		        
		        double y = dayToYear(dayDub);
		        
                String  year = elements.get(2);
		        
		        double yearDub = Double.valueOf(year);
		        
		        double z = yearLiv(yearDub);
		        
		        //age calculation
		        
		         double age = x + y + z;
		         
		         //Print out age calculation to "AgeOutputfile.txt"//
		         
		         FileOutputStream fout = new FileOutputStream("AgeOutputfile.txt");
	       
	           PrintStream pout = new PrintStream(fout);
	       
               pout.println("Your current age is " + age + " based upon your birthday record and current date 7/5/2022.");
               
		        }}
		
		       
	}
	                  //Month To Year-fractional result if ! whole//I converted month to years and subtracted current month by birth month
    
		                static double monthToYear(double Month){
		                	
		                	       // d = 1/12 months
		                	
			        	          double d = .083333;
			        	          
			        	          double  presentMonth = 7;
			        	          
				                  double  result =  ( presentMonth * d ) - (d * (Month));
				              
				              return result;}
			        
			          //Day To Year-fractional result if ! whole// I converted days to years and subtract current day by day born
			        
			        static double dayToYear(double day){
			        	
			        	           // d = 1/365 days
			        	
			        	           double d = .002739;
			        	           
			        	           double presentDay = 5;
			        	           
				           double  result = ( presentDay * d ) - ( d *(day));
				              
				              return result;}
			        
			          //Whole Number years lived//
			        
			        static  double yearLiv(double birthYear){
			        	
			        	           double todayYear = 2022;
			        	
				                   double result = todayYear - birthYear;
				                
				              return result;}	 
			        // this is kind of cool cause the fractional double tells you if your half way to a new birth year very accurately
		              
		}
	
		
		    
			   
			
		

		

		
		
		
		
		

			
	
			
	


