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
        label.setText("Hi, I am a label, gonna learn BorderLayout next.");
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setBounds(0, 0, 800, 600);

        // create frame
        JFrame frame = new JFrame();
        frame.setTitle("Learn BorderLayout");
        frame.setSize(1200, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the frame is closed
        frame.getContentPane().setBackground(new Color(0x123456)); // set the frame color
        frame.setLayout(new BorderLayout(10,10)); // Set a layout manager and the margin
        frame.add(label);
//        frame.setVisible(true); // Make sure the frame is visible

        //create a panel
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        //set the panel color
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.magenta);

        //set the panel size
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        // Add the panels to the frame

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.SOUTH);

        //---------------- Sub Panels ----------------

        //create a panel
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        //set the panel color
        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel3.setLayout(new BorderLayout()); // set the layout manager

        //set the panel size
        panel6.setPreferredSize(new Dimension(100, 100));
        panel7.setPreferredSize(new Dimension(100, 100));
        panel8.setPreferredSize(new Dimension(100, 100));
        panel9.setPreferredSize(new Dimension(100, 100));
        panel10.setPreferredSize(new Dimension(100, 100));

        panel3.add(panel6,BorderLayout.NORTH);
        panel3.add(panel7,BorderLayout.WEST);
        panel3.add(panel8,BorderLayout.CENTER);
        panel3.add(panel9,BorderLayout.EAST);
        panel3.add(panel10,BorderLayout.SOUTH);


        // create visibility
        frame.setVisible(true); // Make sure the frame is visible
    }
}

//test github 20240619 2353