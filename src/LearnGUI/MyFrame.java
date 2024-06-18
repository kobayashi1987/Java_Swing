package LearnGUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){


        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //exit out of application
        this.setResizable(false);
        this.setSize(800, 600);
        this.setVisible(true);
        this.setTitle("Learn GUI");


        ImageIcon image = new ImageIcon("LearnGUI/resources/norway.png"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(0x000000));
    }
}
