package com.modernjava.functionalprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;
        System.out.println(binaryOperator.apply(3,7));

        Comparator<Integer> comperator = (a,b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comperator);
        System.out.println(maxBi.apply(7,8));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comperator);
        System.out.println(minBy.apply(13,32));

        IntBinaryOperator intBi = (a,b) -> a+b ;
        System.out.println(intBi.applyAsInt(7,2));

        LongBinaryOperator longBi = (a,b) -> a*b;
        System.out.println(longBi.applyAsLong(3l,9l));

        DoubleBinaryOperator doubleBi = (a,b) -> a+b;
        System.out.println(doubleBi.applyAsDouble(5.2,8.4));
    }
}
