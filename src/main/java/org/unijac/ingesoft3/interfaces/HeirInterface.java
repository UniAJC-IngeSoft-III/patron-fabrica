package org.unijac.ingesoft3.interfaces;

/**
 * Created by alexhd on 9/9/14.
 */
public class HeirInterface implements Interface {
    @Override
    public void hail() {
        System.out.printf("hello %s%n", getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public HeirInterface() {
        hail();
    }

    public static void main(String[] args) {
        HeirInterface heir = new HeirInterface();
    }
}
