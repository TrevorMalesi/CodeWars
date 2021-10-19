package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class diagonalDifference{
    public static void main (String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n=Integer.parseInt(reader.readLine().trim());
        List<List<Integer>> arr=new ArrayList<>();

    }
    public static int dDifference(List<List<Integer>> arr){
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