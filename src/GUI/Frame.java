package GUI;

import javax.swing.*;

/**
 * Created by Johnny on 16/11/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class Frame {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Frame with component");

        // Set the frame size
        frame.setSize(400,300); // 400 pixels wide and 300 pixels high

        // Centre the frame
        frame.setLocationRelativeTo(null);

        // Close the frame upon exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame
        frame.setVisible(true);

        // Create a JButton object
        JButton jbtSubmit = new JButton("Submit");

        // Add the button to the frame - placed by default into the centre region by the Border Layout manager.
        frame.add(jbtSubmit);


    }
}
