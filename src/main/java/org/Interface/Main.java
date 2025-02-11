package org.Interface;

import java.util.ArrayList;
import java.util.List;

interface Animal {
    void makeSound(); // 추상 메소드
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍으르르!" );
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("미야오오옹!");
    }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
