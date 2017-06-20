package main.java.marcodianti.calculator;

import java.util.StringTokenizer;

public class StringCalculator {
    public int add(String numbers){
        int total=0;
        if(numbers.equals("")){

        }else{
            StringTokenizer st1=new StringTokenizer(numbers,",",false);
            while(st1.hasMoreTokens()){
            	String subString=st1.nextToken();
            	StringTokenizer st2=new StringTokenizer(subString,"\n",false);
            	while(st2.hasMoreTokens()){
            		total+=Integer.parseInt(st2.nextToken());
            	}
               }
        }
        return total;
    }
    public static int getTwo(){
        return 2;
    }

}
