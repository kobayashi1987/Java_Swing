package LearnGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    // declare a button globally
    JButton button;
    JLabel label;

    MyFrame(){

        //create an image icon
        ImageIcon icon = new ImageIcon("finland.png");
        ImageIcon icon1 = new ImageIcon("denmark.png");

        // create a label
        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(800, 0, 800,600);
        label.setText("Hi, I am Denmark, near to Norway.");
        label.setForeground(new Color(0x00AA00));
        label.setVisible(false);

        // create a button
        button = new JButton();
        button.setBounds(300, 700, 250, 100);
        button.addActionListener(this); // add action listener to button
        button.setText("Click me");
        button.setFocusable(false); // remove the focus of the button
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER); // set the text position
        button.setVerticalTextPosition(JButton.BOTTOM); // set the text position
        button.setFont(new Font("Comic Sans", Font.BOLD, 25)); // set the font
        button.setForeground(Color.cyan); // set the font color
        button.setIconTextGap(10); // set the gap between text and icon
        button.setBackground(Color.lightGray); // set the background color
        button.setBorder(BorderFactory.createEtchedBorder()); // set the border

        // set the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setSize(800, 600);
        this.setVisible(true);
        this.setTitle("Learn JButton");
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x123456)); // set the frame color
        this.add(button);   // add button to the frame
        this.add(label);    // add label to the frame


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // when button is clicked, this will execute
        if(e.getSource() == button){
            System.out.println("Button clicked");
            label.setVisible(true);
            button.setEnabled(false); // disable the button
        }
    }


}
