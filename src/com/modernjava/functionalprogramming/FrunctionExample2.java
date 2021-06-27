package com.modernjava.functionalprogramming;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class FrunctionExample2 {
    public static void main(String[] args) {
        //Map of instructors with name and years of experience
        //Function which will List<Instructors> and return a Map<String,Integer>
        //Predicate will return true if instructor has online courses
        Predicate<Instructor> p1 = x -> x.isOnlineCourses() ;
        Function<List<Instructor>, Map<String,Integer>> function = x -> {
            Map<String,Integer> map = new HashMap<>();
                 x.forEach(y -> {
                     if(p1.test(y))
                         map.put(y.getName(),y.getYearsOfExperience());
                 });
                 return map;
            };
        List<Instructor> instructors = Instructors.getAll();
        System.out.println(function.apply(instructors));
    }
}
