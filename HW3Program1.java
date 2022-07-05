import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class HW3Program1 {
	
	public static void main(String[] args) throws IOException {
		
		//import Input file with scanner object
		
		Scanner sc = new Scanner(new File("MethodInputs.txt"));
		
		//assigns each read line value to variable
		
	      int n = sc.nextInt();
	      
	      int k = sc.nextInt();
	      
	      int f = sc.nextInt(); 
	      
		  int x = factorial(n);
		  
		      //Prints output to this file
		
		       FileOutputStream fout=new FileOutputStream("MethodsOutputfile.txt");
		       
		       PrintStream pout=new PrintStream(fout);
		       
	   pout.println("The factorial of " + n + " is " + x + "." );
	   
		      //prints factorial output
	   
        int results = sumOfSquares(k);
        
	          //prints sum of squares output
        
        pout.println("The sum of squares is " + results + " for input " + k + ".");
        
              //prints fibonacci sequence output
        
        { pout.println("The Fibonacci sequence for the first " + f  + " terms is: ");}
        
              //fibonacci sequence method recursion
	    
	 for(int i=0; i<f; i++) {
	     
		 pout.print(fib(i)+ ", ");}}
	
	          //Sum of Squares Method Defined//
	
	    static int sumOfSquares(int k){
	    	 
	    	 int add = 0;
	    	 
	         for (int i = 1; i <= k; i++)
	        	 
	         add += (i * i);
	         
	         return add;
	              
	       //Factorial Method Defined//	
	         
			}
	   static int factorial(int n) {
		   
	   if (n == 0){
		    		 
	   return 1;}
	    	 
	   {int recurse = factorial(n - 1);
		    	 
		     int result = n * recurse;
		    	 
		     return result;}
		    	 }
	   
	        //Fibonacci sequence Method Defined//
		
	    static int fib( int f ) 
	    
	    {if (f<=1) return f;  
	    return fib(f-1) + fib(f-2);}
	 
	
}
		
		

