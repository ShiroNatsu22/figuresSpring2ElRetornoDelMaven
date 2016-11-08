package figuresSpring;


import java.awt.*;
public class Text extends  Figure{
    private String text;

    @Override
    void data() {
        super.data();
        System.out.println("Quin text vols que es mostri?");
        text=sc.next();

    }

    public String getText() {
        return text;
    }
}
