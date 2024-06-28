package LearnGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame(); // Create a frame
    JButton myButton = new JButton("New Window"); // Create a button

    public LaunchPage() {

        myButton.setBounds(100, 160, 200, 40); // Set the position and size of the button
        myButton.setFocusable(false); // Remove the focus from the button
        myButton.addActionListener(this);   // Add an action listener to the button

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the frame
        frame.setSize(new Dimension(420, 420)); // Set the size of the frame
        frame.setLayout(null);
        frame.add(myButton); // Add the button to the frame
        frame.setVisible(true); // Make the frame visible


        System.out.println("Launch Page");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //To do....
        if (e.getSource() == myButton) {
            frame.dispose(); // Close the frame
            NewWindow myWindow = new NewWindow(); // Create a new window
        }
    }
}
