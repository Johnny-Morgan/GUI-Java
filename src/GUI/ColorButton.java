package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


/**
 * Created by Johnny on 23/11/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */

public class ColorButton extends JFrame implements ActionListener{
    // Instance variable
    JButton jbtSubmit;

    // Constructor
        public ColorButton(){
        // Instantiate JButton object
        jbtSubmit = new JButton("Submit");

        // Add actionListener for button
        jbtSubmit.addActionListener(this);

        // Instantiate Color object
        Color color = new Color(255,255,0); // YELLOW

        // Set background colour of object
        jbtSubmit.setBackground(color);

        // Add button to frame - it will be placed in the centre
        add(jbtSubmit);
    }

    public static void main (String[] args){
        // Create an object from the class.
        ColorButton cb = new ColorButton();

        // Set frame attributes
        cb.setSize(200,200);
        cb.setLocationRelativeTo(null);
        cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Display the frame
        cb.setVisible(true);
    }

    // Event Handling Method
    public void actionPerformed(ActionEvent e){

        // There is only one GUI component on the frame.
        // There is no ambiguity as to which component generated the event.
        System.out.println("Button clicked");
    }
}



