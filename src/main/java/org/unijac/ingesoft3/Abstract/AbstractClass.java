package org.unijac.ingesoft3.Abstract;

/**
 * Created by alexhd on 9/9/14.
 */
public abstract class AbstractClass {
    public String name;

    public void hail() {
        System.out.printf("hello %s%n", getName());
    }

    public String getName() {
        return name;
    }

    public abstract void goodbye();
}
