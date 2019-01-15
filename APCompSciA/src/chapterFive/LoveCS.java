package chapterFive;

/**
 * LoveCS.java
 *
 * Code Description: Outputs a statement a user defined amount of times and
 * outputs some info about the amount of outputs of the statement
 * 
 * @author Trevor Slabicki
 * @version 1-9-2019
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

    // Sum of iCount values
    int iSum = 0;

    // Repeats the code
    while (true)
    {

      // Asks user to set number of repeats, and stows value
      System.out.println("How many times do you want the statement to repeat?");
      iRepeats = kb.nextInt();

      // Outputs a statement for iRepeats times
      for (int iI = 1; iI <= iRepeats; iI++)
      {
        // Outputs statement
        System.out.println(iI + " I love Computer Science!!");

        // Adds this iCount iteration to the sum
        iSum += iI;

      }

      // Outputs information about number of repeats
      System.out.println("Printed this message " + iRepeats + " times.");
      System.out.print(
          "The sum of the numbers from 1 to " + iRepeats + " is " + iSum);

      // Necessary workaround for Scanner object going between certain methods
      kb.nextLine();

      // Asks user if they want to start again, loops if yes, breaks if no
      System.out.println("");
      System.out.println("Do you want to restart? [y/n]");
      if (kb.nextLine().equalsIgnoreCase("n"))
        break;

    }

    kb.close(); // Closing the Scanner object

  }
}