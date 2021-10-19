package com.company;

import java.util.ArrayList;
import java.util.List;

public class compareTriplets {
    public static List<Integer> list(List<Integer> a,List<Integer> b){
        List <Integer> winnnerResults=new ArrayList<Integer>();
        int aliceWinner=0,bobWinner=0;
        for (int i=0;i<a.size(); i++){
            if (a.get(i)>b.get(i)){
                aliceWinner++;
            }else if( a.get(i)<b.get(i)){
                bobWinner++;
            }else{
                //do nothing
            }
        }
        winnnerResults.add(aliceWinner);
        winnnerResults.add(bobWinner);
        return  winnnerResults;
    }
    public static void main(String[] args) {
        compareTriplets a=new compareTriplets();
        List <Integer> aliceList=new ArrayList<Integer>();
        List <Integer> bobList=new ArrayList<Integer>();
        aliceList.add(17);
        aliceList.add(28);
        aliceList.add(30);
        bobList.add(99);
        bobList.add(16);
        bobList.add(8);
        System.out.println(a.list(aliceList,bobList));
    }
}
