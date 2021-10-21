package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class bigIntegerExample {
    public static void main(String[] args) {
        BigInteger a;
        BigInteger b;
        Scanner s=new Scanner(System.in);
        a=s.nextBigInteger();
        b=s.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }

}
