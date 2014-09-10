package org.unijac.ingesoft3.Abstract;

/**
 * Created by alexhd on 9/9/14.
 */
public class HeirAbstractClass extends AbstractClass {
    @Override
    public void goodbye() {
        System.out.println("goodbye " + super.name);
    }

    public HeirAbstractClass() {
        naming("Alex");
        hail();
        goodbye();
    }

    private void naming(String name) {
        super.name = name;
    }

    public static void main(String[] args) {
        HeirAbstractClass heirAbstractClass = new HeirAbstractClass();

    }
}
