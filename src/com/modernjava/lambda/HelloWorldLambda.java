package com.modernjava.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld Using Lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello with lambda!!!";
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
