package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Johnny on 16/11/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class FlowLayoutManager {
    public static void main(String[] args) {

        // Create a JFrame object
        JFrame frame = new JFrame();

        // Set FlowLayout as the layout manager for the frame.
        // Specify left alignment for GUI components.
        // Specify a horizontal gap of 10 pixels between components.
        // Specify a vertical gap of 20 pixels between components.
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT,10,20);
        frame.setLayout(layout);

        // Create and add labels, text fields and buttons to the frame.
        frame.add(new JLabel("First Name: "));
        frame.add(new JTextField(10)); // space for 10 characters to be entered
        frame.add(new JLabel("Last Name: "));
        frame.add(new JTextField(10)); // space for 10 characters to be entered
        frame.add(new JButton("Submit: "));
        frame.add(new JButton("Exit"));

        // Set the attributes of the frame.
        frame.setTitle("ShowFlowLayout");
        frame.setSize(250,210);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
