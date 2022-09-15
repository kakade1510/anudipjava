//WAP to find sum of numbers from 1 to 100 using for loop.
//(create a method addNumber() and call this sum.java

public class AddNumber {
	static void printMsg()   //create a method addNumber
	{
		System.out.print("sum of First 1 to 100 natural number is :");
	}
	
	static void AddNumber(int i,int sum)
	{  
		
		System.out.println(+sum);
	} 

	public static void main(String[] args) {
		int num=100;
		int i;
		int sum=0;
		for(i=1;i<=num; ++i)
		{
			sum=sum+i;
			
		}
		printMsg();
		AddNumber( i,sum);         

}
		
}
