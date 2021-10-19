package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class squareDigit{
    public int square(int n){
        String result="";
        while (n!=0){
            int digit=n%10;
            result+=digit*digit;
            n/=10;
        }
        return Integer.parseInt(result);
    }
    public static void main(String[] args){
        squareDigit sq=new squareDigit();

        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println(sq.square(a));
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
    }
}
