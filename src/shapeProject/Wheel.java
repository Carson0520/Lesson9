/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;

import InterfaceEx2.*;
import TurtleGraphics.Pen;

/**
 *
 * @author cars0520
 */
public class Wheel extends Circle {

    //Wheel inherits everything from circle except constructor
    private int spokes; //wheel has 4 properties (this one and 3 form circle)

    public Wheel() {
        xPos = 0;
        yPos = 0;
        radius = 0;
        spokes = 3;
    }

    public Wheel(double x, double y, double r, int s) {
        super(x, y, r);   //super = call parent constuctor
        spokes = s;
    }

    public void draw(Pen p) {
        //call parent draw to get the circle
        super.draw(p);
        //draw spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i * 360 / spokes);
            p.move(radius);
        }
    }

    //exclusive method 
    public void setSpokes(int s) {
        spokes = s;
    }

    //orver ride the toString Method()
    public String toString() {
        String str = "WHEEL\n";
        str += "Radius: " + radius + "\n";
        str += ("(x,y) = (" + xPos + ", " + yPos + ")\n");
        str += "Number of Spokes: " + spokes + "\n";
        str += "Area: " + area()+"\n";
        str += "Perimeter: " + perimeter();
        return str;
    }
}
