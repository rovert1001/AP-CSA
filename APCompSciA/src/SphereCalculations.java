
/**
 * SphereCalculations.java
 *
 * Code Description: Outputs volume and surface area to four decimal places
 * of sphere given its radius
 * 
 * @author Trevor Slabicki
 * @version 11-8-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.text.DecimalFormat; //import DecimalFormat class

public class SphereCalculations
{

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  // Holds radius of a sphere
  private static double dRadius;

  // Holds volume of a sphere
  private static double dVolume;

  // Holds surface area of a sphere
  private static double dArea;

  // DecimalFormat to round volume and surface area to 4 decimal places
  private static DecimalFormat fmtRound = new DecimalFormat("0.0000");

  /**
   * main method - Outputs volume and surface area of sphere to four decimal
   * places given its radius from the user
   * 
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Asks user for value of radius and stows the response
    System.out.println("What is the radius of the sphere?");
    dRadius = kb.nextDouble();

    // Calculates surface area of the sphere
    dArea = 4.0 * Math.PI * Math.pow(dRadius, 2.0);

    // Calculates volume of the sphere
    dVolume = 1.0 / 3.0 * dArea * dRadius;

    // Outputs results
    System.out.println(
        "The surface area of the sphere is: " + fmtRound.format(dArea));
    System.out.println(
        "The volume of the sphere is: " + fmtRound.format(dVolume));

    kb.close(); // closing the Scanner object

  }

}
