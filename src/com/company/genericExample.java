package com.company;

import java.util.ArrayList;
import java.util.List;

public class genericExample {
    /*way to tell compiler what type of objects a collection
    can contain
    * */
    public static void main(String[] args){
        /*
        Without generics
         */
        List names = new ArrayList();
        names.add("Trevor");
        names.add("Jeff");
        String name=(String)names.get(0);
        System.out.println("First name: "+name);
        /*
        With generics
         */
        List<String> personName=new ArrayList<String>();
        personName.add("Joe");
        personName.add("Ian");
        System.out.println("First name: "+personName.get((0)));

    }

}
