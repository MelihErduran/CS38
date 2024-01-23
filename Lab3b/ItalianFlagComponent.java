package Lab3b;

import javax.swing.*;
import java.awt.*;


public class ItalianFlagComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        ItalianFlag flag = new ItalianFlag(100, 100, 90);
        flag.draw(g2);
    }
}
