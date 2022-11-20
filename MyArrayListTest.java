package LabTestOnJunit11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyArrayListTest {

	@Test
	public void isEmpty()
	{
		assertEquals(false,MyArrayList.myArrayListMain().isEmpty());
		
	}

	
	@Test
	public void sizeArrayListTest()
	{
		assertEquals(5,MyArrayList.myArrayListMain().size());
		
	}
}
