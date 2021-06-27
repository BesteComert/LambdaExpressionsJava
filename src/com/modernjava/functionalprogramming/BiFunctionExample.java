package com.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    //BiFunction 2 inputs List<Instructors> and second is predicate which will filter if instructor has online
    //courses and return a map of <String,Integer>
    public static void main(String[] args) {
        List<Instructor> list = Instructors.getAll();
        Predicate<Instructor> p1 = x -> x.isOnlineCourses();
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunction = (x,y) ->{
            Map<String,Integer> map = new HashMap<>();
            x.forEach(z -> {
                if(y.test(z))
                    map.put(z.getName(),z.getYearsOfExperience());
            });
            return map;
        };

        Map<String,Integer> results = biFunction.apply(list,p1);
        System.out.println(results);
    }


}
