package chapterFour;
/**
 * PairOfDice.java
 *
 * Code Description: Outlines a PairOfDice object, which consists of two Die
 * objects
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

public class PairOfDice
{

  // Making two dice
  Die DieOne = new Die();
  Die DieTwo = new Die();

  /**
   * PairOfDice - Creates a pair of dice
   */
  public PairOfDice()
  {

  }

  /**
   * GetDieOne - Returns the value of DieOne
   */
  public int getDieOne()
  {

    return DieOne.getFaceValue(); // Returns face value of DieOne

  }

  /**
   * setDieOne - Sets value of DieOne
   * 
   * @param iValue The integer value the die will become
   */
  public void setDieOne(int iValue)
  {

    // Sets value of DieOne
    DieOne.setFaceValue(iValue);

  }

  /**
   * GetDieTwo - Returns the value of DieTwo
   */
  public int getDieTwo()
  {

    return DieTwo.getFaceValue(); // Returns face value of DieTwo

  }

  /**
   * setDieTwo - Sets value of DieTwo
   * 
   * @param iValue The integer value the die will become
   */
  public void setDieTwo(int iValue)
  {

    // Sets value of DieTwo
    DieTwo.setFaceValue(iValue);

  }

  /**
   * roll - Rolls both dice of the pair to values between 1 and 6
   */
  public void roll()
  {

    // Rolls both dice
    DieOne.roll();
    DieTwo.roll();

  }

  /**
   * getSum - Gets the sum of both dice in the pair
   */
  public int getSum()
  {

    // Calculates sum of two dice
    int iSum = DieOne.getFaceValue() + DieTwo.getFaceValue();

    return iSum; // Returns sum of two dice

  }
}
