
/**
 * SumOfCubes.java
 *
 * Code Description: Asks user for two ints and then cubes those ints and prints
 * out their sum
 * 
 * @author Trevor Slabicki
 * @version 11-8-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class SumOfCubes
{

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  // Holds values of two ints
  private static int iOne, iTwo;

  // Holds sum of two cubed ints
  private static double iCubeSum;

  /**
   * main method - Gets two ints from user and finds their sum after cubing each
   * int; outputs the result.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prompts user for two ints and stows answers
    System.out.println("What is the first int?");
    iOne = kb.nextInt();
    System.out.println("What is the second int?");
    iTwo = kb.nextInt();

    // Calculates sum of the two ints cubed
    iCubeSum = Math.pow(iOne, 3) + Math.pow(iTwo, 3);

    // Outputs the cubed sum
    System.out.println("The sum of the ints cubed is: " + iCubeSum);
    
    kb.close();  // closing the Scanner object

  }

}
