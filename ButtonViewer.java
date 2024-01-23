import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
   This program demonstrates how to install an action listener.
*/
public class ButtonViewer {
   public static void main(String[] args) {

     JFrame frame = new JFrame();
     frame.setLayout(new FlowLayout());
     JButton buttonA = new JButton("Button A");
     JButton buttonB = new JButton("Button B");
     frame.add(buttonA);
     frame.add(buttonB);

     class MyListenerA implements ActionListener {
         int aCounter = 0;
         public void actionPerformed(ActionEvent event) {
             aCounter++;
             if (aCounter < 2) {
                 System.out.println("Button A was clicked " + aCounter + " time!");
             } else {
                 System.out.println("Button A was clicked " + aCounter + " times!");
             }
             LocalDateTime currentTime = LocalDateTime.now();
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss z yyyy");
             String formattedTime = currentTime.atZone(ZoneId.of("GMT")).format(formatter);
             System.out.println("Button A was clicked at " + formattedTime);
             System.out.println("");
         }
     }

     class MyListenerB implements ActionListener {
         int bCounter = 0;
         public void actionPerformed(ActionEvent event) {
             bCounter++;
             if (bCounter < 2) {
                 System.out.println("Button B was clicked " + bCounter + " time!");
             } else {
                 System.out.println("Button B was clicked " + bCounter + " times!");
             }
             LocalDateTime currentTime = LocalDateTime.now();
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
             String formattedTime = currentTime.atZone(ZoneId.of("GMT")).format(formatter);
             System.out.println("Button pressed at: " + formattedTime);
             System.out.println("");
         }
     }
     
     ActionListener listenerA = new MyListenerA();
     buttonA.addActionListener(listenerA);

     ActionListener listenerB = new MyListenerB();
     buttonB.addActionListener(listenerB);

     frame.setSize(100, 60);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
   }
}


