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
//        ImageIcon image = new ImageIcon("norway.png");
//        JLabel label = new JLabel();
//        label.setIcon(image);
//        label.setText("Hi, I am a label, gonna learn BorderLayout next.");
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setForeground(new Color(0x00FF00));
//        label.setBounds(0, 0, 800, 600);

        // create frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the frame is closed
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 3,3)); // Set a layout manager
//        frame.add(label);
        frame.setTitle("Learn JLabel");
        frame.getContentPane().setBackground(new Color(0x123456));

        // create a panel with FlowLayout manager
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());


        //creat buttons
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();

        button1.setText("Button 1");

        // add the buttons into panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(new JButton("Button 7"));

        // add panel to frame
        frame.add(panel);

        // create visibility
        frame.setVisible(true); // Make sure the frame is visible
    }
}

//test github 20240622 1157 kuala kurau