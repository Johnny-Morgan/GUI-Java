package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Johnny on 19/12/2018
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class Calculator extends JFrame implements ActionListener {

    // Instance Variables
    private JButton jbtOne;
    private JButton jbtTwo;
    private JButton jbtThree;
    private JButton jbtFour;
    private JButton jbtFive;
    private JButton jbtSix;
    private JButton jbtSeven;
    private JButton jbtEight;
    private JButton jbtNine;
    private JButton jbtClear;
    private JButton jbtZero;
    private JButton divide;
    private JButton multiply;
    private JButton subtract;
    private JButton add;
    private JButton equals;
    private JTextField jtfAnswer;

    // Processing Logic
    private String num1;
    private String num2;
    private String operatorSelected;
    private boolean operatorSet;
    private String calcString = "";

    public Calculator() {

        // Set the attributes of the frame
        this.setTitle("Calculator"); // set title
        this.setSize(240, 220); // width and height
        this.setLocationRelativeTo(null); // centre the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel1 to hold the text field
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT)); // flow layout manager by default

        // Create a JTextField to display the answer
        jtfAnswer = new JTextField(14);

        // Add the JTextfield to the JPanel
        panel1.add(jtfAnswer);

        // Create panel2 to hold buttons 1-9
        JPanel panel2 = new JPanel();

        // Set a Grid Layout for the panel
        // 3 rows, 3 columns, v/s, h/s of 3 pixels.
        GridLayout gl = new GridLayout(3, 3, 5, 5);

        // Set the layout of the panel
        panel2.setLayout(gl);

        // Create buttons 1-9
        jbtOne = new JButton("1");
        jbtTwo = new JButton("2");
        jbtThree = new JButton("3");
        jbtFour = new JButton("4");
        jbtFive = new JButton("5");
        jbtSix = new JButton("6");
        jbtSeven = new JButton("7");
        jbtEight = new JButton("8");
        jbtNine = new JButton("9");

        // Add event handlers for buttons
        jbtOne.addActionListener(this);
        jbtTwo.addActionListener(this);
        jbtThree.addActionListener(this);
        jbtFour.addActionListener(this);
        jbtFive.addActionListener(this);
        jbtSix.addActionListener(this);
        jbtSeven.addActionListener(this);
        jbtEight.addActionListener(this);
        jbtNine.addActionListener(this);

        // Add buttons to panel2
        panel2.add(jbtOne);
        panel2.add(jbtTwo);
        panel2.add(jbtThree);
        panel2.add(jbtFour);
        panel2.add(jbtFive);
        panel2.add(jbtSix);
        panel2.add(jbtSeven);
        panel2.add(jbtEight);
        panel2.add(jbtNine);

        // Create panel3 to store the Clear and 0 buttons
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT)); // flow layout manager

        // Create the buttons for panel3
        jbtClear = new JButton("Clear");
        jbtZero = new JButton("  0  ");

        // Add the event handlers for the buttons
        jbtClear.addActionListener(this);
        jbtZero.addActionListener(this);

        // Add the buttons to the panel
        panel3.add(jbtClear);
        panel3.add(jbtZero);

        // Create panel4 to store panels 1-3.
        // Set a BorderLayout for panel4
        JPanel panel4 = new JPanel(new BorderLayout(5, 5));
        panel4.add(panel1, BorderLayout.NORTH);
        panel4.add(panel2, BorderLayout.CENTER);
        panel4.add(panel3, BorderLayout.SOUTH);

        // Create panel5 to store the operation functionality buttons
        JPanel panel5 = new JPanel(new GridLayout(5, 1, 5, 5));

        // Create JButton objects
        divide = new JButton("/");
        multiply = new JButton("*");
        subtract = new JButton("-");
        add = new JButton("+");
        equals = new JButton("=");

        // Add event listeners to buttons
        divide.addActionListener(this);
        multiply.addActionListener(this);
        subtract.addActionListener(this);
        add.addActionListener(this);
        equals.addActionListener(this);

        // Add buttons to panel
        panel5.add(divide);
        panel5.add(multiply);
        panel5.add(subtract);
        panel5.add(add);
        panel5.add(equals);

        // Create a final panel to hold panel 4 and panel 5
        JPanel panel6 = new JPanel();

        // Add panel4 and panel5 to panel6
        panel6.add(panel4);
        panel6.add(panel5);

        // Add panel6 to the frame
        this.add(panel6, BorderLayout.WEST);

        // Display the frame
        this.setVisible(true);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtOne) {
            // test operator status
            if (!operatorSet) {
                setNumOne("1");
            } else {
                setNumTwo("1");
            }

        } else if (e.getSource() == jbtTwo) {

            // test operator status
            if (!operatorSet) {
                setNumOne("2");
            } else {
                setNumTwo("2");
            }

        } else if (e.getSource() == jbtThree) {

            // test operator status
            if (!operatorSet) {
                setNumOne("3");
            } else {
                setNumTwo("3");
            }

        } else if (e.getSource() == jbtFour) {

            // test operator status
            if (!operatorSet) {
                setNumOne("4");
            } else {
                setNumTwo("4");
            }

        } else if (e.getSource() == jbtFive) {
            // test operator status
            if (!operatorSet) {
                setNumOne("5");
            } else {
                setNumTwo("5");
            }

        } else if (e.getSource() == jbtSix) {
            // test operator status
            if (!operatorSet) {
                setNumOne("6");
            } else {
                setNumTwo("6");
            }

        } else if (e.getSource() == jbtSeven) {
            // test operator status
            if (!operatorSet) {
                setNumOne("7");
            } else {
                setNumTwo("7");
            }

        } else if (e.getSource() == jbtEight) {
            // test operator status
            if (!operatorSet) {
                setNumOne("8");
            } else {
                setNumTwo("8");
            }

        } else if (e.getSource() == jbtNine) {
            // test operator status
            if (!operatorSet) {
                setNumOne("9");
            } else {
                setNumTwo("9");
            }
        } else if (e.getSource() == jbtZero) {
            // test operator status
            if (!operatorSet) {
                setNumOne("0");
            } else {
                setNumTwo("0");
            }

        } else if (e.getSource() == equals) {
            calcString += "=";
            jtfAnswer.setText(calcString);
            calculate();

        } else if (e.getSource() == divide) {
            determineCalcRequired();
            operatorSet = true;
            operatorSelected = "Div";
            calcString += "/";
            jtfAnswer.setText(calcString);

        } else if (e.getSource() == multiply) {
            determineCalcRequired();
            operatorSet = true;
            operatorSelected = "Mul";
            calcString += "*";
            jtfAnswer.setText(calcString);

        } else if (e.getSource() == add) {
            determineCalcRequired();
            operatorSet = true;
            operatorSelected = "Add";
            calcString += "+";
            jtfAnswer.setText(calcString);

        } else if (e.getSource() == subtract) {
            determineCalcRequired();
            operatorSet = true;
            operatorSelected = "Sub";
            calcString += "-";
            jtfAnswer.setText(calcString);

        } else if (e.getSource() == jbtClear) {
            jtfAnswer.setText("");
            num1 = "";
            num2 = "";
            operatorSelected = "";
            operatorSet = false;

            calcString = ""; // re-set the String.
        }

    }

    private void setNumOne(String numPassed) {
        if (num1 == null) {
            num1 = numPassed;
            calcString += numPassed;
            jtfAnswer.setText(calcString);
        } else {
            num1 += numPassed;
            calcString += numPassed;
            jtfAnswer.setText(calcString);
        }
    }

    private void setNumTwo(String numPassed) {
        if (num2 == null) {
            num2 = numPassed;
            calcString += numPassed;
            jtfAnswer.setText(calcString);
        } else {
            num2 += numPassed;
            calcString += numPassed;
            jtfAnswer.setText(calcString);
        }
    }

    private void determineCalcRequired() {
        float result;

        if ((num1 != null) && (num2 != null)) {

            switch (operatorSelected) {
                case "Add":
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    num1 = String.valueOf(result);
                    num2 = null;
                    break;
                case "Sub":
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    num1 = String.valueOf(result);
                    num2 = null;
                    break;
                case "Mul":
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    num1 = String.valueOf(result);
                    num2 = null;
                    break;
                case "Div":
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    num1 = String.valueOf(result);
                    num2 = null;
            }
        }
    }

    private void calculate() {

        float result;

        switch (operatorSelected) {
            case "Add":
                result = Float.parseFloat(num1) + Float.parseFloat(num2);
                num1 = String.valueOf(result);
                num2 = null;
                jtfAnswer.setText(String.valueOf(result));
                calcString = String.valueOf(result);
                break;
            case "Sub":
                result = Float.parseFloat(num1) - Float.parseFloat(num2);
                num1 = String.valueOf(result);
                num2 = null;
                jtfAnswer.setText(String.valueOf(result));
                calcString = String.valueOf(result);
                break;
            case "Mul":
                result = Float.parseFloat(num1) * Float.parseFloat(num2);
                num1 = String.valueOf(result);
                num2 = null;
                jtfAnswer.setText(String.valueOf(result));
                calcString = String.valueOf(result);
                break;
            case "Div":
                result = Float.parseFloat(num1) / Float.parseFloat(num2);
                num1 = String.valueOf(result);
                num2 = null;
                jtfAnswer.setText(String.valueOf(result));
                calcString = String.valueOf(result);
        }
    }
}
