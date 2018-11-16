package chapterThree;

/**
 * IntWrapper.java
 *
 *
 * Code Description: Does 3 tasks related to using wrapper classes with integers.
 * 
 * @author Trevor Slabicki
 * @version 11-1-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class IntWrapper
{

  // Initializing int for user to define
  private static int iUserInt;

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  // Making ints for max and min int values
  public static int iMax, iMin;

  // Strings to store user input
  private static String sDecimalStringOne, sDecimalStringTwo;

  // ints to hold user values taken from above Strings
  private static int iDecimalIntOne, iDecimalIntTwo, iDecimalIntSum;

  /**
   * main method - Does three tasks
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    taskOne();
    taskTwo();
    taskThree();

  }

  /**
   * taskOne - Takes a user value and converts it into three different bases.
   * 
   * @param args
   */

  private static void taskOne()
  {

    // Outputting what task this is
    System.out.println("");
    System.out.println("Task One");

    // Asks user for an int and stores the answer
    System.out.println("");
    System.out.println("What is your int?");
    iUserInt = kb.nextInt();

    // Prints binary, octal, and hexadecimal of iUserInt
    System.out.println("");
    System.out.println("     The binary for your int would be: "
        + Integer.toBinaryString(iUserInt));
    System.out.println("      The octal for your int would be: "
        + Integer.toOctalString(iUserInt));
    System.out.println("The hexadecimal for your int would be: "
        + Integer.toHexString(iUserInt));

  }

  /**
   * taskTwo - Assigns maximum and minimum integer values to two ints and
   * outputs their values.
   * 
   * @param args
   */

  private static void taskTwo()
  {

    // Outputting what task this is
    System.out.println("");
    System.out.println("Task Two");

    // Assigning max and min values of integers
    iMax = Integer.MAX_VALUE;
    iMin = Integer.MIN_VALUE;

    // Prints out max and min int values of java
    System.out.println("");
    System.out.println("Minimum int value: " + iMin);
    System.out.println("Maximum int value: " + iMax);

  }

  /**
   * taskThree - Gets two String values from user using the next() method.
   * Converts those Strings to ints and outputs their sum.
   * 
   * @param args
   */
  private static void taskThree()
  {

    // Outputting what task this is
    System.out.println("");
    System.out.println("Task Three");

    // Prompts user to provide two integers and stores values as Strings using
    // next() method
    System.out.println("");
    System.out.println("What is the first decimal integer?");
    sDecimalStringOne = kb.next();
    System.out.println("What is the second decimal integer?");
    sDecimalStringTwo = kb.next();

    // Converts stored Strings into ints
    iDecimalIntOne = Integer.parseInt(sDecimalStringOne);
    iDecimalIntTwo = Integer.parseInt(sDecimalStringTwo);

    // Finds and outputs sum of above decimal ints
    iDecimalIntSum = iDecimalIntOne + iDecimalIntTwo;
    System.out.println("");
    System.out.println("The sum of these integers is: " + iDecimalIntSum);

  }

}
