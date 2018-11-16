package GUI;

import javax.swing.*;

/**
 * Created by Johnny on 16/11/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class InputDialogBox {
    public static void main(String[] args) {

        // Input:
        String name = JOptionPane.showInputDialog(null,"Enter Name: ",
                "Java GUI Developer", JOptionPane.INFORMATION_MESSAGE);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Age: ",
                "Java GUI Developer", JOptionPane.INFORMATION_MESSAGE));

        // Output:
        JOptionPane.showMessageDialog(null, "Name: " + name +"\n" + "Age: " + age,
                "Java GUI Developer", JOptionPane.INFORMATION_MESSAGE);

    }
}
