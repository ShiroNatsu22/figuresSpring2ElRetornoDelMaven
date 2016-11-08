package figuresSpring;

import java.util.Scanner;


public class Figure {//Aquesta sera la clase pare, contendra totes les variables comunes a tots els objectes, despres cridarem aquesta clase als fills que contendran tota la informacio introduida,mes tota la informacio introduida als fills per conformar un objecte quadrat per exemple, i despres a la classe drawFigures cridarem a totes les configuracions
    protected Scanner sc = new Scanner(System.in);
    private int posX;
    private int posY;
    private String color;

    void data() {
        // per a que el next agafi tot, ja que si troba un espai en blanc, en e text mostrar la 1a paraula
        sc.useDelimiter(System.getProperty("line.separator"));

        System.out.println("A quina posicio el vols?:(En x i en y)");
        posX = sc.nextInt();
        posY = sc.nextInt();

        System.out.println("De quin color vols que estigui?(negre|blau|vermell|taronja|groc)");
        color = sc.next();

    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getColor() {
        return color;
    }
}
