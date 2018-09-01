import javax.swing.*;
import java.awt.*;

public class Ulam_Spiral extends JFrame{

    public static void main(String[] args){
        new Ulam_Spiral();
    }

    public Ulam_Spiral(){
        this.setSize(400, 400);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Ulam Spiral");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Draw draw = new Draw();
        this.add(draw);

        this.setVisible(true);
    }
}
