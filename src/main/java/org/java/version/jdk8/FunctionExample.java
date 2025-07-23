package org.java.version.jdk8;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args){
        Function<String,Integer> toLength = str -> str.length();
        System.out.println(toLength.apply("Naruto Uzumaki"));

    }
}
