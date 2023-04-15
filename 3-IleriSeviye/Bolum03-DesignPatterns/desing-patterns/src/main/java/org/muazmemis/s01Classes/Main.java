package org.muazmemis.s01Classes;

public class Main {
    public static void main(String[] args) {
//        User muaz = new User();
//        muaz.name = "Muaz";
        User muaz = new User("Muaz");
        System.out.println(muaz.name);
        muaz.sayHello();
    }
}