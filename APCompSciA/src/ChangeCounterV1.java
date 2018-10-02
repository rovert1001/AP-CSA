/**
 * ChangeCounterV1.java
 *
 * Code Description: Calculates and outputs monetary value of coins in a jar
 * after outlining the coins in the jar.
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

public class ChangeCounterV1
{

  // Defining constants for coins in jar
  public static final int iQUARTERS = 1;
  public static final int iDIMES = 2;
  public static final int iNICKELS = 3;
  public static final int iPENNIES = 5;

  /**
   * main method - Calculates and outputs monetary value of jar using the given
   * coins
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    /*
     * Calculates value of coins in jar and makes sure the value goes to only 2
     * decimal places
     */
    double dJarValue = iQUARTERS * 0.25 + iDIMES * 0.1 + iNICKELS * 0.05
        + iPENNIES * 0.01;
    dJarValue = (double) Math.round(dJarValue * 100) / 100;

    // Outputs value of jar and coins in jar
    System.out.println("For a jar containing " + iQUARTERS + " quarters, "
        + iDIMES + " dimes, " + iNICKELS + " nickels, and " + iPENNIES
        + " pennies, the jar would have a total value of $ " + dJarValue + ".");

  }

}
