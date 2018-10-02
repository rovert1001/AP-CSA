package chapterOne;

/**
 * Paint.java
 *
 * Code Description: Determine how much paint is needed to paint the walls of a
 * room while outlining and using its length, width, height, and how many doors
 * and windows are in the room and outputs the result.
 * 
 * @author Trevor Slabicki
 * @version 9-25-2018
 * @contact 1002089@palisadessd.org
 */

public class Paint
{
  // declaring constants
  public static final int iCOVERAGE_PER_GALLON = 350;
  public static final int iDOOR_SIZE = 20;
  public static final int iWINDOW_SIZE = 15;

  // declares integers for dimensions of room in feet
  public static int iLength, iWidth, iHeight;

  // declares integers for number of doors and windows in the room
  public static int iWindows, iDoors;

  // declares doubles for Total Square Feet and Gallons needed
  public static double dSquareFeet, dGallonsNeeded;

  /**
   * main method - Determine how much paint is needed to paint the walls of a
   * room while outlining and using its length, width, height, and how many
   * doors and windows are in the room and outputs the result.
   *
   * @param args
   */

  public static void main(String[] args)
  {

    // Giving values to dimensions of room and number of windows and doors
    iLength = 5;
    iWidth = 4;
    iHeight = 3;
    iWindows = 2;
    iDoors = 1;

    /*
     * Calculates square footage of walls in the room using the rooom's length,
     * width, and height and subtracting the area taken up by doors and windows.
     */
    dSquareFeet = 2 * iHeight * (iLength + iWidth) - iDoors * iDOOR_SIZE
        - iWindows * iWINDOW_SIZE;

    // Figures out how many gallons of paint are needed to paint the room
    dGallonsNeeded = dSquareFeet / iCOVERAGE_PER_GALLON;

    /*
     * Outputs statement saying dimensions, number of doors, and number of
     * windows of the room as well as gallons of paint needed to paint the room
     */
    System.out
        .println("For a room with a length of " + iLength + " ft, width of "
            + iWidth + " ft, a height of " + iHeight + " ft, and with "
            + iWindows + " windows and " + iDoors + " doors, it would take "
            + dGallonsNeeded + " gallons to paint the room.");
  }
}