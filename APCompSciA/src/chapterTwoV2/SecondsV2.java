package chapterTwoV2;



/**
 * SecondsV2.java
 *
 * Code Description: Gets values from user representing a time duration in hours,
 * minutes, and seconds and then prints the equivalent total number of seconds.
 * 
 * @author Trevor Slabicki
 * @version 10-13-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class SecondsV2
{

  // Making Scanner to read in time
  private static Scanner kb = new Scanner(System.in);

  // Declares constants to convert minutes and hours to seconds
  private static final int iMINUTES_TO_SECONDS = 60;
  private static final int iHOURS_TO_SECONDS = 60 * iMINUTES_TO_SECONDS;

  // Declares constants for seconds, minutes, hours, and total seconds
  private static int iSeconds, iMinutes, iHours, iTotalSeconds;

  /**
   * main method - Gets values from user representing a time duration in hours,
   * minutes, and seconds and then prints the equivalent total number of
   * seconds.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prompts user for hours and stows value
    System.out.println("How many hours are there?");
    iHours = kb.nextInt();

    // Prompts user for minutes and stows value
    System.out.println("How many minutes are there?");
    iMinutes = kb.nextInt();

    // Prompts user for seconds and stows value
    System.out.println("How many seconds are there?");
    iSeconds = kb.nextInt();

    // Calculates total seconds from user input
    iTotalSeconds = iSeconds + iMinutes * iMINUTES_TO_SECONDS
        + iHours * iHOURS_TO_SECONDS;

    // Outputs total seconds in the given time
    System.out.println("For a time of " + iHours + " hours, " + iMinutes
        + " minutes, and " + iSeconds + " seconds, there would be a total of "
        + iTotalSeconds + " seconds in that time.");

    kb.close(); // closing the Scanner object

  }

}
