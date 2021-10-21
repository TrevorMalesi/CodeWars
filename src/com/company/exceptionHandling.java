package com.company;

public class exceptionHandling {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        try{
            System.out.println("Before Error");
            nums[10]=25;
            System.out.println("Error");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("In catch");
        }finally{
            System.out.println("This runs");
        }
    }
}
