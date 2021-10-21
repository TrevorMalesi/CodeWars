package com.company;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class formatCurrency {
    public static void main(String[] args) {
        try {
            double currency;
            Scanner s = new Scanner(System.in);
            currency = s.nextDouble();
            s.close();
        /*
        India
         */
            Locale indiaLocale = new Locale("en", "IN");
            Locale kenyaLocale = new Locale("en", "KE");
            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(indiaLocale.FRANCE);
            NumberFormat kenya = NumberFormat.getCurrencyInstance(kenyaLocale);
            System.out.println("India: "+india.format(currency));
            System.out.println("Kenya :"+kenya.format(currency));
            System.out.println("US :"+us.format(currency));
            System.out.println("China: "+china.format(currency));
            System.out.println("France: "+france.format(currency));
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

    }
}
