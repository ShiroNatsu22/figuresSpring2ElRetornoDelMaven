package figuresSpring;
    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.EventQueue;
    import java.awt.Graphics;

    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.border.EmptyBorder;


    public class drawFigures extends JFrame {

        private JPanel contentPane;



        public drawFigures() {//El JPanel
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(new BorderLayout(0, 0));
            setContentPane(contentPane);
            setBounds(0, 0, 800, 600);
        }


        public void paint (Graphics g) {//Servira per a pintar el historial,ja que quan al nostre menu elegigem la opcio H el que fara es recorre la llista creada al main i anira imprimint els diferents Objectes figura amb les configuracions que lis hem donat anteriorment
            super.paint(g);
            if (Main.answer.equals("H")) {
                for (int i = 0; i < Main.f.size(); i++) {
                    Main.figure = Main.f.get(i);

                    selectedFigure(g);

                }
            } else {
                selectedFigure(g);
            }
        }

        void selectedFigure(Graphics g) {//Aqui obtenim la configuracio donada al objecte(gets)
            if (Main.figure.getColor().equals("negre")) {
                g.setColor(Color.black);
            } else if (Main.figure.getColor().equals("blau")) {
                g.setColor(Color.blue);
            } else if (Main.figure.getColor().equals("vermell")) {
                g.setColor(Color.red);
            } else if (Main.figure.getColor().equals("taronja")) {
                g.setColor(Color.orange);
            } else if (Main.figure.getColor().equals("groc")) {
                g.setColor(Color.yellow);
            }
            if (Main.figure instanceof Square) {
                Square square = (Square) Main.figure;

                if (square.isFill()) {

                    g.fillRect(square.getPosX(), square.getPosY(), square.getDimensions(), square.getDimensions());
                }
                g.drawRect(square.getPosX(), square.getPosY(), square.getDimensions(), square.getDimensions());
            } else if (Main.figure instanceof Text) {
                Text text = (Text) Main.figure;

                g.drawString(text.getText(), text.getPosX(), text.getPosY());
            } else if (Main.figure instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) Main.figure;
                if (rectangle.isFill()) {

                    g.fillRect(rectangle.getPosX(), rectangle.getPosY(), rectangle.getWidth(), rectangle.getHeigth());
                }
                g.drawRect(rectangle.getPosX(), rectangle.getPosY(), rectangle.getWidth(), rectangle.getHeigth());

            } else if (Main.figure instanceof Circle) {
                Circle circle = (Circle) Main.figure;
                if (circle.isFill()) {

                    g.fillArc(circle.getPosX(), circle.getPosY(), circle.getRadius(),circle.getRadius(), 0, 360);
                }
                g.drawArc(circle.getPosX(), circle.getPosY(), circle.getRadius(),circle.getRadius(), 0,
                        360);
            } else if (Main.figure instanceof Line) {
                Line line = (Line) Main.figure;

                g.drawLine(line.getPosX(), line.getPosY(), line.getLongitude(), line.getPositionY());
            }else if (Main.figure instanceof Dot){
                Dot dot= (Dot) Main.figure;
                g.drawString(dot.getDot(),dot.getPosX(),dot.getPosY());
            }else if ( Main.figure instanceof Poligon){
                Poligon poligon = (Poligon) Main.figure;
                g.drawPolygon(poligon.getX(),poligon.getY(),poligon.getNumber());
            }
        }
    }






