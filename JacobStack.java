/*
* This class creates an integer stack
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-07
*/

import java.util.ArrayList;  // Import the ArrayList class

public class JacobStack {
  // Initializing the array list field
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  // Method that adds user input to stack
  public void push(Integer inputNumber) {
    stackAsArray.add(inputNumber);
  }

  // Getter that tells the user the most recent input
  public Integer getPushedNumber() {
    return this.stackAsArray.get(stackAsArray.size() - 1);
  }
}
