package LabTestOnJunit11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AllTest { 

	private static Add_Multi am; 
	
	@BeforeEach 
	public void beforeach() 
	{
		System.out.println("Before Each....");	
	}
	
	@BeforeAll 
	public static void beforeall() 
	{
		am=new Add_Multi(); 
		System.out.println("Before all tests....");
	}
	
	
	@Test 
	public void testadd() 
	{
	    assertEquals(30,am.add(20,10));  
		
	}
	
	@Test
	public void testmulti()
	{
	    assertEquals(200,am.multi(20,10)); 
		
	}
	
	@AfterAll
	public static void afterAllTests() 
	{
		System.out.println("After all tests....");	
	}

	@AfterEach 
	public  void aftereach() 
	{ 
		System.out.println("After Each tests....");	
	}
	
}
