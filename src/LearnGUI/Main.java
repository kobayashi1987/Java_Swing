package LearnGUI;

import javax.swing.*;
import java.awt.*;


// Study GridLayout
// GridLayout is a layout manager that lays out a container's components in a rectangular grid.
// The container is divided into equal-sized rectangles, and one component is placed in each rectangle.


public class Main{

    public static void main(String[] args) {
        System.out.println("Hello World");

        // create a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(800, 600); // set the x-dimension and y-dimension of the frame
        frame.setLayout(new GridLayout(3, 3, 10, 10)); // set the layout of the frame
        frame.getContentPane().setBackground(new Color(0x123456)); // set the background color of the frame

        //create a panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new GridLayout(3, 3, 10, 10)); // set the layout of the panel

        // create buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("10");
        JButton button11 = new JButton("11");
        JButton button12 = new JButton("12");
        JButton button13 = new JButton("13");
        JButton button14 = new JButton("14");
        JButton button15 = new JButton("15");
        JButton button16 = new JButton("16");
        JButton button17 = new JButton("17");

        // add buttons to the panel
        panel.add(button16);
        panel.add(button17);

        //add panel to the frame
        frame.add(panel);

        // add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button15);

        // create visibility
        frame.setVisible(true); // Make sure the frame is visible
    }
}
