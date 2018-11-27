package chapterThree;

/**
 * UsernameGenerator.java
 *
 * Code Description: Makes a password based on a person's first and last
 * name as well as a random number
 * 
 * @author Trevor Slabicki
 * @version 11-8-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.util.concurrent.*; // importing package for random generator

public class UsernameGenerator
{

  // Initializing Scanner
  private static Scanner kb = new Scanner(System.in);

  // Holds users first and last name
  private static String sFirstName, sLastName;

  // Holds random number
  private static int iRand;

  // Holds password
  private static String sPassword;

  /**
   * main method - Makes a random number, gets user's first and last name, and
   * makes a password from this information, then securely prints out that
   * password
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Computing a random number in range of 10 to 99
    iRand = ThreadLocalRandom.current().nextInt(10, 100);

    // Prompts user to provide first name; stows the value
    System.out.println("What is your first name?");
    sFirstName = kb.nextLine();

    // Prompts user to provide last name; stows the value
    System.out.println("What is your last name?");
    sLastName = kb.nextLine();

    // Puts together a password based on above information
    sPassword = sFirstName.substring(0, 1) + sLastName.substring(0, 5) + iRand;

    // Securely outputs the password
    System.out.println("The password is: " + sPassword);
    
    kb.close();  // closing the Scanner object

  }

}
