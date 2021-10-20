package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class diagonalDifference{
    public static void main (String[] args) throws IOException{

    }
    public static int getDifference(List<List<Integer>> arr){
        int firstDiagonal=0,secondDiagonal=0;
        for (int i=0;i<arr.size();i++){
            firstDiagonal+=arr.get(i).get(i);
        }
        for (int i=0;i<arr.size();i++){
            secondDiagonal+=arr.get(i).get(arr.size()-(i+1));
        }
        return Math.abs(firstDiagonal-secondDiagonal);
    }
}