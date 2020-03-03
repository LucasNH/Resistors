/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 26, 2020
 * Date last edited: March 2, 2020
 * Program title: Resistors.java
 * This program initializes an array of resistor colours placed at
 * their corresponding index for resistance value. The user is
 * prompted to input three colours in the correct order to have
 * the program output the resistance value for the resistor.
 */
package resistors;

import javax.swing.JOptionPane;

public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating array for all resistor colours at correct index
        String[] colours = {"black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"};

        // Prompting user for input of resistor colours
        String input = JOptionPane.showInputDialog("What is your resistors colour"
                + "code?\nSeparate each colour by hyphens\nEx. Red-Orange-Black");

        // Splitting input into three separate colour Strings w/o case sensitivity
        String inputLower = input.toLowerCase();
        String[] inputColours = inputLower.split("-");
        if (inputColours.length == 3) { // Ensuring the correct amount of colours were inputed
            double outputs[] = new double[3];
            double output;
            for (int i = 0; i < inputColours.length; i++) {
                // For every colour with corresponding number
                for (int j = 0; j < colours.length; j++) {
                    // Adding corresponding colour values to outputs array in proper order
                    if (inputColours[i].equals(colours[j])) {
                        outputs[i] = (double) (j);
                    }
                }
            }
            // Creating value of resistance from outputs array
            output = (10 * outputs[0] + outputs[1]) * Math.pow(10, outputs[2]);
            System.out.println("You entered " + input);
            System.out.println("The value of the resistor is " + output + " ohms");
        } else { // Catching 
            System.out.println("Please input three colours (see example)");
        }
    }

}
