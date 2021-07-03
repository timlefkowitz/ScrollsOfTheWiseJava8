package DrawRainbowTest;

import javax.swing.*;
import java.awt.*;

public class DrawRainbow extends JPanel {

    // define indigo and violet
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);


    //colors to use in the rainbow, starting from the innermost
    // the two white entires result in an empty arc in the center

    private Color[] colors =
            {
                    Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    // constructor
    public DrawRainbow()
    {
        setBackground(Color.WHITE); // set the background to white
    }

    // Draws a rainbow using concentric arcs
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        int radius = 20; /// radius of the arc

        // draw the rainbow near the button-center
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        //draws filled arcs starting with the outermost
        for (int counter = colors.length ; counter > 0 ; counter--)
        {
            //set the color for the current arc
            graphics.setColor(colors[counter -1]);

            //fill the arc from 0 to 180 degrees
            graphics.fillArc(centerX - counter * radius,
                    centerY - counter * radius,
                    counter * radius * 2, counter * radius * 2, 0, 180);
        }
    }
} //// End of class


