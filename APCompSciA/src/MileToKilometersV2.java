/**
 * MileToKilometersV2.java
 *
 * Code Description: Declares constant to convert miles to kilometers and
 * constant for number of miles. Then converts the value of miles into
 * kilometers through the use of the conversion constant.
 * 
 * @author Trevor Slabicki
 * @version 9-28-2018
 * @contact 1002089@palisadessd.org
 */

public class MileToKilometersV2
{

  // Initializing constant for mile to Kilometer conversion
  public static final double dMILES_TO_KILOMETERS = 1.60935;

  /*
   * Initializing constant for miles by picking a random number using the
   * ThreadLocalRandom class
   */
  public static final double dMILES = java.util.concurrent.ThreadLocalRandom
      .current().nextDouble();

  // Finds value of dMILES in kilometers using dMILES_TO_KILOMETERS
  public static double dKilometers = dMILES * dMILES_TO_KILOMETERS;

  /**
   * main method - Does nothing (no output was required)
   * 
   * @param args
   */

  public static void main(String[] args)
  {

  }

}
