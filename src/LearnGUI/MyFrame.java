package LearnGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    // declare a button globally
    JButton button;
    JLabel label;
    JTextField textField;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame(){

        //create an image icon
        ImageIcon icon = new ImageIcon("finland.png");
        ImageIcon icon1 = new ImageIcon("denmark.png");

        // create an icon
        xIcon = new ImageIcon("iceland.png");
        checkIcon = new ImageIcon("germany.png");

        // create a check box
        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false); // remove the focus of the check box
        checkBox.setFont(new Font("Comic Sans", Font.BOLD, 25)); // set the font
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        // create a JTextField
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40)); // set the size of text field
        textField.setFont(new Font("Comic Sans", Font.PLAIN, 25)); // set the font
        textField.setForeground(new Color(0x00FF00)); // set the font color
        textField.setBackground(Color.black); // set the background color
        textField.setCaretColor(Color.white); // set the caret color
        textField.setText("user name: "); // set the default text

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
        button.setText("submit");
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
        this.setLayout(new FlowLayout());
        this.add(checkBox);
        this.add(button);   // add button to the frame
        this.add(label);    // add label to the frame
        this.add(textField); // add text field to the frame
        this.pack(); // set the frame to the size of the components
        this.getContentPane().setBackground(new Color(0x123456)); // set the frame color



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // when button is clicked, this will execute
        if(e.getSource() == button){
            System.out.println("Button clicked");
            Boolean state = checkBox.isSelected();
            System.out.println(state);
            String text = textField.getText();
            System.out.println(text);
            textField.setEditable(false);   // set the text field editable or not
            label.setVisible(true);
//            button.setEnabled(false); // disable the button
        }
    }


}
