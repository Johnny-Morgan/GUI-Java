package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Johnny on 16/11/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class BorderLayoutManager {
    public static void main(String[] args) {

        // Create a JFrame object
        JFrame frame = new JFrame();

        // Set BorderLayout as the layout manager for the frame.
        // Note, by default, a frame has a border layout set.
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);

        // Create and add labels to the frame.
        frame.add(new JButton("CENTRE"), BorderLayout.CENTER);
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("EAST"), BorderLayout.EAST);

        // Set the attributes of the frame.
        frame.setTitle("BorderLayout Manager");
        frame.setSize(250,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
