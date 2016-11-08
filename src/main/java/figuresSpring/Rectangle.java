package figuresSpring;

import java.awt.*;
public class Rectangle extends Figure{

    private int width;
    private int heigth;
    private boolean fill;



    @Override
    void data() {
        super.data();
        System.out.println("Quina amplada vols per al rectangle?");
        width=sc.nextInt();
        System.out.println("I altura?");
        heigth=sc.nextInt();
        System.out.println("El vols relleno?(s|n");
        fill=sc.next().equals("s");
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public boolean isFill() {
        return fill;
    }
}
