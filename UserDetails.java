package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Johnny on 22/11/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */


public class UserDetails extends JFrame implements ActionListener{
    // Our GUI components have now been declared as instance variables.
    // This is because they also need to be accessed in the actionPerformed() method.
    JTextField jtfFirstName;
    JTextField jtfLastName;
    JButton btnSubmit;
    JButton btnExit;
    // I am now using a constructor to initialise instance variables.
    // The main reason why I have extended the JFrame class and used a constructor is
    // because I need to use the keyword (this) when I associate a Listener object
    // with a GUI component.
    // For Example: jtfFirstName.addActionListener(this);
    // I cannot include the line above in the main method, as you cannot refer to an object
    // instance (this) within a static context.

    public UserDetails(){

        // Create a JPanel object to hold two labels and two text fields.
        // A panel has a flow layout by default
        // We are going to use a grid layout instead.
        JPanel panelUserEntry = new JPanel(new GridLayout(2,2,5,5));
        jtfFirstName = new JTextField(10);
        jtfLastName = new JTextField(10);

        // Create and add labels, text fields to panelUserEntry.
        panelUserEntry.add(new JLabel("First Name: "));
        panelUserEntry.add(jtfFirstName);
        panelUserEntry.add(new JLabel("Last Name: "));
        panelUserEntry.add(jtfLastName);

        // Create a second JPanel object to hold two buttons.
        JPanel panelButtons = new JPanel();

        // Create and add two buttons to panelButtons.
        // We will associate the currently executing object (referenced by the keyword, this) as
        // the action listener for our buttons.
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);
        panelButtons.add(btnSubmit);
        btnExit = new JButton("Exit");
        btnExit.addActionListener(this);
        panelButtons.add(btnExit);

        // Create a third panel to act as a parent panel, to store panel1 and panel2.
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        JPanel panelParent = new JPanel(layout);
        panelParent.add(panelUserEntry);
        panelParent.add(panelButtons);

        // Add panelParent to the frame
        add(panelParent);
    }

    public static void main (String[] args){
        // Create an object from the class.
        UserDetails frame = new UserDetails();

        // Set the attributes of the frame.
        frame.setTitle("User Details");
        frame.setSize(300,160);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // The action performed method, which processes Action Events.
    // I use the getSource() method to return the name of the source object which generated the event.
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnSubmit){
            String firstName = jtfFirstName.getText();
            String lastName = jtfLastName.getText();
            JOptionPane.showMessageDialog(null,"Welcome: " + firstName + " " + lastName);
        }else if ((e.getSource() == btnExit)){
            JOptionPane.showMessageDialog(null,"Goodbye");
            System.exit(0);
        }
    }
}

