package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        List<filmRating> rating = new ArrayList<>();
        rating.add(new filmRating("Zack Synder",5));
        rating.add(new filmRating("JJ Abrahams",2));
        rating.add(new filmRating("Patty Jenkins",4));
        rating.add(new filmRating("Kevin Feige",3));
        rating.add(new filmRating("Antoine Faqua",5));
        rating.add(new filmRating("Phoebe Waller",5));
        //get rating higher than 4
        List<filmRating> topDirector=rating.stream().filter(director->director.rating>=4).collect(Collectors.toList());
//        topDirector.forEach(director-> System.out.println(director.director+" "+director.rating));
        List<filmRating> sortedList=rating.stream()
                .sorted(Comparator.comparing(director->director.director)).collect(Collectors.toList());
        sortedList.forEach(director-> System.out.println(director.director+" "+director.rating));
    }
    static class filmRating{
        String director;
        Integer rating;

        public filmRating(String director, Integer rating) {
            this.director = director;
            this.rating = rating;
        }
    }
}