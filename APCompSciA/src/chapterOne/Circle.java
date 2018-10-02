package chapterOne;

/**
 * Circle.java
 *
 * Code Description: Print the area of a circle with two different radii
 * 
 * @author Trevor Slabicki
 * @version 9-22-2018
 * @contact 1002089@palisadessd.net
 */

public class Circle
{
  /**
   * main method - Print the area of a circle with two different radii
   * 
   * @param args
   */

  // Above comment was not properly aligned in code given on canvas.

  public static void main(String[] args)
  {

    // constant variable for the value of PI
    final double dPI = 3.141592;

    // variable declarations and initializations to calculate area,
    // circumference, and change of these values based on radii of a circle
    int iRadiusOne = 10;
    int iRadiusTwo = 20;
    double dAreaOne = dPI * iRadiusOne * iRadiusOne;
    double dCircumfOne = dPI * iRadiusOne * 2;
    double dAreaTwo = dPI * iRadiusTwo * iRadiusTwo;
    double dCircumfTwo = dPI * iRadiusTwo * 2;
    double dAreaGrowth = dAreaTwo / dAreaOne;
    double dCircumfGrowth = dCircumfTwo / dCircumfOne;

    // print the information for the first circle
    System.out.println("The circumference of a circle with radius " + iRadiusOne
        + " is " + dCircumfOne);
    System.out.println(
        "The area of a circle with radius " + iRadiusOne + " is " + dAreaOne);

    // print the information for the second circle
    System.out.println("The circumference of a circle with radius " + iRadiusTwo
        + " is " + dCircumfTwo);
    System.out.println(
        "The area of a circle with radius " + iRadiusTwo + " is " + dAreaTwo);

    // print the comparisons between circles one and two
    System.out.println("When the radius changed from " + iRadiusOne + " to "
        + iRadiusTwo + " the area changed by a factor of " + dAreaGrowth);
    System.out.println(
        "When the radius changed from " + iRadiusOne + " to " + iRadiusTwo
            + " the circumference changed by a factor of " + dCircumfGrowth);
  }
}
