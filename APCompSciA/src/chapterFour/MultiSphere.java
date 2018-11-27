package chapterFour;
/**
 * MultiSphere.java
 *
 * Code Description: Makes two Spheres and outputs information about them before
 * and after changing their diameter
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

public class MultiSphere
{

  // Initializing two spheres
  private static Sphere SphereOne = new Sphere(5, "Sphere One");
  private static Sphere SphereTwo = new Sphere(7, "Sphere Two");

  /**
   * main method - Outputs information about the spheres before and after
   * changing their diameters
   * 
   * @param args
   */
  public static void main(String[] args)
  {

    // Outputs info on Spheres
    System.out.println("The original values are:");
    System.out.println(SphereOne.toString());
    System.out.println(SphereTwo.toString());
    System.out.println("");

    // Making new diameters
    SphereOne.setDiameter(20);
    SphereTwo.setDiameter(2.715);

    // Outputs info on Spheres with new diameters
    System.out.println("The new values are:");
    System.out.println(SphereOne.toString());
    System.out.println(SphereTwo.toString());

    // Disclaimer about units
    System.out.println("");
    System.out.println("");
    System.out.println("Disclaimer: ");
    System.out
        .println("Units are not included for this program is unit agnostic.");
    System.out.println(
        "Remember that units are often different between diameter, area, and volume!");

  }
}
