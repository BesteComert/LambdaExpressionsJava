package com.modernjava.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        //printing  two numbers
        BiConsumer<Integer,Integer> biConsumer =(x,y) -> System.out.println("x: " + x + " y: "+ y);
        biConsumer.accept(34,48);
        //calculating sum of two integers
        BiConsumer<Integer,Integer> biConsumer2 =(x,y) -> System.out.println("x + y : "+ (x+y));
        biConsumer2.accept(21,3);
        //concatenate strings
        BiConsumer<String,String> biConsumer3 = (x,y) ->System.out.println("Concat : "+ (x+y));;
        biConsumer3.accept("es","ki");
    }

}
