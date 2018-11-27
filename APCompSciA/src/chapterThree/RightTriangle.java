package chapterThree;

/**
 * RightTriangle.java
 *
 * Code Description: Calculates hypotenuse of a triangle given two legs by 
 * user
 * 
 * @author Trevor Slabicki
 * @version 11-8-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class RightTriangle
{

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  // Holds legs of a triangle
  private static double iLegOne, iLegTwo, iHypot;

  /**
   * main method - Calculates hypotenuse of a triangle given two legs by user
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Asks for first leg of triangle and stows response
    System.out.println("What is the triangle's first leg?");
    iLegOne = kb.nextDouble();

    // Asks for first leg of triangle and stows response
    System.out.println("What is the triangle's second leg?");
    iLegTwo = kb.nextDouble();

    // Calculates hypotenuse of triangle
    iHypot = Math.hypot(iLegOne, iLegTwo);

    // Outputs hypotenuse
    System.out.println("The hypotenuse is: " + iHypot);
    
    kb.close(); // closing the Scanner object

  }

}
