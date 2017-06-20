package main.java.marcodianti.calculator;

import java.util.StringTokenizer;

public class StringCalculator {
    public int add(String numbers){
        int total=0;
        if(numbers.equals("")){

        }else{
            StringTokenizer st=new StringTokenizer(numbers,",",false);
            while(st.hasMoreTokens()){
                total+=Integer.parseInt(st.nextToken());

            }
        }
        return total;
    }
    public static int getTwo(){
        return 2;
    }

}
