package org.java.version.jdk8;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args){
        //Supplier<Double> randomSupplier = () -> Math.random();
        Supplier<Double> randomSupplier = Math::random;
        System.out.println(randomSupplier.get());
    }
}
