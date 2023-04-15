package org.muazmemis.s02Coupling;

public class User {
    // Fields (attributes)
    public String name;

    // Constructor
    public User(String name, int age) {
        this.name = name;
    }

    // Getters and Setters

    // Methods (behaviors)
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name);
    }
}
