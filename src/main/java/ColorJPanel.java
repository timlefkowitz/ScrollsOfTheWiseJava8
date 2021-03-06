import javax.swing.*;
import java.awt.*;

public class ColorJPanel extends JPanel
{
    // Draw rectangles and Strings in different colors
    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        this.setBackground(Color.WHITE);

        //set new drawing color using inegers
        graphics.setColor(new Color(255, 0, 0));
        graphics.fillRect(215,215,10,40);
        graphics.drawString("Current RGB: " + graphics.getColor(), 130, 40);

        //Set new drawing color using floats
        graphics.setColor(new Color(0.50f, 0.75f, 0.0f));
        graphics.fillRect(15,50,100,20);
        graphics.drawString("Current RGB: " + graphics.getColor(), 130, 65);

        // Set new drawing color using static Color objects
        graphics.setColor(Color.BLUE);
        graphics.fillRect(15,75,100,20);
        graphics.drawString("Current RGB: " + graphics.getColor(), 130, 90);

        // Display individual RGB values
        Color color = Color.MAGENTA;
        graphics.setColor(color);
        graphics.fillRect(15, 100, 100, 20);
        graphics.drawString("RGB Values: " + color.getRed() + "," + color.getGreen() + ", " + color.getBlue(), 130, 115);
    }
} //end of class
