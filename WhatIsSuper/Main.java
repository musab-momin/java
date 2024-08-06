package WhatIsSuper;

class Bird {
    Bird() {
        System.out.println("Super Class");
    }

    class InnerBird {
        InnerBird() {
            System.out.println("Inner Class Bird: >>");
        }
    }

    static class StaticInnerBird {
        StaticInnerBird() {
            System.out.println("Static inner bird class: >>>");
        }
    }
}

class Eagle extends Bird {
    Eagle() {
        this("tha");
        System.out.println("Child class");
    }

    Eagle(String name) {
        System.out.println("You named this bird as" + " : " + name);
    }

    class InnerEagle extends Bird.StaticInnerBird {
        InnerEagle() {
            System.out.println("INNER EAGLE: >>>");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Eagle obj = new Eagle();
        // Eagle goldenEagle = new Eagle("Golden Eagle");

        Eagle.InnerEagle innerObj = obj.new InnerEagle();

    }
}