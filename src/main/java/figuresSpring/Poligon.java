package figuresSpring;

public class Poligon extends Figure {
    private int number;
    private int x[];
    private int y[];
    @Override
    void data() {
        super.data();
        System.out.println("Quants costats vols que tengui el poligon?");
        number = sc.nextInt();

        x = new int[number + 1];
        y = new int [number +1];

        x[0]=this.getPosX();
        y[0]=this.getPosY();

        for (int i = 1; i <x.length - 1 ; i++) {
            System.out.println("posicio a x?");
            x[i]=sc.nextInt();

            System.out.println("posicio a y?");
            y[i]=sc.nextInt();

        }

        x[x.length - 1] = this.getPosX();
        y[y.length - 1] = this.getPosY();
    }

    public int getNumber() {
        return number;
    }

    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }
}
