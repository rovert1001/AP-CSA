


/**
 * FractonV2.java
 *
 * Code Description: Has the user define a numerator and denominator for
 * a fraction and then calculates the fraction as a decimal value.
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class FractionV2
{
  
  // Making Scanner to get values for numerator and denominator
  private static Scanner kb = new Scanner(System.in);

  // Making variables for the numerator and denominator of a fraction
  public static int iNumerator, iDenominator;

  // Initializing double for decimal value of the above fraction
  private static double dDecimalFraction;

  /**
   * main method - Has the user define a numerator and denominator for a
   * fraction and then calculates the fraction as a decimal value.
   * 
   * @param args
   */

  public static void main(String[] args)
  {
    
    // Asks the user for a numerator and stows the value
    System.out.println("What is the numerator of the fraction?");
    iNumerator = kb.nextInt();
    
    // Asks the user for a denominator and stows the value
    System.out.println("What is the denominator of the fraction?");
    iDenominator = kb.nextInt();
    
    // Calculates decimal value of the fraction
    dDecimalFraction = (double) iNumerator / (double) iDenominator;

    // Outputs the fraction and its decimal equivalent
    System.out.println("For a fraction of " + iNumerator + "/" + iDenominator
        + ", its decimal equivalent would be " + dDecimalFraction + ".");
    
    kb.close(); // closing the Scanner object

  }

}
