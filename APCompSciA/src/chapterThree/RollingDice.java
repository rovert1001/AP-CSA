package chapterThree;

/**
 * RollingDice.java
 *
 * Code Description: Simulates the rolling of two dice and outputs the results
 *    
 * @author Trevor Slabicki
 * @version 10-22-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Random; //import Random class

public class RollingDice
{

  // Making variables to hold rolls of two dice
  private static int diceOne, diceTwo;

  // Initializing random number generator
  private static Random gen = new Random();

  /**
   * main method - The main method 'rolls' two dice using a Random object and
   * outputs the result with a text 'simulation' of rolling the dice. This
   * simulation requires the sleep() method, which can throw an
   * InteruptedException exception. However, catching this exception is not
   * important for this program and exceptions are not a part of our course yet,
   * so the simplest way to use the sleep() method is to simply add the
   * InterrupetedException exception after the throws clause on the main method,
   * where the sleep() method is used.
   * 
   * @param args
   */

  public static void main(String[] args) throws InterruptedException
  {

    // Assigns random values to the dice between 1 and 6 (acting as dice rolls)
    diceOne = gen.nextInt(5) + 1;
    diceTwo = gen.nextInt(5) + 1;

    /*
     * Outputs the results, while pausing 0.5 seconds between some lines to make
     * it look like dice are being rolled
     */
    System.out.println("Two dice will be rolled...");
    Thread.sleep(500);

    System.out.println("...");
    Thread.sleep(500);

    System.out.println("...");
    Thread.sleep(500);

    System.out.println("...");
    Thread.sleep(500);

    System.out.println("...the dice have been rolled!");
    System.out.println("");
    Thread.sleep(500);

    System.out.println("The first die reads a " + diceOne);
    System.out.println("and the second die is a " + diceTwo);

  }

}
