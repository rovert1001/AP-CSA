/**
 * Paint.java
 *
 * Code Description: Determine how much paint is needed to paint the walls of a
 * room given its length, width, height, and how many doors and windows are in
 * the room.
 * 
 * @author Trevor Slabicki
 * @version 9-24-2018
 * @contact 1002089@palisadessd.org
 */

public class Paint
{
  /**
   * main method - Determine how much paint is needed to paint the walls of a
   * room given its length, width, height, and how many doors and windows are in
   * the room.
   *
   * @param args
   */

  // declaring constants
  private static final int iCOVERAGE_PER_GALLON = 350;
  private static final int iDOOR_SIZE = 20;
  private static final int iWINDOW_SIZE = 15;

  // declares integers for dimensions and obstacles of room
  public static int iLength, iWidth, iHeight, iWindows, iDoors;

  // declares doubles for Total Square Feet and Gallons Needed
  public static double dSquareFeet, dGallonsNeeded;

  public static void main(String[] args)
  {

    iLength = 0;
    iWidth = 0;
    iHeight = 0;
    iWindows = 0;
    iDoors = 0;

    dSquareFeet = 2 * iHeight * (iLength + iWidth)
        - iDoors * iDOOR_SIZE - iWindows * iWINDOW_SIZE;

    dGallonsNeeded = dSquareFeet / iCOVERAGE_PER_GALLON;

    System.out
        .println("For a room with a length of " + iLength + " ft, width of "
            + iWidth + " ft, and a height of " + iHeight + " ft, it would take "
            + dGallonsNeeded + " gallons to paint the room.");
  }
}