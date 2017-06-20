package main.java.marcodianti.calculator;

import java.util.ArrayList;
import java.util.StringTokenizer;

import main.java.marcodianti.calculator.exceptions.NegativeNumberException;

public class StringCalculator {
	public static String NEGATIVE_NUMBERS_EXCEPTION_TEXT="Negatives not allowed: ";
	public int add(String numbers) throws NegativeNumberException {
		int total = 0;
		String delimiter = ",";
		ArrayList<Integer> negatives=new ArrayList();
		if (numbers.equals("")) {

		} else {
			if (numbers.substring(0, 2).equals("//")) {
				// custom delimiter
				delimiter = numbers.substring(2, 3);
				numbers = numbers.substring(4, numbers.length());
			}
			StringTokenizer st1 = new StringTokenizer(numbers, delimiter, false);
			while (st1.hasMoreTokens()) {
				String subString = st1.nextToken();
				StringTokenizer st2 = new StringTokenizer(subString, "\n", false);
				while (st2.hasMoreTokens()) {
					int parsedInt=Integer.parseInt(st2.nextToken());
					if(parsedInt>=0){
						total += parsedInt;	
					}else{
						negatives.add(parsedInt);
						
					}
					
				}
			}
			//check if there were negatives
			if(negatives.size()>0){
				String listNegatives="";
				for(int i=0;i<negatives.size();i++){
					listNegatives+=negatives.get(i);
				}
				throw new NegativeNumberException(NEGATIVE_NUMBERS_EXCEPTION_TEXT+listNegatives);
			}
		}
		return total;
    }
    public static int getTwo(){
        return 2;
    }

}
