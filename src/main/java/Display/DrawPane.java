package Display;

import java.awt.Graphics;
import javax.swing.*;

class DrawPanel extends JPanel
{
    //draws an x from the corners of the epanel
    public void paintComponent(Graphics g)
    {
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        int width = getWidth(); //total width
        int height = getHeight(); //total height

        //draw a line from the upper-left to the lower-right
        g.drawLine(0,0, width,height);

        g.drawLine(0, height, width, 0);

    }
}//End CLASS DrawPanel


class DrawPaneTest
{
    public static void main(String[] args)
    {
        //create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();


        //set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        application.add(panel);
        application.setSize(400,400);
        application.setVisible(true);
    }
} ///////   End of DrawPane