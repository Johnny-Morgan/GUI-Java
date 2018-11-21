package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Johnny on 21/11/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */

public class TelephonePad {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        // Create panel p1 to store the buttons for the GUI.
        // Set GridLayout as Layout Manager.
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        // Add buttons 0-9 to panel p1, using a for loop.
        for (int i = 0; i <= 9; i++)
            p1.add(new JButton("" + i));

        // Add the remaining buttons.
        p1.add(new JButton("Dial"));
        p1.add(new JButton("Clear"));

        // Create panel p2, to hold a text field.
        // In practice, this would display the number dialled.
        // This is beyond the scope of this demonstration.
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(new JTextField("Dialled No. entered appears here:"));

        // Create a parent panel p3 to hold child panels, p1 and p2.
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3.add(p2); // add panel with text field
        p3.add(p1); // add panel with buttons

        // Add parent panel p3 to the frame.
        frame.add(p3); // Frame has a border layout by default.

        // Set the frame's attributes and display it.
        frame.setTitle("Telephone Pad");
        frame.setSize(250,200);
        frame.setLocationRelativeTo(null); // centre the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

