package shapeProject;

import TurtleGraphics.Pen;

public class Triangle extends Shape {

    private double base, height;

    public Triangle() {
        super();
        base = 1;
        height = 1;
    }

    public Triangle(double x, double y, double b, double h) {
        super(x, y);
        base = b;
        height = h;

    }
    public void resize (int newsize) {
       base = newsize;
       height = newsize;
    }

    @Override
    public double area() {
       return (base * height)/2;
    }
    
    @Override 
    public double perimeter() {
       return (base +(height + (base / 2))+(height + (base / 2))+base);
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);//points to the right
        p.move(base);
        p.turn(120);//turn left
        p.move(height + (base / 2));
        p.turn(120);
        p.move(height + (base / 2));
        p.turn(120);
        p.move(base);
    }

    @Override
    public void stretchBy(double factor) {
        base*=factor;
        height*=factor;
    }
    
    public String toString() {
        String str = "TRIANGLE\n";
        str += "Base x Height: " + base +" x "+ height +"\n";
        str += super.toString();//get the rest from the parent
        return str;
    }
}
