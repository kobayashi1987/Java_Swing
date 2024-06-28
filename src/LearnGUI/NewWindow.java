package LearnGUI;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame(); // Create a frame
    JLabel label = new JLabel("Hello jack"); // Create a label

    public NewWindow() {

        label.setBounds(0,0,100,50); // Set the position and size of the label
        label.setFont(new Font(null, Font.PLAIN, 25)); // Set the font of the label

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the frame
        frame.setSize(new Dimension(420, 420)); // Set the size of the frame
        frame.setLayout(null);
        frame.add(label); // Add the button to the frame
        frame.setVisible(true); // Make the frame visible


        System.out.println("New Window");
    }
}
