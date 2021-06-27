package com.modernjava.functionalprogramming;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = x -> x * 10;
        System.out.println(2);

        Function<Integer,Integer> function = i -> i * 10;
        System.out.println(function.apply(3));


    }
}
