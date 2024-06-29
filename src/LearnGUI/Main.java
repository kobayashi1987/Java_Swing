package LearnGUI;

import javax.swing.*;
import java.awt.*;


// JOptionPane
// JOptionpane is a class that is used to create a dialog box that prompts the user for a value or informs them of something.
// JOptionPane.showMessageDialog(null, "Hello World"); // Display a message dialog box

public class Main{

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Display a message dialog box
//        JOptionPane.showMessageDialog(null, "Hello World","Title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World","Title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World","Title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World","Title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World","Title", JOptionPane.ERROR_MESSAGE);

        // Display a confirm dialog box
//        JOptionPane.showConfirmDialog(null, "Hello World","Title", JOptionPane.YES_NO_CANCEL_OPTION);
//        int answer = JOptionPane.showConfirmDialog(null, "Hello World","Title", JOptionPane.YES_NO_CANCEL_OPTION);
//        // input dialog box
//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name);

        // option dialog box
        String[] responses = {"yes, I am", "no, i am not", "maybe yes, maybe no"};
        ImageIcon icon = new ImageIcon("finland.png");
        JOptionPane.showOptionDialog(null,
                "you are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);
    }
}
