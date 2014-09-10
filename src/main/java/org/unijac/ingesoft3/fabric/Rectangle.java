package org.unijac.ingesoft3.fabric;

/**
 * Created by alexhd on 9/9/14.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        move(5, 8);
        position();
    }

    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }

    @Override
    public void resize() {
        System.out.println("drawing a rectangle");

    }
}
