package shapeProject;

import InterfaceEx2.*;
import TurtleGraphics.Pen;

//abstract = cant make direct objects from Shape class
abstract public class Shape {

    protected double xPos, yPos;

    public Shape() {
        xPos = 0;
        yPos = 0;
    }

    public Shape(double xp, double yp) {
        xPos = xp;
        yPos = yp;
    }

    //all shapes have area but its different for each
    //must declare tha fact here
    //must make method abstract
    //abstract method is declared like it is in interface
    abstract public double area();

    abstract public void draw(Pen p);

    abstract public void stretchBy(double factor);

    //these methods are identical in all shapes
    //so we can provide code here
    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    public String toString() {
        String str = ("(x,y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area();
        return str;
    }
}
