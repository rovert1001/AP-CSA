
/**
 * PhoneNumbers.java
 *
 * Code Description: Generates a random phone number with some parameters 
 * for some digits
 * 
 * @author Trevor Slabicki
 * @version 11-8-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.concurrent.*; // importing package for random generator
import java.text.DecimalFormat; //import DecimalFormat class

public class PhoneNumbers
{

  // Holds different parts of phone number at different times
  private static int iTempNumber;

  // Holds the whole phone number
  private static String sPhoneNumber = "";

  // Initializing decimal format for middle numbers to keep extraneous zeros
  private static DecimalFormat fmtMiddle = new DecimalFormat("000");

  // Initializing decimal format for end numbers to keep extraneous zeros
  private static DecimalFormat fmtEnd = new DecimalFormat("0000");

  /**
   * main method - Generates a random phone number with some parameters for some
   * digits; outputs the number
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Makes random numbers for first three digits in the range of 0 and 7 and
    // adds each digit to the final phone number
    for (int i = 0; i < 3; i++)
    {
      iTempNumber = ThreadLocalRandom.current().nextInt(0, 8);
      sPhoneNumber += iTempNumber;
    }

    // Adds separator to phone number
    sPhoneNumber += "-";

    // Makes a number in the range of 000 to 655 and adds digit to final phone
    // number with help from decimal format to keep extra zeros
    iTempNumber = ThreadLocalRandom.current().nextInt(0, 655);
    sPhoneNumber += fmtMiddle.format(iTempNumber);

    // Adds separator to phone number
    sPhoneNumber += "-";

    iTempNumber = ThreadLocalRandom.current().nextInt(0, 10000);
    sPhoneNumber += fmtEnd.format(iTempNumber);

    // Outputs the phone number
    System.out.println("The phone number is: " + sPhoneNumber);
  }

}
