package data;

import java.awt.*;

public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());

        //contoh hasil/pemakaian atas pemakaian super keyword di class Rectangle yg ngeshadow parent classnya (class Shape)
        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
