
/**
 * Distance.java
 *
 *
 * Code Description: Computes the distance between two points
 *    
 * @author Trevor Slabicki
 * @version 10-22-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class DistanceV2
{

  /**
   * main method - Computes the distance between two points
   * 
   * @param args
   */

  public static void main(String[] args)
  {
    // Initializing variables for distance
    double dXOne, dYOne, dXTwo, dYTwo;
    double dDistance;

    // Initializing Scanner
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter the coordinates of the first point "
        + "(put a space between them): ");
    dXOne = kb.nextDouble();
    dYOne = kb.nextDouble();

    System.out.print("Enter the coordinates of the second point: ");
    dXTwo = kb.nextDouble();
    dYTwo = kb.nextDouble();

    // Computes the distance
    dDistance = Math
        .sqrt(Math.pow(dXOne - dXTwo, 2) + Math.pow(dYOne - dYTwo, 2));

    // Prints out the answer
    System.out.println("");
    System.out
        .println("The distance between these points would be: " + dDistance);

    kb.close(); // closing the Scanner object

  }
}