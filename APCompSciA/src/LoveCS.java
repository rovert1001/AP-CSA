
/**
 * LoveCS.java
 *
 * Code Description: Outputs a statement a user defined amount of times and
 * outputs some info about the amount of outputs of the statement
 * 
 * @author Trevor Slabicki
 * @version 12-17-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class LoveCS
{

  /**
   * main method - Outputs a statement a user defined amount of times and
   * outputs some info about the amount of outputs of the statement
   * 
   * @param args
   */
  
  public static void main(String[] args)
  {
    
    // Scanner for number of repeats
    Scanner kb = new Scanner(System.in);

    // Number of repeats
    int iRepeats;

    // Stores count the while loop is on
    int iCount = 1;

    // Sum of iCount values
    int iSum = 0;

    // Asks user to set number of repeats, and stows value
    System.out.println("How many times do you want the statement to repeat?");
    iRepeats = kb.nextInt();

    // Outputs a statement for iRepeats times
    while (iCount <= iRepeats)
    {
      // Outputs statement
      System.out.println(iCount + " I love Computer Science!!");

      // Adds this iCount iteration to the sum
      iSum += iCount;

      // Increments iCount
      iCount++;
    }

    // Outputs information about number of repeats
    System.out.println("Printed this message " + iRepeats + " times.");
    System.out
        .print("The sum of the numbers from 1 to " + iRepeats + " is " + iSum);
    
    kb.close(); // Closing the Scanner object

  }
}