package WhatIsInterface;

public class Dog implements Animal, Pet {

    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void print() {
        Animal.super.print();
        System.out.println("Now what you have override the method");
    }
}
