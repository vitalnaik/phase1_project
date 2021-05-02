package phase1project;

import java.io.File;
import java.io.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;



public class FileHandlind{
	
	public static void main(String[] args) throws IOException  {
		
	
		
		
		 System.out.println("*************************LOCKED ME******************************");
	      System.out.println("*********************  DEVELOPED BY VITTALNAIK ********************");
	      System.out.println("****************************************************************");
	      System.out.println();
	  	mainmenu();
	  	}
	      public static void mainmenu() throws IOException {
	    	 
	    		File f=new File("E:/vittal");
	    		f.mkdir();
	    		File f1=new File("E:/vittal/abc.txt");
	    		f1.createNewFile();
	    		File f2=new File("E:/vittal/xyz.txt");
	    		f2.createNewFile();
	    		File f3=new File("E:/vittal/fire.txt");
	    		f3.createNewFile();
	    		File f4=new File("E:/vittal/sun.txt");
	    		
	    		f4.createNewFile();
	    		File f5=new File("E:/vittal/Apple.txt");
	    		f5.createNewFile();
	    	 
		   
	      System.out.println("1.files in directory");
	      System.out.println("2.Business operations");
	      System.out.println("3.exit");
	      
	      // user input through scanner class
	      Scanner sc=new Scanner(System.in);
	      
	      System.out.println("ENTER YOUR CHOICE");
	      int opt=sc.nextInt();
	      switch (opt) {
	      case 1:   System.out.println("files in "+  "vittal " +"directory in sorted order");
	                String[] s=f.list();
	                 Arrays.sort(s);
	          
	    	        for(String s1:s)
	    	           {
	    		          System.out.println(s1);
	    		 
	    		  
	    	            }
	      
mainmenu();
	      break;
	      case 2: System.out.println("Business operations");
	              System.out.println("1.create new file");
	              System.out.println("2. delete file");
	              System.out.println("3.search file");
	              System.out.println("4.return to main menu");
	              System.out.println("select your option");
	              Scanner sc1=new Scanner(System.in);
	              int option=sc.nextInt();
	              switch(option) {
	              case 1: System.out.println("create a new file in existing directory");
	                       System.out.println("ENTER THE FILE NAME TO CRAEATE ");
	                        String file1=sc1.nextLine();
	              try {
	            	File file=new File("E:/vittal/"+file1+".txt");
	            	if(file.createNewFile()) {
	            		System.out.println("new file created");
	            	    }else {
	            	    	if(file.exists()){
	            	    		System.out.println(" file already exist");
	            	    		System.out.println(file.getAbsolutePath());
	            	    		
	            	    	   }
	            	    }
	              }catch(Exception e) {
	            	  e.printStackTrace();
	                                  }
	              break;
	           
	         case 2:System.out.println("deleting file");
	                     System.out.println("Enter the file to delete");
	                     String fd=sc1.nextLine();
	                     try {
	                    	 File FD=new File("E:/vittal/"+fd+".txt");
	                    	 if(FD.exists()) {
	                    		 FD.deleteOnExit();
	                    		 System.out.println("file deleted");
	                    		 
	                    	     }else {
	                    	    	 System.out.println("file not exist in directory");
	                    	     }
	                     }catch (Exception ee) {
	                    	 ee.printStackTrace();
	                     }
	                     break;
	         case 3:System.out.println("search file");
	                     System.out.println("Enter file name to search ");
	                           String fc=sc1.nextLine();
	         
	            	  File FC=new File("E:/vittal/"+fc+".txt");
	            	  if(FC.exists()) {
	            		System.out.println("file exist in directory");  
	            	      }else {
	            	    	  System.out.println("file not found");
	            	      }
	              
	           
	              
	              break;
	        case 4:System.out.println("return to main menu");
	              mainmenu();
	      
	              break;
	      }
	    mainmenu();
	      break;
	      
	             case 3: System.out.println("Exit");
			              System.exit(opt);
	      }
		
		
}
}
			

        
        
	
		
			
		
			




		
	
			
			
		
			
			
		


		
		// TODO Auto-generated method stub

	


