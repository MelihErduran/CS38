package Lab3b;

import javax.swing.*;

public class ItalianFlagViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Melih Erduran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ItalianFlagComponent component = new ItalianFlagComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
