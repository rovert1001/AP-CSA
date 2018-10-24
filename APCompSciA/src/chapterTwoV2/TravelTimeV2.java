package chapterTwoV2;



/**
 * TravelTimeV2.java
 *
 * Code Description: THe user defines speed and distance traveled for a trip
 * and then the program calculates the time the trip would take. Outputs 
 * the result.
 * 
 * @author Trevor Slabicki
 * @version 10-13-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class TravelTimeV2
{
  
  // Making Scanner to read values for speed and distance traveled
  private static Scanner kb = new Scanner(System.in);

  // Initializes doubles for speed, distance traveled, and time required
  private static double dSpeed, dDistanceTraveled, dTimeRequired;

  /**
   * main method - THe user defines speed and distance traveled for a trip and
   * then the program calculates the time the trip would take. Outputs the
   * result.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prompts user for speed and stows value
    System.out.println("What was the speed (mph) for the trip?");
    dSpeed = kb.nextDouble();

    // Prompts user for distance traveled and stows value
    System.out.println("What was the distance (miles) traveled for the trip?");
    dDistanceTraveled = kb.nextDouble();

    // Calculates time required based on user input
    dTimeRequired = dDistanceTraveled / dSpeed;

    // Outputs the time required for trip based on speed and distance traveled
    System.out.println(
        "For a trip with a speed of " + dSpeed + " mph and a total distance of "
            + dDistanceTraveled + " miles, the total time required would be "
            + dTimeRequired + " hours.");

    kb.close(); // closing the Scanner object

  }

}
