/**
 * FractonV1.java
 *
 * Code Description: Makes a fraction with a numerator and denominator and
 * converts that fraction to a decimal value and outputs the result.
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

public class FractionV1
{

  // Defining constants for numerator and denominator of fraction
  public static final int iNumerator = 3;
  public static final int iDenominator = 4;

  // Calculates the decimal equivalent of the above fraction
  public static double dDecimalFraction = (double) iNumerator
      / (double) iDenominator;

  
  /**
   * main method - Outputs the fraction and its decimal equivalent
   * 
   * @param args
   */
  
  public static void main(String[] args)
  {

    // Outputs the fraction and its decimal equivalent
    System.out.println("For a fraction of " + iNumerator + "/" + iDenominator
        + ", its decimal equivalent would be " + dDecimalFraction + ".");

  }

}
