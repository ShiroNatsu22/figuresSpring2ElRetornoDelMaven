package figuresSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by jgarcias on 11/10/16.
 */
public class Main {

    private static ApplicationContext injector = new ClassPathXmlApplicationContext(
            "spring-config.xml");

    protected static String answer = ""; //Guardara la resposta donada al menu i despres la comparara per a sebre quin objecte haura de dibuixar
    private static Scanner sc = new Scanner(System.in);
    public static Figure figure;//On guardarem els objectes
    protected static List<Figure> f =new ArrayList<Figure>();//Servira per fer l'historial, ja que els objectes creats els guardarem dins de aquesta llista

    private static void  menu() {//Apart de poder elegir la figura que volem que pinti, dibuixara la figura objecte, i cada vegada que s'ha creat una figura l'afegira a la llista


        System.out.println("A.Text \n" + "B.Punt \n" + "C.Línia \n" + "D.Cercle \n" + "E.Quadrat \n"
                + "F.Rectangle \n" + "G.Poligon \n" + "H.Historic de figures \n" + "I.Sortir \n");

        System.out.println("Que vols fer?:");
        answer = sc.nextLine();

        if (answer.equals("A")) {
            figure = (Text) injector.getBean("text");
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("B")) {
            figure = (Dot) injector.getBean("dot");
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("C")) {
            figure = (Line) injector.getBean("line");
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("D")) {
            figure = (Circle) injector.getBean("circle");
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("E")) {
            figure = (Square) injector.getBean("square");
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("F")) {
            figure = (Rectangle) injector.getBean("rectangle");
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("G")) {
            figure = (Poligon) injector.getBean("poligon");
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("H")) {

            draw();
        }else if(answer.equals("I")){
            return;
        }
        else {
            System.out.println("Introdueix una opcio valida");

        }
        menu();
    }

    static void draw() {//Sera la encarregada de dibuixar la figura, i esta cridada al menu.
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    drawFigures frame = new drawFigures();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public static void main(String[] args) {
        menu();
    }
}
