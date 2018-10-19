


/**
 * AverageThreeV2.java
 *
 * Code Description: Asks the user to provide three ints through
 * the use of the Scanner object. Then calculates average of the 
 * three ints as a double and outputs the result.
 * 
 * @author Trevor Slabicki
 * @version 10-6-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // importing Scanner class

public class AverageThreeV2
{

  /*
   * Initializing three integers to be determined by Scanner input and a double
   * that will contain their average
   */
  private static int iIntOne, iIntTwo, iIntThree;
  private static double dAverage;

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  /**
   * main method - Takes user input through the Scanner kb to give values to the
   * three ints. Then calculates their average as a double and outputs the
   * result.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Asks for second int and stows user input to iIntOne
    System.out.println("What do you want you first int to be?");
    iIntOne = kb.nextInt();

    // Asks for second int and stows user input to iIntTwo
    System.out.println("What do you want you second int to be?");
    iIntTwo = kb.nextInt();

    // Asks for third int and stows user input to iIntThree
    System.out.println("What do you want you third int to be?");
    iIntThree = kb.nextInt();

    /*
     * Calculating average of three ints and casts ints to doubles for more
     * accurate results
     */
    dAverage = ((double) iIntOne + (double) iIntTwo + (double) iIntThree) / 3;

    // Prints out the average of above three integers using the double dAverage
    System.out.println("The average of your three ints is: " + dAverage);

    kb.close(); // closing the Scanner object

  }

}
