package chapterFour;
/**
 * Car.java
 *
 * Code Description:
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

public class Car
{

  // Strings for make, model and year of a Car
  private String sMake, sModel, sYear;
  
  // Stores name of the car
  private String sCarName;

  /**
   * Constructor - Constructs a car with a make model and year
   * 
   * @param sMake String that holds make of the car
   * @param sModel String that holds model of the car
   * @param sYear String that holds year of the car
   * @param sCarName String that holds the name of the car
   */
  public Car(String sYear, String sMake, String sModel, String sCarName)
  {

    // Sets input equal to instance variables
    this.sMake = sMake;
    this.sModel = sModel;
    this.sYear = sYear;
    this.sCarName = sCarName;

  }
  
  /**
   * Constructor - Constructs a car with a make model and year
   * 
   * @param sMake String that holds make of the car
   * @param sModel String that holds model of the car
   * @param iYear Integer that holds year of the car
   * @param sCarName String that holds the name of the car
   */
  public Car(int iYear, String sMake, String sModel, String sCarName)
  {
    
    // Converts iYear to a String
    String sYear = Integer.toString(iYear);
    
    // Sets input equal to instance variables
    this.sMake = sMake;
    this.sModel = sModel;
    this.sYear = sYear;
    this.sCarName = sCarName;

  }
  

  /**
   * setMake - Sets make of the car
   * 
   * @param sMake String defining new make of the car
   */
  public void setMake(String sMake)
  {

    // Sets instance variable sMake
    this.sMake = sMake;

  }

  /**
   * getMake - Returns sMake as a string; kind of useless since sMake is already
   * a String, but required nevertheless
   */
  public String getMake()
  {

    // Returns sMake as a String
    return sMake;

  }
  
  /**
   * setModel - Sets model of the car
   * 
   * @param sModel String defining new model of the car
   */
  public void setModel(String sModel)
  {

    // Sets instance variable sModel
    this.sModel = sModel;

  }

  /**
   * getModel - Returns sModel as a string; kind of useless since sModel is already
   * a String, but required nevertheless
   */
  public String getModel()
  {

    // Returns sModel as a String
    return sModel;

  }
  
  /**
   * setYear - Sets year of the car
   * 
   * @param sYear String defining new year of the car
   */
  public void setYear(String sYear)
  {

    // Sets instance variable sYear
    this.sYear = sYear;

  }
  
  /**
   * setYear - Sets year of the car
   * 
   * @param sYear Integer defining new year of the car
   */
  public void setYear(int iYear)
  {
    
    // Converts iYear to a String
    String sYear = Integer.toString(iYear);
    
    // Sets instance variable sYear
    this.sYear = sYear;
  }
  
  /**
   * getYear - Returns sYear as a string; kind of useless since sYear is already
   * a String, but required nevertheless
   */
  public String getYear()
  {

    // Returns sYear as a String
    return sYear;

  }
  
  /**
   * getYear - Returns sYear as a string; kind of useless since sYear is already
   * a String, but required nevertheless
   */
  public String toString() {
    
    return sCarName + " is a " + sYear + " " + sMake+ " " + sModel;
    
  }
  

  /*
   * Note: 
   * 
   * Omission of @param when there is no parameter is consistent with the
   * java code conventions, just like java does outright explicitly say
   * that same line curly braces are the preferred java convention.
   * 
   * Link:
   * https://www.oracle.com/technetwork/java/javase/documentation/index-137868.
   * html#styleguide 
   * 
   * Google also follows the same convention. 
   * 
   * Link:
   * https://google.github.io/styleguide/javaguide.html 
   * 
   * Microsoft has no java style guide.
   */

}
