package chapterFour;
/**
 * Die.java
 *
 * Code Description: Class definitions for a playing Die
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.org
 */

public class Die
{
  // set maximum face value
  private final int iMAX = 6;

  // declare current value showing on the die
  private int iFaceValue; 

  /**
   * Constructor - Sets the initial face value
   */
  public Die()
  {
    // initialize die face value
    iFaceValue = 1;
  }

  /**
   * roll - Rolls the die and returns the result
   */
  public int roll()
  {
    // randomize die face value
    iFaceValue = (int) (Math.random() * iMAX) + 1;
    return iFaceValue;  //returns die face value
  }

  /**
   * setFaceValue - Face value mutator
   * 
   * @param iValue - face value to be set
   */
  public void setFaceValue(int iValue)
  {
    // set die face value to passed-in value
    iFaceValue = iValue;
  }

  /**
   * getFaceValue - Face value accessor
   */
  public int getFaceValue()
  {
    return iFaceValue; //returns die face value
  }

  /**
   * toString - Returns a string representation of this die
   */
  public String toString()
  {
    // create String with the die face value
    String sResult = Integer.toString(iFaceValue);

    return sResult; //returns die face value
  }
}