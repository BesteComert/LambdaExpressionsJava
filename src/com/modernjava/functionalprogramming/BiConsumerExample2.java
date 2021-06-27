package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //print out name and gender of instructors
        BiConsumer<String,String> biConsumer = (x,y) -> System.out.println("Name: " + x + " Gender: " + y);
        instructors.forEach(x -> biConsumer.accept(x.getName(),x.getGender()));
        System.out.println("-------------------------------------------------");
        //print out name and list of courses
        BiConsumer<String,List<String>> biConsumer1 = (x,y) -> System.out.println("Name : " + x + " Online Courses : " + y.toString());
        instructors.forEach(x -> biConsumer1.accept(x.getName(),x.getCourses()));

        //print out name and gender of all instructors who teaches online
        instructors.forEach(x->{
            if(x.isOnlineCourses())
                biConsumer.accept(x.getName(),x.getGender());
        });
    }

}
