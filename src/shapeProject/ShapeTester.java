package shapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author cars0520
 */
public class ShapeTester {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800, 600));

        //Shape s = new Shape(); --> not allowed
        Shape a = new Wheel(100, 100, 50, 6); //ok
        a.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.println("Press <enter> to change Wheel to Rect");
        s.nextLine();
        p.setColor(Color.white);
        a.draw(p);
        a = makeOneShapeFromAnother(a,1);
        p.setColor(Color.blue);
        a.draw(p);

        Shape b = new Wheel(); //ok

        Circle c = new Wheel(); //ok parent can be a child
        Circle cc = new Circle();
        //c is both a circle and a Wheel
        //c is also a Shape

        Wheel w = new Wheel(); //w is a Wheel, Circle, and Shape
        //Wheel w = new Circle(); //no Child cant be parent
        //All wheels are circles, but all Circles are
        //not neccessarily Wheel
        System.out.println("Is 'c' a Shape? --> " + (c instanceof Shape));
        System.out.println("Is 'c' a Circle? --> " + (c instanceof Circle));
        System.out.println("Is 'c' a Wheel? --> " + (c instanceof Wheel));
        System.out.println("Is 'w' a Circle? --> " + (w instanceof Shape));
        System.out.println("Is 'cc' a Wheel? --> " + (cc instanceof Wheel));

    }

    public static Shape makeOneShapeFromAnother(Shape inShape, int type) {
        //1=Rect, 2=Circle, 3=Wheel
        Shape outShape;
        if (type == 1) {
            double area = inShape.area();
            return new Rect(inShape.getXPos(), inShape.getXPos(),
                    Math.sqrt(area), Math.sqrt(area));
        } else if (type == 2) {
            double area = inShape.area();
            double rad = Math.sqrt(area / Math.PI);
            return new Circle(inShape.getXPos(), inShape.yPos, rad);
        } else {
            double area = inShape.area();
            double rad = Math.sqrt(area / Math.PI);
            return new Wheel(inShape.getXPos(), inShape.yPos, rad, 5);
        }
    }

}
