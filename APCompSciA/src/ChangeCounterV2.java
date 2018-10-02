
/**
 * ChangeCounterV2.java
 *
 * Code Description: Asks the user how many coins are in a jar and stows the
   * answers. Then calculates the money in the jar based on the coins and
   * outputs the result.
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class ChangeCounterV2
{

  // Defining ints for coins in jar
  public static int iQuarters, iDimes, iNickels, iPennies;

  // Initializing double for value of coins in jar
  public static double dJarValue;

  // Initializing scanner to read values of coins in jar
  public static Scanner kb = new Scanner(System.in);

  /**
   * main method - Asks the user how many coins are in a jar and stows the
   * answers. Then calculates the money in the jar based on the coins and
   * outputs the result.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Asks how many quarters are in jar and stows user input in iQuarters
    System.out.println("How many quarters are in the jar?");
    iQuarters = kb.nextInt();

    // Asks how many dimes are in jar and stows user input in iDimes
    System.out.println("How many dimes are in the jar?");
    iDimes = kb.nextInt();

    // Asks how many nickels are in jar and stows user input in iNickels
    System.out.println("How many nickels are in the jar?");
    iNickels = kb.nextInt();

    // Asks how many pennies are in jar and stows user input in iPennies
    System.out.println("How many pennies are in the jar?");
    iPennies = kb.nextInt();

    /*
     * Calculates value of coins in jar and makes sure the value goes to only 2
     * decimal places
     */
    dJarValue = (double) Math.round(
        (iQuarters * 0.25 + iDimes * 0.1 + iNickels * 0.05 + iPennies * 0.01)
            * 100)
        / 100;

    // Outputs value of jar
    System.out.println("The jar would have a value of $" + dJarValue);

  }

}
