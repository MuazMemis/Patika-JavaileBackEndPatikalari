package org.muazmemis.s01Classes;

public class User {
    // Fields (attributes)
    public String name;

    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Getters and Setters

    // Methods (behaviors)
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name);
    }
}
