package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumer {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //all instructor who teaches online
        Predicate<Instructor> p1 = x -> x.isOnlineCourses();

        //all instructor experience >10
        Predicate<Instructor> p2 = x -> x.getYearsOfExperience() > 10;

        //BiConsumer print name and courses
        BiConsumer<String,List<String>> biConsumer = (x,y) -> System.out.println("Name: "+x +" Courses: "+y.toString());
        instructors.forEach(x -> {
            if(p1.and(p2).test(x))
                biConsumer.accept(x.getName(),x.getCourses());
        });
    }
}
