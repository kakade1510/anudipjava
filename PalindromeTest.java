package LabTestOnJunit11;

import org.junit.jupiter.api.Disabled;

public class PalindromeTest {
	
	@Disabled
	@parameterizedTest
	@ValueSource(string = {"pap","maam","man"})
	
	


	public void testIsPllalindrom(String s) {
		
		
		assertTrue(calc.isPallalindrom(s));
		
	}
}