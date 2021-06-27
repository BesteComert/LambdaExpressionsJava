package com.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //if number is > 10 return true other false;
        Predicate<Integer> p1 = x -> x > 10;
        System.out.println(p1.test(100));

        //i>10 && number is even number(i%2 ==0)
        Predicate<Integer> p2 = x -> x % 2 == 0;
        System.out.println(p2.and(p1).test(11));
        System.out.println(p2.and(p1).test(14));

        //i>10 || number is even number (i%2==0)
        System.out.println(p1.or(p2).test(14));

        //i>0 && i%2 != 0
        Predicate<Integer> p3 = x -> x > 0 && x % 2 != 0;
        System.out.println(p3.test(5));
    }
}
