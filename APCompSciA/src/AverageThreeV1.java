/**
 * AverageThreeV1.java
 *
 * Code Description: Makes three variables and finds their average, then prints
 * out the resulting average.
 * 
 * @author Trevor Slabicki
 * @version 9-28-2018
 * @contact 1002089@palisadessd.org
 */

public class AverageThreeV1
{

  // Initializing three integers
  public static int iIntOne = 4;
  public static int iIntTwo = 2;
  public static int iIntThree = 6;

  /*
   * Initializes and calculates Average, which is the decimal average of the
   * above three integers
   */
  public static double dAverage = (iIntOne + iIntTwo + iIntThree) / 3;

  /**
   * main method - Prints out the average of the above integers using the double
   * dAverage
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Prints out the average of above three integers using the double dAverage
    System.out.println("For the integers " + iIntOne + ", " + iIntTwo + ", and "
        + iIntThree + ", their average would be " + dAverage + ".");

  }

}
