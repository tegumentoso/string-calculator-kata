package test.java.marcodianti.calculator;

import static org.junit.Assert.*;

import org.junit.*;

import main.java.marcodianti.calculator.StringCalculator;

public class StringCalculatorTest {
	StringCalculator sc=new StringCalculator();
	

	@Test
	public final void getTwoIsCorrect(){
		assertEquals(2, StringCalculator.getTwo());
	}
	@Test
	public final void emptyStringGivesZero(){
		assertEquals(0, sc.add(""));
	}
	@Test
	public final void sumIsCorrect(){
		
		assertEquals(5, sc.add("3,2"));
	}
	@Test
	public final void sumThreeNumbers(){
		
		assertEquals(6, sc.add("3,2,1"));
	}
	@Test
	public final void inputWithCommasAndNewlines(){
		
		assertEquals(6, sc.add("1\n2,3"));
	}
	
}
