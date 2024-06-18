package LearnGUI;

import javax.swing.*;
import java.awt.*;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        ImageIcon image = new ImageIcon("norway.png");
//        JLabel label = new JLabel();
//        label.setIcon(image);
//        label.setText("Hi, I am a label");
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setForeground(new Color(0x00FF00));
//
//        // study JButton
//        MyFrame frame01 = new MyFrame();
//        frame01.setTitle("Learn JButton");
//        frame01.setSize(800, 600);
//        frame01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the frame is closed
//        frame01.setLayout(new FlowLayout()); // Set a layout manager
//        frame01.add(label);
//        frame01.setVisible(true); // Make sure the frame is visible
//    }
//}

// study JButton


public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");

        // create label
        ImageIcon image = new ImageIcon("norway.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        label.setText("Hi, I am a label, gonna learn JButton next.");
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setBounds(0, 0, 800, 600);

        // create frame
        MyFrame frame = new MyFrame();
        frame.setTitle("Learn JButton");
        frame.setSize(1200, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the frame is closed
//        frame.setLayout(new FlowLayout()); // Set a layout manager
        frame.add(label);
        frame.setVisible(true); // Make sure the frame is visible

    }
}