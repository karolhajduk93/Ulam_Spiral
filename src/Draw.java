import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Draw extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int width = 190;
        int height = 160;
        int x = width, y = height;
        Ellipse2D ellipse = new Ellipse2D.Double(x, y, 3, 3);
        g2.fill(ellipse);
        g2.draw(ellipse);

        int k = 0, i = 1;
        System.out.println(i + "XXX");
        i++;
        while (i < 49){
            k++;
            for (int j = 0; j < k; j++){
                //go right (print or compute i)
                x += 6;
                ellipse.setFrame(x, y,3, 3);
                g2.draw(ellipse);
                g2.fill(ellipse);
                System.out.print(i + " ");
                i++;
                if(i > 49)
                    break;
            }
            if(i > 49)
                break;
            System.out.println();
            for (int j = 0; j < k; j++){
                //go up (print or compute i)
                y -= 6;
                ellipse.setFrame(x, y,3, 3);
                g2.draw(ellipse);
                g2.fill(ellipse);
                System.out.print(i + " ");
                i++;
                if(i > 49)
                    break;
            }
            if(i > 49)
                break;
            System.out.println();
            k++;
            for (int j = 0; j < k; j++){
                //go left (print or compute i)
                x -= 6;
                ellipse.setFrame(x, y,3, 3);
                g2.draw(ellipse);
                g2.fill(ellipse);
                System.out.print(i + " ");
                i++;
                if(i > 49)
                    break;
            }
            if(i > 49)
                break;
            System.out.println();
            for (int j = 0; j < k; j++){
                //go down (print or compute i)
                y += 6;
                ellipse.setFrame(x, y,3, 3);
                g2.draw(ellipse);
                g2.fill(ellipse);
                System.out.print(i + " ");
                i++;
                if(i > 49)
                    break;
            }
            System.out.println();
        }
    }
}
