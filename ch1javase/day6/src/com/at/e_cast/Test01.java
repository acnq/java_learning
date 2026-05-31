package com.at.e_cast;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);
        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.lookHome();
        }

        if (animal instanceof Cat cat) {
            cat.catchMouse();
        }
    }


}
