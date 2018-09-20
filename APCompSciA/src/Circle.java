/**
 * Circle.java
 *
 * Code Description: Print the area of a circle with two different radii
 *    
 * @author  Trevor Slabicki
 * @version 9-20-2018
 * @contact 1002089@palisadessd.net
 */

public class Circle
{
  /**
  * main method - Print the area of a circle with two different radii
  * @param args
  */
	
  // constant variable for the value of PI
  private static final double PI = 3.14159;
  
  public static void main(String[] args)
  {



    // variable declarations and initializations to calculate area of circle
    int radius = 10;
    double area = PI * radius * radius;
    double circumference = PI * radius * 2;

    // print the information for the first circle
    System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
    System.out.println("The area of a circle with radius " + radius +
      " is " + area);

    // change the radius and print the information for the second circle
    radius = 20;
    area = PI * radius * radius;
    circumference = PI * radius * 2;
    System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
    System.out.println("The area of a circle with radius " + radius +
      " is " + area);
  }
}
