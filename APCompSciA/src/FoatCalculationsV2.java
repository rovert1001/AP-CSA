/**
 * FloatCalculationsV2.java
 *
 * Code Description: Initializes two doubles then calculates and prints their
 * sum, difference, and product.
 * 
 * @author Trevor Slabicki
 * @version 9-28-2018
 * @contact 1002089@palisadessd.org
 */

public class FoatCalculationsV2
{

  // Initializing two doubles
  public static double dDoubleOne = 2.343;
  public static double dDoubleTwo = 4.325;

  // Calculates sum, difference, and product of above doubles
  public static double dSum = dDoubleOne + dDoubleTwo;
  public static double dDifference = Math.abs(dDoubleOne - dDoubleTwo);
  public static double dProduct = dDoubleOne * dDoubleTwo;

  /**
   * main method - Prints out the calculated sum, difference, and product of the
   * two doubles
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Outputs the sum, difference, and product of the two doubles
    System.out.println("For the numbers " + dDoubleOne + " and " + dDoubleTwo);
    System.out.println("Their sum would be " + dSum + ".");
    System.out.println("Their difference would be " + dDifference + ".");
    System.out.println("Their product would be " + dProduct + ".");

  }

}
