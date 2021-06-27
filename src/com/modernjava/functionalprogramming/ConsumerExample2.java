package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        // looping through all the instructor and printing out the values of instructor
        Consumer<Instructor> c1 = (x) -> {
            System.out.println(x);
        };
        instructors.forEach(c1);
        System.out.println("----------------------------");
        //Loop through all the instructor and only print out their name
        Consumer<Instructor> c2 = x -> {
            System.out.println(x.getName());
        };
        instructors.forEach(c2);

        //Loop through all the instructors and print out their names and their courses
        Consumer<Instructor> c3 = x -> {
            System.out.println(x.getCourses());
        };
        instructors.forEach(c2.andThen(c3));
        System.out.println("----------------------------");

        //Loop through all the instructors and print out their name if the years of experience is > 10
        instructors.forEach(x ->{
            if( x.getYearsOfExperience() > 10)
                c1.accept(x);
        });
        System.out.println("---------------------------");

        //Loop through all the instructors and print out their name and years of experience if years of experience is
        // >5 and teaches online course
        instructors.forEach(x -> {
            if(x.getYearsOfExperience() > 5 && x.isOnlineCourses() == true)
                c1.andThen(c2).accept(x);
        });

    }
}
