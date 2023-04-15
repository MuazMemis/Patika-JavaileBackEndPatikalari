package org.muazmemis.s07Polymorphism;

public abstract class UIControl {
        public void enable() {
            System.out.println("UIControl enabled");
        }

        public abstract void draw();
}
