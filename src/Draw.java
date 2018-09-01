import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Arrays;

public class Draw extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width/2;
        int y = screenSize.height/2;
        int maxValue = 25000;
        Ellipse2D ellipse = new Ellipse2D.Double(x, y, 3, 3);
        
        g2.setColor(Color.red);
        g2.fill(ellipse);
        g2.draw(ellipse);
        g2.setColor(Color.black);


        boolean[] primeNumbers = new boolean[maxValue];
        Arrays.fill(primeNumbers, true);

        for(int i = 2; i < Math.sqrt(maxValue); i++){
            if(primeNumbers[i]){
                for (int j = (int)Math.pow(i, 2); j < maxValue; j += i){
                    primeNumbers[j] = false;
                }
            }
        }

        int k = 0, i = 2;
        while (i < maxValue){
            k++;

            for (int j = 0; j < k; j++){
                //go right
                x += 4;
                ellipse.setFrame(x, y,3, 3);
                if(primeNumbers[i]) {
                    g2.draw(ellipse);
                    g2.fill(ellipse);
                }
                i++;

                if(i >= maxValue)
                    break;
            }

            if(i >= maxValue)
                break;

            for (int j = 0; j < k; j++){
                //go up
                y -= 4;
                ellipse.setFrame(x, y,3, 3);
                if(primeNumbers[i]) {
                    g2.draw(ellipse);
                    g2.fill(ellipse);
                }
                i++;

                if(i >= maxValue)
                    break;
            }

            if(i >= maxValue)
                break;

            k++;

            for (int j = 0; j < k; j++){
                //go left
                x -= 4;
                ellipse.setFrame(x, y,3, 3);
                if(primeNumbers[i]) {
                    g2.draw(ellipse);
                    g2.fill(ellipse);
                }
                i++;

                if(i >= maxValue)
                    break;
            }

            if(i >= maxValue)
                break;

            for (int j = 0; j < k; j++){
                //go down
                y += 4;
                ellipse.setFrame(x, y,3, 3);
                if(primeNumbers[i]) {
                    g2.draw(ellipse);
                    g2.fill(ellipse);
                }
                i++;

                if(i >= maxValue)
                    break;
            }
        }
    }
}
