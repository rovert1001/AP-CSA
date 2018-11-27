package chapterFour;
/**
 * MultiSphere.java
 *
 * Code Description: Makes two car and outputs information about them before and
 * after changing their make, model, and year
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

public class CarTest
{

  // Making two cars
  private static Car CarOne = new Car(2003, "Pontiac", "Bonneville", "Car One");
  private static Car CarTwo = new Car("2009", "Ford", "Focus", "Car Two");

  /**
   * main method - Outputs information about the cars before and after changing
   * their make, model, and year
   * 
   * @param args
   */
  public static void main(String[] args)
  {

    // Outputting original values of the cars
    System.out.println("Origianl Values");
    System.out.println(CarOne.toString());
    System.out.println(CarTwo.toString());
    System.out.println("");

    // Changing values for both cars
    CarOne.setYear(1989);
    CarOne.setMake("Chevy");
    CarOne.setModel("Blazer");

    CarTwo.setYear("2002");
    CarTwo.setMake("Opel");
    CarTwo.setModel("Speedster");

    // Outputting new values of the cars
    System.out.println("New Values");
    System.out.println(CarOne.toString());
    System.out.println(CarTwo.toString());

  }

}
