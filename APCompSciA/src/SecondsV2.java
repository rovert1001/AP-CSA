/**
 * SecondsV2.java
 *
 * Code Description: Initializes values representing a time duration in hours,
 * minutes, and seconds and then prints the equivalent total number of seconds.
 * 
 * @author Trevor Slabicki
 * @version 9-28-2018
 * @contact 1002089@palisadessd.org
 */

public class SecondsV2
{

  // Declares constants to convert minutes and hours to seconds
  public static final int iMINUTES_TO_SECONDS = 60;
  public static final int iHOURS_TO_SECONDS = 60 * iMINUTES_TO_SECONDS;

  // Declares constants for seconds, minutes, and hours
  public static final int iSECONDS = 5;
  public static final int iMINUTES = 5;
  public static final int iHOURS = 5;

  // Declares and calculates total seconds in above hours, minutes, and seconds
  public static int iTotalSeconds = iSECONDS + iMINUTES * iMINUTES_TO_SECONDS
      + iHOURS * iHOURS_TO_SECONDS;

  /**
   * main method - Outputs total seconds in the given time
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Outputs total seconds in the given time
    System.out.println("For a time of " + iHOURS + " hours, " + iMINUTES
        + " minutes, and " + iSECONDS + " seconds, there would be a total of "
        + iTotalSeconds + " seconds in that time.");

  }

}
