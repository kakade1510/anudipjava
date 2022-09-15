//WAP to find the prime numbers between 1 to 20.
//(create a method primeNumber() and call this method in main())

public class PrimeJava {
	static void printMsg()  // create a method primeNumber
	{
		System.out.println("Prime numbers from 1 to 20 are :");
	}
	
	
	static void primeNumber(int i,int primeNumbers)   
	{
		System.out.println("Print a prime number"+primeNumbers);
	}

		 public static void main (String[] args)
		   {		
		       int i =0;
		       int num =0;
		       String  primeNumbers = "";
		       for (i = 1; i <= 20; i++)     //for loop    
		       { 		  	  
		          int n=0; 	  
		          for(num =i; num>=1; num--)
			  {
		             if(i%num==0)
			     {
		 		n = n + 1;
			     }
			  }
			  if (n==2)
			  {
			     primeNumbers = primeNumbers + i + " ";
			  }	
		       }
		       printMsg();          
		       System.out.println(primeNumbers);
		       
	}

}