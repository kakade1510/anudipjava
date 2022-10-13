package Exception.com;

import java.io.IOException;
import java.util.Scanner;
public class ThrowVowelsEx {		
	
	 public static void main(String[] args)
	    {
		
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input the string: ");
	        String str = in.nextLine();

	        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
	    }
	  static int count_Vowels(String str) // create a method
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
	            {
	                count++;
	            }
	            
	            
	            else {  
					System.out.println("x is not a vowels ");
	            }
	          
	            
	            try  
		        {  
		            // throw an object of user defined exception  
		            throw new Exception();  
		        } 
			 catch (Exception e)  
		        {  
					//System.out.println("x is not a Vowel ");
		            // Print the message from MyException object  
		            // System.out.println(e.getMessage());
		        }  
	        }
	        return count;
	        
	        
	    }
	}