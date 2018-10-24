package chapterTwoV2;



/**
 * SecondsV3.java
 *
 * Code Description: Gets values from user representing a time duration in
 * seconds, and then calculates and prints the equivalent in hours, minutes,
 * and seconds
 * 
 * @author Trevor Slabicki
 * @version 10-13-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class SecondsV3
{

  // Making Scanner to read in time
  private static Scanner kb = new Scanner(System.in);

  // Declares constants to convert minutes and hours to seconds
  private static final int iSECONDS_TO_MINUTES = 60;
  private static final int iSECONDS_TO_HOURS = 60 * iSECONDS_TO_MINUTES;

  // Declares constants for seconds, minutes, hours, and two for total seconds
  private static int iSeconds, iMinutes, iHours, iTotalOne, iTotalTwo;

  /**
   * main method - Gets values from user representing a time duration in
   * seconds, and then calculates and prints the equivalent in hours, minutes,
   * and seconds
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prompts user for seconds and stows value
    System.out.println("How many seconds are there?");
    iTotalOne = kb.nextInt();

    // Making redundant variable for total seconds
    iTotalTwo = iTotalOne;

    // Calculates total hours from total and subtracts answer from total
    iHours = iTotalTwo / iSECONDS_TO_HOURS;
    iTotalTwo %= iSECONDS_TO_HOURS;

    // Calculates total minutes from total and subtracts answer from total
    iMinutes = iTotalTwo / iSECONDS_TO_MINUTES;
    iTotalTwo %= iSECONDS_TO_MINUTES;

    // Calculates total seconds from seconds and subtracts answer from total
    iSeconds = iTotalTwo;

    // Outputs total time for the given seconds
    System.out.println("For " + iTotalOne + " seconds, there are:");
    System.out.println(iHours + " hours");
    System.out.println(iMinutes + " minutes");
    System.out.println(iSeconds + " seconds");

    kb.close(); // closing the Scanner object

  }

}
