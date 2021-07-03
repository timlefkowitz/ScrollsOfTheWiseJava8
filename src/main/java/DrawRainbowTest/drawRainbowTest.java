package DrawRainbowTest;

import javax.swing.*;

public class drawRainbowTest {
    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(800, 580);
        application.setVisible(true);
    }
} // End of class
