package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class averyBigSum{
    public Long bigSum(List<Long> ar){
        Long sum=0L;
        for (Long a:ar){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        List<Long> ar=new ArrayList<>();

        Long listItems;
        int N=sc.nextInt();
        for (int i=0;i<N;i++){
            listItems=sc.nextLong();
            ar.add(listItems);
        }
        averyBigSum sum=new averyBigSum();
        System.out.println(sum.bigSum(ar));
    }

}