package InterfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class DrawShapes {

    public static void main(String[] args) {
        Shape x = new Rect(0, 0, 200, 75);
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        p.setColor(Color.red);
        p.setWidth(10);

        x.draw(p);

        Scanner s = new Scanner(System.in);
        System.out.print("Press <enter> key to move rectangle to -200,-200");
        s.next();
        p.setColor(Color.white);
        x.draw(p);
        x.move(-200, -200);
        p.setColor(Color.red);
        x.draw(p);
    }

}
