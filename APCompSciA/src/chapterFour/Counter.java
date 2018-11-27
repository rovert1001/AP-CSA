package chapterFour;
/**
 * Counter.java
 *
 * Code Description: Makes the object Counter, which will change the value of a
 * variable iCount
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

public class Counter
{

  // Value to be changed by Counter object
  private int iCount;

  /**
   * Constructor - Constructs a Counter object, which will change value of
   * iCount
   * 
   * @param args
   */
  public Counter()
  {

    // Sets iCount to 0
    this.iCount = 0;

  }
  
  /**
   * click - Increments value of iCount by 1
   * 
   * @param args
   */
  public void click()
  {
    
    // Increments value of iCount by 1
    this.iCount++;

  }
  
  /**
   * getCount - Gets the value iCOunt
   * 
   * @param args
   */
  public String getCount()
  {
    
    // Uses toString method to get return value of iCount
    return "The count is " + toString();

  }

  /**
   * reset - Resets value of iCount to zero
   * 
   * @param args
   */
  public void reset()
  {

    // Sets value of iCount to zero
    this.iCount = 0;

  }

  /**
   * toString - Converts value of iCount to a String
   * 
   * @param args
   */
  public String toString()
  {
    
    //Converts value of iCount to a String
    String sString = Integer.toString(this.iCount);
    
    //Returns sString (iCount as a String)
    return sString;

  }

}
