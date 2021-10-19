package com.company;

public class binarySearch {
    public int search(int[] nums,int target){
        int len=nums.length;
        int i=0;
        while (i<len){
            if (nums[i]==target){
                return  i;
            }else{
                i+=1;
            }
        }
        return -1;
        }
        public static void main(String[] args){
        binarySearch search=new binarySearch();
        int [] arr={-1,0,3,5,9,12};
            System.out.println(search.search(arr,9));
        }
}
