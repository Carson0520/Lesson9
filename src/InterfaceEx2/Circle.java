package InterfaceEx2;

import TurtleGraphics.Pen;

public class Circle implements Shape {

    private double xPos, yPos, radius;

    public Circle() {
        xPos = 0;
        yPos = 0;
        radius = 1;
    }

    public Circle(double x, double y, double r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
        //radius = (factor * radius);
    }

    public String toString() {
        String str = "CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str += ("(x,y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area();
        return str;
    }
}
