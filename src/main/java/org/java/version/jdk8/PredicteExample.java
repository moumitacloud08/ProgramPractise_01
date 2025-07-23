package org.java.version.jdk8;

import java.util.function.Predicate;

public class PredicteExample {
    public static void main(String[] args){
        Predicate<String> isLong = str -> str.length() > 5;
        System.out.println(isLong.test("Java"));
        System.out.println(isLong.test("JavaEight"));

    }
}
