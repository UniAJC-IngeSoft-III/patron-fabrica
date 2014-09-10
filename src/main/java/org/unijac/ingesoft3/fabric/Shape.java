package org.unijac.ingesoft3.fabric;

/**
 * Created by alexhd on 9/9/14.
 */
public abstract class Shape {
    protected int posX;
    protected int posY;

    public void move(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public void position(){
        System.out.printf("{x: %d, y:%d}%n", posX, posY);
    }

    public abstract void draw();
    public abstract void resize();
}
