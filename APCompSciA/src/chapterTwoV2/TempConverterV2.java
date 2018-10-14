package chapterTwoV2;


/**
 * FloatCalculationsV2.java
 *
 * Code Description: Asks the user for a celsius value and
 * then converts it into fahrenheit before outputting the
 * values to the console.
 * 
 * @author Trevor Slabicki
 * @version 10-12-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class TempConverterV2
{

  // Defining constants
  private static final int iBASE = 32;
  private static final double dCONVERSION_FACTOR = 9.0 / 5.0;

  // Intializing scanner to give value for celsius
  private static Scanner kb = new Scanner(System.in);

  // Initializing celsius to be given by user
  private static int iCelsiusTemp;

  // Initializing fahrenheit, to be calculated
  private static double dFahrenheitTemp;

  /**
   * main method - Asks the user for a celsius value and then converts it into
   * fahrenheit before outputting the values to the console.
   * 
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prompts user for celsius value and stows response
    System.out.println("What is the celsius value?");
    iCelsiusTemp = kb.nextInt();

    // Converts celsius to fahrenheit
    dFahrenheitTemp = iCelsiusTemp * dCONVERSION_FACTOR + iBASE;

    // Ouputs results of conversion
    System.out.println("Celsius Temperature: " + iCelsiusTemp);
    System.out.println("Fahrenheit Equivalent: " + dFahrenheitTemp);

    kb.close(); // closing the Scanner object

  }

}
