package com.modernjava.functionalprogramming;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int)(Math.random() * 1000);

    }
}
