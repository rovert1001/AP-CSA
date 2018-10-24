package chapterTwoV2;



/**
 * SquareCalculationsV2.java
 *
 * Code Description: Gets a length for the side of a square from the user 
 * and calculates its perimeter and area
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class SquareCalculationsV2
{

  // Initializes Scanner to get length for a side of the square
  private static Scanner kb = new Scanner(System.in);

  // Making ints for side of square and square perimeter and area
  public static int iSquareSide, iSquarePerimeter, iSquareArea;

  /**
   * main method - Gets a length for the side of a square from the user and
   * calculates its perimeter and area
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prompts the user for the length of a square's side and stows the value
    System.out.println("What is the length of a square's side?");
    iSquareSide = kb.nextInt();

    // Calculates perimeter and area of square
    iSquarePerimeter = iSquareSide * 4;
    iSquareArea = iSquareSide * iSquareSide;

    // Outputs area and perimeter of square with side length iSquareSide
    System.out
        .println("For a square with a side length of " + iSquareSide + ":");
    System.out
        .println("the square would have a perimeter of " + iSquarePerimeter);
    System.out.println("and an area of " + iSquareArea + ".");

    kb.close(); // closing the Scanner object

  }

}
