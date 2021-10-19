package com.company;

import java.util.ArrayList;
import java.util.List;

public class arraySum {
    public int getSum(List<Integer> ar){
        int sum=0;
        for (Integer a:ar){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args){
        List<Integer> ar=new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        arraySum a=new arraySum();
        System.out.println(a.getSum(ar));

    }

}
