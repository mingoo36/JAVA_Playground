package org.Interface;

interface Animal {
    void makeSound(); // 추상 메소드
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("냐옹!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
