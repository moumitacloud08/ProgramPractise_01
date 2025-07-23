package org.java.version.jdk8;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());
        printUpper.accept("Java Functional Interface");
    }
}
