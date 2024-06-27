package LearnGUI;

import javax.swing.*;
import java.awt.*;


// Study JlayeredPane
//JLayeredPane is a Swing container that provides a third dimension for positioning components: depth, also known as Z-order or z-index.
// The depth of a component is the order in which it is painted; components with a higher depth are painted after components with a lower depth.

public class Main{

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Create 3 labels
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);

        //create a JLayeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,800,600);
        layeredPane.setLayout(null);

        // add labels to the layeredPane
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        // create a frame
        JFrame frame = new JFrame("JLayeredPane Example");
        frame.add(layeredPane); // add the layeredPane to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(new Dimension(800,600)); // set the x-dimension and y-dimension of the frame
        frame.setLayout(null); // set the layout of the frame
        frame.getContentPane().setBackground(new Color(0x123456)); // set the background color of the frame



        // create visibility
        frame.setVisible(true); // Make sure the frame is visible
    }
}
