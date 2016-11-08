package figuresSpring;

public class Circle extends Figure {

    private int radius;


    private boolean fill;

    @Override
    void data() {
        super.data();
        System.out.println("Quin es el radi que vols?");
        radius= sc.nextInt();
        System.out.println("El vols relleno?(s|n)");
        fill=sc.next().equals("s");

    }

    public int getRadius() {
        return radius;
    }




    public boolean isFill() {
        return fill;
    }
}
