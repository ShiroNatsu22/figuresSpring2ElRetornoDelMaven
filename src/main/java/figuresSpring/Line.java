package figuresSpring;

public class Line extends Figure{
    private int longitude;
    private int positionY;
    @Override
    void data() {
        super.data();
        System.out.println("De quina llargaria vols la linia?");
        longitude=sc.nextInt();
        System.out.println("Fins a on vols que arribi la linia?");
        positionY=sc.nextInt();
    }

    public int getLongitude() {
        return longitude;
    }

    public int getPositionY() {
        return positionY;
    }
}
