package Lab12a;

import javax.swing.*;

public class TargetViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Target Logo");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TargetLogo targetLogo = new TargetLogo();
        frame.add(targetLogo);

        frame.setVisible(true);
    }
}