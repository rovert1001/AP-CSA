/**
 * TravelTimeV2.java
 *
 * Code Description: Defines speed and distance traveled for a trip and then
 * calculates the time the trip would take. Outputs the result.
 * 
 * @author Trevor Slabicki
 * @version 9-28-2018
 * @contact 1002089@palisadessd.org
 */

public class TravelTimeV2
{

  // Initializes constant for speed of a trip in miles per hour
  public static final double dSPEED = 5;

  // Initializes constant for distance traveled in a trip in miles per hour
  public static final double dDISTANCE_TRAVELED = 10;

  /*
   * Initializes and calculates time required for a trip based on speed and
   * distance traveled
   */
  public static double dTimeRequired = dDISTANCE_TRAVELED / dSPEED;

  /**
   * main method - Outputs the time required for the trip
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Outputs the time required for trip based on speed and distance traveled
    System.out.println(
        "For a trip with a speed of " + dSPEED + " mph and a total distance of "
            + dDISTANCE_TRAVELED + " miles, the total time required would be "
            + dTimeRequired + " hours.");

  }

}
