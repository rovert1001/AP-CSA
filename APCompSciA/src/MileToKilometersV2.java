


/**
 * MileToKilometersV2.java
 *
 * Code Description: Declares constant to convert miles to kilometers and
 * prompts the user to give number of miles. Then converts the value of miles into
 * kilometers through the use of the conversion constant.
 * 
 * @author Trevor Slabicki
 * @version 10-12-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class MileToKilometersV2
{

  // Initializing constant for mile to Kilometer conversion
  private static final double dMILES_TO_KILOMETERS = 1.60935;

  // Initializing Scanner to read user value for miles
  private static Scanner kb = new Scanner(System.in);

  // Making variable for miles; value to be given by user
  private static double dMiles;

  // Finds value of dMILES in kilometers using dMILES_TO_KILOMETERS
  private static double dKilometers;

  /**
   * main method - Gets value for miles from user and converts it to kilometers
   * before outputting result to console.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    System.out.println("What is the distnace in miles?");
    dMiles = kb.nextDouble();

    dKilometers = dMiles * dMILES_TO_KILOMETERS;

    System.out.println("A distance of " + dMiles + " miles would be "
        + dKilometers + " kilometers.");

    // closing Scanner kb
    kb.close();

  }

}
