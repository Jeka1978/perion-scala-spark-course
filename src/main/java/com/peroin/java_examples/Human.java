package com.peroin.java_examples;

/**
 * @author Evgeny Borisov
 */
public class Human {


    static {
        System.out.println("Static block oh human is working");
    }

    {
        System.out.println("human initializer is working");
    }

    public Human() {
        System.out.println("human constructor is working");
    }
}
