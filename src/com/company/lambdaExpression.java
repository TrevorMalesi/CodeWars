package com.company;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        /*
        Lambda expression refers to a short block of code that
        takes in parameters and returns a value
        parameter->expression
        (parameter1,parameter2)->expression
         */
        Consumer<Integer> method = (n)->{
            System.out.println(n);};
            numbers.forEach(method);
        }
    }
