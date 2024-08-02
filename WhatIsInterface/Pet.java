package WhatIsInterface;

public interface Pet {
    final static String dummy = "Interface can only static final variables";

    void makeSound();

    default void print() {
        System.out.println("This is pet interface");
    }
}