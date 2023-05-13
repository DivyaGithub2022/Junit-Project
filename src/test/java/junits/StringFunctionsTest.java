package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

public class StringFunctionsTest {
	
	@Test
	public void test1() {
		
		Assertions.assertTrue(StringFunctions.isPalindrome("Madam"));
	}
	
	@Test
	public void test2() {
		
		//Assertions.assertTrue(StringFunctions.isPalindrome("Shivani"));
		//to make the testcase PASS, include "assertFalse"
		Assertions.assertFalse(StringFunctions.isPalindrome("Shivani"));
		
	}
		

}
