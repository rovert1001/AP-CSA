package chapterFour;
/**
 * RollingDice2.java
 *
 * Code Description: Creates a pair of dice and shows off methods of the
 * PairOfDice class
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

public class RollingDice2
{

  // Making a pair of dice
  private static PairOfDice DiePairOne = new PairOfDice();

  /**
   * main method - Shows off methods of the PairOfDice class
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // Outputting first original dice sum
    System.out.println("Original dice sum");
    System.out.println(DiePairOne.getSum());
    System.out.println("");

    // Setting and outputting second dice sum
    DiePairOne.setDieOne(5);
    DiePairOne.setDieTwo(DiePairOne.getDieOne() / 2);
    ;
    System.out.println("Second dice sum");
    System.out.println(DiePairOne.getSum());
    System.out.println("");

    // Setting and outputting third dice sum
    DiePairOne.roll();
    System.out.println("Third dice sum");
    System.out.println(DiePairOne.getSum());

  }

}
