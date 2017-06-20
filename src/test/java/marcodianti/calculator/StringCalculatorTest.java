package test.java.marcodianti.calculator;

import static org.junit.Assert.*;

import org.junit.*;

import main.java.marcodianti.calculator.StringCalculator;
import main.java.marcodianti.calculator.exceptions.NegativeNumberException;

public class StringCalculatorTest {
	StringCalculator sc=new StringCalculator();
	

	@Test
	public final void getTwoIsCorrect(){
		assertEquals(2, StringCalculator.getTwo());
	}
	@Test
	public final void emptyStringGivesZero(){
		try {
			assertEquals(0, sc.add(""));
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
	@Test
	public final void sumIsCorrect(){
		
		try {
			assertEquals(5, sc.add("3,2"));
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
	@Test
	public final void sumThreeNumbers(){
		
		try {
			assertEquals(6, sc.add("3,2,1"));
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
	@Test
	public final void inputWithCommasAndNewlines(){
		
		try {
			assertEquals(6, sc.add("1\n2,3"));
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
	@Test
	public final void inputWithCustomDelimiter(){
		
		try {
			assertEquals(3, sc.add("//;\n1;2"));
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = NegativeNumberException.class)
	public void receiveNegativeNumberException()
	        throws NegativeNumberException {
	    sc.add("-1,-2");
	}
	@Test
	public void listOfNegativesInException(){
	       try {
			sc.add("1,-2,3,-4");
		} catch (NegativeNumberException e) {
			assertEquals(StringCalculator.NEGATIVE_NUMBERS_EXCEPTION_TEXT+"-2-4",e.getMessage());
		}
	}
}
