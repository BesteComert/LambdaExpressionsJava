package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        //all instructor who teaches online
        List<Instructor> instructors = Instructors.getAll();
        System.out.println("------------------------");

        Predicate<Instructor> p1 = x -> x.isOnlineCourses();
        instructors.forEach(x ->
        {
            if(p1.test(x))
                System.out.println(x);
        });
        System.out.println("------------------------");

        //instructor experience > 10 years
        Predicate<Instructor> p2 = x -> x.getYearsOfExperience() > 10;
        instructors.forEach(x -> {
            if(p2.test(x))
                System.out.println(x);
        });
        System.out.println("------------------------");
        //instructor who teaches online and experience is > 10 years
        instructors.forEach(x -> {
            if (p1.and(p2).test(x))
                System.out.println(x);
        });


    }
}
