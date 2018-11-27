package chapterFour;
/**
 * Sphere.java
 *
 * Code Description:
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

public class Sphere
{

  // Holds diameter of the Sphere
  private double dDiameter;
  
  // Holds the name of the Sphere
  private String sSphereName;
  
  /**
   * Constructor - Constructs a Sphere object and sets its diameter as well as
   * stows object name
   * 
   * @param   dDiameter Sets value of instance dDiameter for the sphere
   *          
   * @param   sSphereName The name the user should see the sphere as; is a
   *          workaround to allow use of an object's name      
   */
  public Sphere(double dDiameter, String sSphereName)
  {

    // Sets diameter of Sphere
    this.dDiameter = dDiameter;
    
    // Sets name of Sphere
    this.sSphereName = sSphereName;

  }

  /**
   * getDiameter - Returns the double dDiamter
   */
  public Double getDiamter()
  {
    
    // Returns Diameter
    return dDiameter;

  }

  /**
   * setDiameter - Sets dDiameter based on input
   * 
   * @param dDiameter Sets value of instance dDiameter for the sphere
   */
  public void setDiameter(double dDiameter)
  {
    
    // Sets diameter
    this.dDiameter = dDiameter;

  }
  
  /**
   * surfArea - Calculates and returns surface area of Sphere
   */
  public double surfArea() {
    
    // Finds surface area of sphere by using surface area formula
    double dSurfArea = 4.0 * Math.PI * Math.pow((this.dDiameter / 2.0), 2.0);
    
    return dSurfArea;
    
  }
  
  /**
   * dVolume - 'Integrates' surfArea to find and return volume
   */
  public double volume() {
    
    // 'Integrating' surfArea to find volume
    double dVolume = surfArea() * (this.dDiameter / 2.0) / 3.0;
    
    return dVolume;
    
  }

  /**
   * toString - Outputs relevant information about the Sphere
   */
  public String toString()
  {
    
    // Note: no units are shown for this program is unit agnostic, the 
    // user can figure that part out on their own
    
    // Outputs name of Sphere, its diameter, its surface are, and its
    // volume
    return sSphereName + " has a diameter of " + dDiameter +
           ", a surface area of " + surfArea() + ", and a volume of "
           + volume();

  }

}
