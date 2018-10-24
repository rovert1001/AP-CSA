package chapterTwoV2;



/**
 * InfoParagraph.java
 *
 * Code Description: Prompts the user to provide information 
 * about themselves and then inserts that information to a 
 * paragraph that is output to the console.
 * 
 * @author Trevor Slabicki
 * @version 10-12-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class InfoParagraph
{

  // Scanner to read user input for the paragraph
  private static Scanner kb = new Scanner(System.in);

  // Strings to hold the users information
  private static String sName, sAge, sSchoolName, sPetName;

  /**
   * main method - Prompts the user to provide information about themselves and
   * then inserts that information to a paragraph that is output to the console.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    /*
     * Prompts the user for pieces of information and stows the response in the
     * appropriate String
     */
    System.out.println("What is your name?");
    sName = kb.nextLine();

    // User can write a number (eg: 5) or letter age (eg: five) with nextLine()
    System.out.println("What is your age?");
    sAge = kb.nextLine();

    System.out.println("What is your school name?");
    sSchoolName = kb.nextLine();

    System.out.println("What is your pet's name?");
    sPetName = kb.nextLine();

    // Outputs the paragraph using the user data
    System.out.println("");
    System.out.println(
        "Hello, my name is " + sName + " and I am " + sAge + " years old.");
    System.out.println("I’m enjoying my time at " + sSchoolName + ", though");
    System.out.println("I miss my pet" + sPetName + "very much!");

    kb.close(); // closing the Scanner object

  }

}
