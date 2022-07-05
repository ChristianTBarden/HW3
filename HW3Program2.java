import java.util.Scanner;

public class HW3Program2 {

	public static void main(String[] args){
		
		//Introductory User Prompt//
		
		System.out.println("####MAKING SHAPES: EXTREME CODING PROGRAM####");
		
		System.out.print("Shape OPTIONS: Rectangle - 1 , Circle - 2 ");
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Type in number (integer) corresponding to the shape you want to create:");
		
		//scanner that detects chosen shape
		
		Scanner intro = new Scanner(System.in);
		
		int L = intro.nextInt();
		
		//Funny Prompt that tells user to restart program when they follow prompt improperly
		
		if ( L > 2 || L < 1 ) { System.out.println("In the words of DJ Khaled Congratulations You've Played Urself\n you now have to restart the program\n you were suppose to enter either 1 or 2");}
		
		//This is a conditional block that execute certain methods based on user input Aka a lot of composition of conditions
		
		//This outer switch indicates the case (shape number) chosen
		
		//inner user switches ask for the dimesions needed to make shape
		
		switch(L){
		
		case 1: 
			
	    {System.out.println("What is the length of your rectangle?");
	    
	    Scanner fm = new Scanner(System.in);
	    
	           double n = fm.nextDouble();
		        
	    
		System.out.println( "What is the width of your rectangle?");
		    
		      double c = fm.nextDouble();
		     
	    System.out.println( "!!Congratulations You've made a circle!! ");
	    
	    System.out.println( "\nType 1 to view perimeter or 2 to view area \nor better yet type in 3 to view both");  		      
		      
		      Scanner chose = new Scanner(System.in);
		      
		      int p = chose.nextInt();
		      
		      switch (p){ 
		      
		      case 1: 
		        double t = recPer(n,c);
		        System.out.println("Perimeter: " + t);
		    	  break;
		    	  
		      case 2:
		      double x = recArea(n,c);
		      System.out.println("Area: "+ x);
		      break;
		      
		      case 3:
		    	  double o = recPer(n,c);
			        System.out.println("Perimeter: " + o);
			        
			        double j = recArea(n,c);
				      System.out.println("Area: " + j);
	          break;}
		      break;}
	   
		         case 2:
		        
			    {System.out.println("What is the radius of your circle?");
			    
			    Scanner fn = new Scanner(System.in);
			    
				    
				      double c = fn.nextDouble();
				     
				      double x = circum(c);
			       	
				      double t = circArea(c);
				      
				 System.out.println( "Congratulations You've made a circle ");
				 
				 System.out.println( "\nType 1 to view circumference or 2 to view area \nor better yet type in 3 to view both");  
			      
			      
			      Scanner choose = new Scanner(System.in);
			      
			      int f = choose.nextInt();
			      
			      switch (f){ 
			      
			      case 1: 
			        double h = circum(c);
			        System.out.println("Circumference: " + h);
			    	  break;
			    	  
			      case 2:
			    	  double l = circArea(c);
			    	  System.out.println("Area: " + l);
			      break;
			      
			      case 3:
			    	  double o = circum(c);
				        System.out.println("Circumference: " + o);
				        
				      double j = circArea(c);
					    
				      System.out.println("Area: " + j);
				      
					  break;
			      }	 }break;
		
		}}
	
	              		
	         //circle area Method Defined//
	    static double circArea(double Radius){
	    	 
	    double Area = (3.1415926535 * (Radius) * (Radius));
		  	 
	    return Area;}
	    
	         //circle circumference Method Defined//
	    static double circum(double Radius){
		    	 
	    double circum = (2 * 3.1415926535 * Radius);
	     		  	 
	    return circum;}
	     	         
	          //rectangle perimeter Method Defined//	
	    static double recPer(double Length, double Width) {
	       double perimeter = (2 * Length + Width * 2);
	        
	        return perimeter;}
	    
	          //rectangle area Method Defined//
	    static double recArea(double Length, double Width){
	          double  Area = (Length * Width);
	              
	              return Area;}   
	    }

