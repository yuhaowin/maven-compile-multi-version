package org.example.api;

public class Foo {
    private String name;
    private int age;

    public Foo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return String.format("Foo{name='%s', age=%d}", name, age);
    }
}
