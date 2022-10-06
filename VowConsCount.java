package StringTest.com;

public class VowConsCount
{
	 // To prints number of vowels and consonants
	   public static void count(String str)
	   {
	       int vow = 0, con = 0;
	      
	       
	       // which contains all the vowels
	       String ref = "aeiouAEIOU";
	      
	       for (int i = 0; i < str.length(); i++) {
	            
	           // Check for any special characters present
	           // in the given string
	           if ((str.charAt(i) >= 'A'
	                && str.charAt(i) <= 'Z')
	               || (str.charAt(i) >= 'a'
	                   && str.charAt(i) <= 'z')) {
	               if (ref.indexOf(str.charAt(i)) != -1)
	                   vow++;
	               else
	                   con++;
	           }
	       }
	      
	       // Print and display number of vowels and consonants
	     
	       System.out.println("Number of Vowels = " + vow
	                          + "\nNumber of Consonants = "
	                          + con);
	   }


	   // Main method
	   public static void main(String[] args)
	   {
	       String str = "hey! my name is Sushil";
	      
	       // Calling method
	       count(str);
	   }
	}
