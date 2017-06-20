package test.java.marcodianti.calculator;

import static org.junit.Assert.*;

import org.junit.*;

import main.java.marcodianti.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public final void getTwoIsCorrect(){
		assertEquals(2, StringCalculator.getTwo());
	}
	@Test
	public final void sumIsCorrect(){
		StringCalculator sc=new StringCalculator();
		assertEquals(5, sc.add("3,2"));
	}
	
}
