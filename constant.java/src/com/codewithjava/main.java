package com.codewithjava;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        //Constant
	  int addition=6+4;
        System.out.println(addition);
        int minus=6-4;

        //Arithmetic Expressions
        System.out.println(minus);
        int multiply=6*4;
        System.out.println(multiply);
        double divide=(double) 20/(double)3;
        System.out.println(divide);

        //Order Of Operations
        int s=1;
        int h=++s;
        System.out.println(s);
        System.out.println(h);
        int sum=(10+3)*4;
        System.out.println(sum);

        //Implicit Casting
        //bytes > short > int > long > float > double
        double q=1.1;
         double a=q+3;
        System.out.println(a);

        //The math class
        int mathResult=(int)Math.floor(1.1F);
        System.out.println(mathResult);
        int math=Math.max(1,2);
        System.out.println(math);
        int mathRe=(int)Math.ceil(1.1F);
        System.out.println(mathRe);
        double marksResult= Math.random()*20;
        double marksResul= (int)Math.round(Math.random()*100);
        System.out.println(marksResul);
        System.out.println(marksResult);

        //Formatting Numbers
         NumberFormat currency= NumberFormat.getCurrencyInstance();
         String result= currency.format(123456.91);
        System.out.println(result);

        NumberFormat percent= NumberFormat.getPercentInstance();
        String money= percent.format(0.8);
        System.out.println(money);
        
    }
}
