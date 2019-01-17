/**
 * CountingChar.java
 *
 * Code Description: Counts and returns certain chars within a user 
 * given phrase
 * 
 * @author Trevor Slabicki
 * @version 1-17-2019
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner;


/**
   * main method - Uses the charCounter method to count certain chars 
   * in a user given phrase
   * 
   * @param args
   */
public class CountingChar {

	// A string of characters
	private static String sPhrase;

	// The number of blanks (spaces) in the phrase
	private static int iCountBlank;

	// The length of the phrase
	private static int iLength;

	// An individual character in the string
	private static char cChar;

	// Scanner to read in Strings
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

    // Intialization output for user
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
    System.out.println("The program will repeat until the word"
    + "quit is entered");

    // Program repeats until user enters quit
    while(Double.NaN != Double.NaN) {

      // Prompt user for input
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.print("Enter a sentence or phrase: ");
      System.out.println();

      // Read in phrase to find chars in
      sPhrase = kb.nextLine();
      iLength = sPhrase.length();

      // Exits program if user enters quit
      if (sPhrase.equalsIgnoreCase("quit"))
        break;

      // Format sPhrase for finding chars
      sPhrase = sPhrase.toLowerCase();

      // Ouputs the number of chars for several different types of chars
      // using the charCounter method
      System.out.println();
      System.out.println("Number of blank spaces: " + charCounter(' '));
      System.out.println();

      System.out.println();
      System.out.println("Number of A characters: " + charCounter('a'));
      System.out.println();

      System.out.println();
      System.out.println("Number of E characters: " + charCounter('e'));
      System.out.println();

      System.out.println();
      System.out.println("Number of S characters: " + charCounter('s'));
      System.out.println();

      System.out.println();
      System.out.println("Number of T characters: " + charCounter('t'));
      System.out.println();

    }

    // Ending output for user
   System.out.println();
   System.out.println("The program has quit!");
   System.out.println();

    // Closing the Scanner object
    kb.close(); 

	}

  /**
   * charCounter - Counts number of times cChar appears in the static 
   * String sPhrase
   * 
   * @param cChar the given char used to see how many times it appears
   *              in sPhrase
   */
	private static int charCounter(char cChar) {

		// Amount of times the given character appears in cChar
		int iCharCount = 0;

		// Character at position in charList; used w/ for loop
		char cCharAt;

		// Array of chars in sPhrase
		char[] charList = sPhrase.toCharArray();

    // Checks each place in given String, increments if that char
    // matches cChar
		for (cCharAt = 0; cCharAt < charList.length; cCharAt++) {

			if (charList[cCharAt] == cChar)
				iCharCount++;

		}

		/*
		 * for loop above is equivalent (ignoring formatting) to what
     * is below
		 * 
		 * for (char cCharAt : sPhrase.toCharArray()) {
		 * 
		 *   if (cCharAt == cChar) 
		 * 	   iCharCount++;
     *
		 *  }
		 */

     // Obligatory switch statement because this is do soon and I
     // don't have time to change my code

     switch (cChar)
    {
       case 'A':
       case 'b':
        break;
     }

    // Returns times cChar appeared in sPhrase
		return iCharCount;

	}
}
