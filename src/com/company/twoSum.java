package com.company;

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] numbers,int target){
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for (int i=0;i<numbers.length;++i){
            Integer diff=Integer.valueOf(target-numbers[i]);
            if (hash.containsKey(diff)){
                int toReturn[]={hash.get(diff)+1,i+1};
                return  toReturn;
            }
            hash.put(numbers[i],i);
        }
        return  null;
    }

    public static void main(String[] args) {
        twoSum sum=new twoSum();
        int [] nums={1,2,3,4,5};
        int target=3;
        System.out.println(sum.twoSum(nums,target));
    }
}
