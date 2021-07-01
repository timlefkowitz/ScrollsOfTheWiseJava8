package Display;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel
{
    //// Draws a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        //My first shapes :D !!!!!
        for (int i = 0; i < 10; i++) {

            //// 10 + i * 30 = starting from 10 pixels down and 30 pixels to the right
            g.drawRect(10 + i * 30, 10 + i * 30,
                    50 + i * 30, 50 + i * 30);
            g.drawOval(240 + i * 10, 10 + i * 10,
                    50 + i * 10, 50 + i * 10);
        }
    }
    public static void main (String [] args)
    {
        Shapes panel = new Shapes(); //creates the panel
        JFrame application = new JFrame(); //creates a new JFrame


        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(500, 290);
        application.setVisible(true);

        }
    } // End of class shapes
