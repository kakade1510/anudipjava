package Exception.com;

import java.util.Scanner;
import java.util.regex.*;  

public class MailException {

	public static void main(String[] args) {
	
			String s1;
			Scanner scan=new Scanner(System.in);
			System.out.println ("Enter your email : ");
			s1=scan.nextLine();
			if(s1.endsWith("@")||s1.endsWith("."))
				
				System.out.println("invalid email id");    
			
			else
			if((s1.contains("@")&& s1.contains(".")))
					System.out.println("valid email id ");
			
			else
				System.out.println("Invalid email id ");
			
			 try  
		        {  
		            // throw an object of user defined exception  
		            throw new invalidmailidexception();  
		        } 
			 catch (invalidmailidexception ide)  
		        {  
					//System.out.println("Invalid email id ");
		            // Print the message from MyException object  
		           //  System.out.println(ide.getMessage());
		        }  
		}
	
	}