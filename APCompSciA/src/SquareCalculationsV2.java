/**
 * SquareCalculationsV2.java
 *
 * Code Description: Makes a length for the side of a square and calculates its
 * perimeter and area
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

// Importing package to generate a random number
import java.util.concurrent.*;

public class SquareCalculationsV2
{

  /*
   * Makes a random length for the side of a square using the random number
   * generator included in the ThreadLocalRandom class. Random number uses the
   * bounds of 1 (inclusive) and 1000 (exclusive), so it will produce a positive
   * int between and including 1 and 999.
   */
  public static int iSquareSide = ThreadLocalRandom.current().nextInt(1, 1000);

  // Calculating perimeter of square using iSquareSide
  public static int iSquarePerimeter = iSquareSide * 4;

  // Calculating the area of square using iSquareSide
  public static int iSquareArea = iSquareSide * iSquareSide;

  /**
   * main method - Outputs perimeter and area of the square of side length
   * iSquareSide
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Outputs area and perimeter of square with side length iSquareSide
    System.out
        .println("For a square with a side length of " + iSquareSide + ":");
    System.out
        .println("the square would have a perimeter of " + iSquarePerimeter);
    System.out.println("and an area of " + iSquareArea + ".");

  }

}
