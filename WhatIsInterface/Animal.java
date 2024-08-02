package WhatIsInterface;

public interface Animal {
    public void makeSound();

    default void play() {
        System.out.println();
    }

    default void print() {
        System.out.println("This is printer interface");
    }
}