package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //all instructor who teaches online
        BiPredicate<Boolean,Integer> p1 = (x, y) -> x==true && y > 10 ;

        //BiConsumer print name and courses
        BiConsumer<String,List<String>> biConsumer = (x, y) -> System.out.println("Name: "+x +" Courses: "+y.toString());
        instructors.forEach(x -> {
            if(p1.test(x.onlineCourses,x.getYearsOfExperience()))
                biConsumer.accept(x.getName(),x.getCourses());
        });
    }

}
