package shapeProject;

import InterfaceEx2.*;
import TurtleGraphics.Pen;

public class Circle extends Shape {

    //xPos and yPos are inherited form Shape
    protected double radius;
    //protected = available here and to children only

    public Circle() {
        super(); //up to Shape
        radius = 1;
    }

    public Circle(double x, double y, double r) {
        super(x, y);
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * radius / 120;
        //120-sided shape
        p.up();
        p.move(xPos, yPos);
        //go to edge

        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);//120*3=360 degrees
        }
    }



    @Override
    public void stretchBy(double factor) {
        radius *= factor;
        //radius = (factor * radius);
    }

    public String toString() {
        String str = "CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str += super.toString();//get the rest from the parent
        return str;
    }

    @Override
    public double perimeter() {
        return Math.PI*2*radius;
    }
}
