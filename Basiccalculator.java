package phase1project;

import java.util.Scanner;

public class Basiccalculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
	
      num1=sc.nextInt();
      num2=sc.nextInt();
      System.out.println("Enter the Arithmatic operation you want to perform \n " + " +,-,*,/ ");
     String operation=sc.next();
      
      int o=0;
      switch (operation) {
      case "+": 
    	 
    	  o =num1+num2;
    	 
      
    	  
      break;
      case "-" :
    	  o=num1 -num2;
    	  break;
      case "*" :
    	  o=num1*num2;
    	  break;
      case "/" :
    	  o=num1/num2;
    	  break;
    	  default :
    		  System.out.println("you entered wrong input");
    		  break;
      }
      System.out.println("the final result is:");
      System.out.println();
      System.out.println(num1 + " "+ operation+ " "+num2+ " is "+o);
      
}
}