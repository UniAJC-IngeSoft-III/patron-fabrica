package org.unijac.ingesoft3;

import org.unijac.ingesoft3.fabric.Shape;
import org.unijac.ingesoft3.fabric.Rectangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Shape myShape = new Rectangle();
        myShape.draw();
        myShape.resize();
    }
}
