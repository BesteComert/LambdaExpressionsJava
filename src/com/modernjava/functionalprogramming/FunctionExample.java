package com.modernjava.functionalprogramming;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Double> sqrt = x -> Math.sqrt(x);
        System.out.println("Square root of 64: " + sqrt.apply(64));

        //lower case function
        Function<String,String> lowerCaseFunction = x -> x.toLowerCase(Locale.ROOT);
        System.out.println(lowerCaseFunction.apply("BESTECİM"));


    }
}
