package org.covy;

public class Dog extends Animal {

    @Override
    public String crying() {
        System.out.println(super.crying());
        return "멍멍..";
    }
}
