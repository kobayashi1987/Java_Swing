package LearnGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        JFrame frame = new JFrame();  // creates an instance of frame
        JLabel label = new JLabel("Hello World");  // creates an instance of label
        JLabel label01 = new JLabel();  // creates an instance of label
        JPanel redPanel = new JPanel(); // creates an instance of panel

        // create a blue panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        // create a green panel
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
//        greenPanel.setLayout(new BorderLayout());   // set layout manager
        greenPanel.setLayout(null);


        //set up the panel
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);   // set layout manager

        // creating image icon
        ImageIcon image = new ImageIcon("norway01.png"); // create an image icon
        ImageIcon image01 = new ImageIcon("finland.png"); // create an image icon

        // set up border
        Border border = BorderFactory.createLineBorder(Color.green,3);




        // set up the  label
        label.setIcon(image);
        label.setText("Bro, do you like code ?");
        label.setHorizontalTextPosition(JLabel.CENTER);// set text left, right, or center
        label.setVerticalTextPosition(JLabel.TOP);  // set text top, bottom, or center
        label.setForeground(Color.black);
        label.setFont(new Font("My Boli", Font.BOLD, 50));
        label.setIconTextGap(40);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set horizontal and vertical position
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(1000, 200, 800, 600);

        //set up label01
        label01.setText("Hello, jack ?");
        label01.setIcon(image01);
        label01.setVerticalAlignment(JLabel.BOTTOM);
        label01.setHorizontalAlignment(JLabel.RIGHT);
        label01.setBounds(0, 0, 200, 150);

        // Add the label to the frame's content pane
//        frame.getContentPane().add(label, BorderLayout.CENTER);

        // setting up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(true);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setTitle("Learn GUI");
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(0x000000));
        frame.setLayout(null);

        frame.add(label);
        frame.add(label01);
        bluePanel.add(label01);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        // Display the frame
        frame.setVisible(true);

    }
}

