package com.modernjava.lambda;

public class ConcatenateWithLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (x,y) -> x+y;
        String word = concatenateInterface.sconcat("beste ","lambdayı çözdü!");
        System.out.println(word);
    }
}
