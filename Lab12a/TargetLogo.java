package Lab12a;

import javax.swing.*;
import java.awt.*;

class TargetLogo extends JComponent {
   public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        int circleDiameter = 100;
        int x = getWidth() / 2 - circleDiameter / 2;
        int y = getHeight() / 2 - circleDiameter / 2;
        g.fillOval(x, y, circleDiameter, circleDiameter);

        g.setColor(Color.WHITE);
        int targetDiameter = 60;
        int targetX = getWidth() / 2 - targetDiameter / 2;
        int targetY = getHeight() / 2 - targetDiameter / 2;
        g.fillOval(targetX, targetY, targetDiameter, targetDiameter);

        g.setColor(Color.RED);
        int dotDiameter = 25;
        int dotX = getWidth() / 2 - dotDiameter / 2;
        int dotY = getHeight() / 2 - dotDiameter / 2;
        g.fillOval(dotX, dotY, dotDiameter, dotDiameter);

        String text = "TARGET";
        Font font = new Font("Arial", Font.BOLD, 14);
        g.setColor(Color.BLACK);
        g.setFont(font);
        FontMetrics fontMetrics = g.getFontMetrics();
        int textWidth = fontMetrics.stringWidth(text);
        int textX = getWidth() / 2 - textWidth / 2;
        int textY = getHeight() - 10; // Adjust the vertical position as needed
        g.drawString(text, textX, textY);
    }
}