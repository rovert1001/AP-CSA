package chapterTwoV2;


/**
 * FloatCalculationsV2.java
 *
 * Code Description: Prompts the user to provide two doubles through use of 
 * the scanner class and then calculates and prints out the sum, difference, 
 * and product of the two doubles
 * 
 * @author Trevor Slabicki
 * @version 10-6-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class FoatCalculationsV2
{

  // Scanner to read user input for values of two doubles
  private static Scanner kb = new Scanner(System.in);

  // Two doubles to be determined by user
  private static double dDoubleOne, dDoubleTwo;

  // Doubles to hold values of operations between two doubles
  private static double dSum, dDifference, dProduct;

  /**
   * main method - Prompts the user to provide two doubles and then calculates
   * and prints out the sum, difference, and product of the two doubles
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prompting for and storing the given values of two doubles
    System.out.println("What is the value of the first double?");
    dDoubleOne = kb.nextDouble();

    System.out.println("What is the value of the second double?");
    dDoubleTwo = kb.nextDouble();

    // Calculates sum, difference, and product of above doubles
    dSum = dDoubleOne + dDoubleTwo;
    dDifference = Math.abs(dDoubleOne - dDoubleTwo);
    dProduct = dDoubleOne * dDoubleTwo;

    // Outputs the sum, difference, and product of the two doubles
    System.out.println("For the numbers " + dDoubleOne + " and " + dDoubleTwo);
    System.out.println("Their sum would be " + dSum + ".");
    System.out.println("Their difference would be " + dDifference + ".");
    System.out.println("Their product would be " + dProduct + ".");

    kb.close(); // closing the Scanner object

  }

}
