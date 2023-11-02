package org.example.server;

import org.example.api.Foo;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo("John Doe", 42);
        System.out.println("Hello " + foo + "!");
    }
}