
/**
 * DoSum.java
 *
 * Code Description: Takes values from the user and adds them to a
 * sum. Quits when the user enters 0, then outputs the ending sum.
 * 
 * @author Trevor Slabicki
 * @version 1-9-2019
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class DoSum
{

  // Scanner for numbers to add to iSum
  private static Scanner kb = new Scanner(System.in);

  // Holds sum and input to add to sum
  private static int iSum = 0, iInput;
  
  /**
   * main method - Takes values from the user and adds them to a
   * sum. Quits when the user enters 0, then outputs the ending sum.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    
    // Info about adding sum for user
    System.out.println("Enter values to add to the sum,");
    System.out.println("but if you enter a zero [0], the sum will end.");

    // Asks user for a value; adds that value to iSum and quits when the user
    // enters a 0.
    do
    {

      System.out.println("The sum is currently: " + iSum);
      System.out.println("");
      System.out.println("Please enter a number to add to the sum:");
      System.out.println("");

      iInput = kb.nextInt();

      iSum += iInput;
      System.out.println("");

    }
    while (iInput != 0);

    // Outputs the ending value of iSum
    System.out.println("You entered zero!");
    System.out.println("The sum is over.");
    System.out.println("");
    System.out.println("Its total was: " + iSum);

    kb.close(); // closing Scanner object

  }

}
