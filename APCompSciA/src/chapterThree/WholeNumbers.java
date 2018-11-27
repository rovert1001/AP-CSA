package chapterThree;

/**
 * WholeNumbers.java
 *
 * Code Description: Rounds a user picked floating point value up and down;
 * outputs result
 * 
 * @author Trevor Slabicki
 * @version 11-8-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class WholeNumbers
{

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  // Holds floating point value
  private static double dNum;

  // Holds floating point rounded down
  private static int iDown;

  // Holds floating point rounded up
  private static int iUp;

  /**
   * main method - Rounds a user picked floating point value up and down;
   * outputs result
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Asks for floating point value and stows response
    System.out.println("What is the floating point value?");
    dNum = kb.nextDouble();

    // Rounds dNum down
    iDown = (int) Math.floor(dNum);

    // Rounds dNum up
    iUp = (int) Math.ceil(dNum);

    // Outputs dNum rounded up and down
    System.out.println("The number rounded down: " + iDown);
    System.out.println("The number rounded up:   " + iUp);

    kb.close(); // closing the Scanner object

  }

}
