/*
* This program pushes a user inputed integer to a stack
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-07
*/

import java.util.Scanner;  // Import the Scanner class

public class StackForm {
  /**
   * This function allows the user to add an inputed number to a stack.
   */
  public static void main(String[] args) {
    try {
      // User input for integer to be added to stack
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter an Integer for the Stack: ");
      int numberChosen = userInput.nextInt();
      System.out.println();

      // Declaring stack by using the JacobStack class
      JacobStack stack = new JacobStack();

      // Placing the inputed integer on the stack
      stack.push(numberChosen);

      // Verifying the integer you just placed in the stack
      System.out.println("Pushed to ArrayList: " + stack.getPushedNumber());

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    } 
  }
}
