package junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import code.Calculator;

public class CalculatorTest {
	
	//@Disabled
	@DisplayName("Two positive num test")
	@Test
	public void test1() {
		
		int result = Calculator.add(4, 5);
		
		//System.out.println(result); - to include assertion
		Assertions.assertEquals(9, result);
	}
	
	@DisplayName("One positve and one negative number test")
	@Test
	public void test2() {
		
		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1, result);
	}
	
	@RepeatedTest(3)
	@DisplayName("Two positive num test where result is not matching")
	//@Test - no need this when giving @RepeatedTest
	public void test3() {
		
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(10, result);
	}

}
