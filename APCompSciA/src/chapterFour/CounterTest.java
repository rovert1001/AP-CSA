package chapterFour;

/**
 * CounterTest.java
 *
 * Code Description:  Makes to Counter objects and allows the user to change
 * their values through commands.
 * 
 * @author Trevor Slabicki
 * @version 11-24-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // Importing Scanner object

public class CounterTest
{

  // Declaring Counter objects
  private static Counter countOne = new Counter();
  private static Counter countTwo = new Counter();

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  // String to hold user input
  private static String sInput;

  // Decides which counter to change
  private static int iCounterSelector;

  /**
   * main method - Reads user input and changes values of one of the counters
   * based on said user input
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Setting CounterSelector to change countOne
    iCounterSelector = 0;

    // Shows starting information
    start();

    // Infinite while loop for user input
    while (Double.NaN != Double.NaN)
    {

      // Reading user input
      sInput = kb.nextLine();

      // Reacts to user input
      switch (sInput.toLowerCase())
      {

      // Clicks (increments) selected counter and notifies user
      case "click":
        if (iCounterSelector == 0)
          countOne.click();
        else
          countTwo.click();
        System.out.println("The counter has been clicked");
        break;

      // Puts value of current counter on console
      case "get":
        if (iCounterSelector == 0)
          System.out.println("The counter is at " + countOne.getCount());
        else
          System.out.println("The counter is at " + countTwo.getCount());
        break;

      // Changes selected counter and notifies user
      case "switch":
        iCounterSelector++;
        iCounterSelector %= 2;
        // Decides what counter is selected and outputs that
        String sCounter = (iCounterSelector == 0 ? "counter one"
            : "counter two");
        System.out.println("The counter is now" + sCounter);
        break;

      // Resets value of selected counter and notifies user
      case "reset":
        if (iCounterSelector == 0)
          countOne.reset();
        else
          countTwo.reset();
        System.out.println("The counter has been reset");
        break;

      // Shows information presented at the start
      case "start":
        start();
        break;

      // Shows a list of commands
      case "help":
        help();
        break;

      // Default for invalid command
      default:
        System.out.println(sInput + " is not a valid command");
        break;
      }
    }

    // No closing of Scanner b/c the code should never exit the while loop

  }

  /**
   * help - shows a list of commands to the user
   * 
   * @param args
   */
  public static void help()
  {

    // List of commands
    System.out.println("");
    System.out.println("click   increments current counter");
    System.out.println("get     gets value of current counter");
    System.out.println("switch  switches to the other counter");
    System.out.println("reset   resets value of current counter");
    System.out.println("help    shows a list of commands");
    System.out.println("start    shows the start screen");
    System.out.println("");

  }

  /**
   * start - Shows starting information to the user
   * 
   * @param args
   */
  public static void start()
  {

    // Starting information
    System.out.println("Welcome to Counter Test");
    System.out.println("");
    System.out.println("The program runs on a system of");
    System.out.println("two counters, where only one will");
    System.out.println("be selected, and thus changed by");
    System.out.println("commands, at a time");
    System.out.println("");
    System.out.println("To see a list of commands type");
    System.out.println("help into the console");
    System.out.println("");

  }

}
