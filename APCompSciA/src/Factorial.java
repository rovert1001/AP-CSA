
/**
 * Factorial.java
 *
 * Code Description: Takes a number, given by the user, and finds its factorial
 * 
 * @author Trevor Slabicki
 * @version 1-6-2018
 * @contact 1002089@palisadessd.net
 */

import java.math.BigInteger; // Importing BigInteger class
import java.util.Scanner; // Importing Scanner class

public class Factorial

{

  // Scanner for user input
  private static Scanner kb = new Scanner(System.in);

  // Number to be factorialized; is a BigiInteger so there is theoretically no
  // limit to the upper bounds for a number to be factorialized as opposed to 20
  // for an int.
  private static BigInteger input;

  // If iInput is in bounds
  private static boolean bInBounds = false;

  /**
   * main - Outputs a factorial for a user given number
   * 
   * @param args
   */
  public static void main(String[] args)
  {

    // Gets number for factorialization from user and makes sure the number is
    // not below 0, otherwise the user must pick a new number
    while (!bInBounds)
    {

      System.out.println("What number do you want to be factorialized?");

      // Although the Scanner will accept letters when using nextLine(),
      // BigInteger will only accept numbers, however those numbers must be in a
      // String
      input = new BigInteger(kb.nextLine());

      if (checkUnderBounds())
        bInBounds = true;
    }

    // Outputs factorial for user given number
    System.out.println("The factorial is: " + factorial(input));

  }

  /**
   * factorial - Gets the factorial of the given number through recursion
   * 
   * @param num
   *          int of number to be factorialized
   */
  public static BigInteger factorial(BigInteger num)
  {

    // Exits the recursion when num is <= 1
    if (num.compareTo(BigInteger.ONE) <= 0)
      return BigInteger.ONE;

    // Recursion to multiply n * n - 1 * n - 2 ... * 1
    return num.multiply(factorial(num.subtract(BigInteger.ONE)));

  }

  /**
   * checkUnderBounds - Returns whether input is under bounds for
   * factorialization or not
   * 
   * @param
   */
  public static boolean checkUnderBounds()
  {

    // Outputs info letting user know input is less than 0
    if (input.signum() < 0)
    {

      System.out.println("Number out of bounds");
      System.out.println("");
      System.out.println("Factorials can only be 0 and higher.");
      System.out.println("");

      return false;
    }
    return true;

  }
}
