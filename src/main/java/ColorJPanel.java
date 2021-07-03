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
        graphics.fill3DRect(15,25,100,20);
        graphics.drawString("Current RGB: " + graphics.getColor(), 130, 40);
    }
}
