package chapterThree;

/**
 * StringManipulation.java
 *
 * Code Description: Test several methods for manipulating String objects
 *    
 * @author Trevor Slabicki
 * @version 10-18-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class StringManipulation
{
  /**
   * main method - Test several methods for manipulating String objects
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    
    // Initializing Scanner
    Scanner kb = new Scanner(System.in);
    
    // Declare variables to be used for String manipulations
    String sPhrase = new String("This is a String test.");
    int iPhraseLength;
    int iMiddleIndex;
    String sFirstHalf;
    String sSecondHalf;
    String sSwitchedPhrase;
    String sMiddleThree;
    String sCity, sState;
    String sCityState;

    // compute the length, middle index and middle three characters of the phrase
    iPhraseLength = sPhrase.length();
    iMiddleIndex = iPhraseLength / 2;
    sMiddleThree = sPhrase.substring(iMiddleIndex - 1, iMiddleIndex + 2);

    // get the substring for each half of the phrase
    sFirstHalf = sPhrase.substring(0, iMiddleIndex);
    sSecondHalf = sPhrase.substring(iMiddleIndex, iPhraseLength);

    // concatenate the sFirstHalf at the end of the sSecondHalf
    sSwitchedPhrase = sSecondHalf.concat(sFirstHalf);
    
    // Replaces all blank characters in sSwitchedPhrase with an asterisk
    sSwitchedPhrase = sSwitchedPhrase.replaceAll(" ", "*");

    // print information about the phrase
    System.out.println();
    System.out.println("Original phrase: " + sPhrase);
    System.out
        .println("Length of the phrase: " + iPhraseLength + " characters");
    System.out.println("Index of the middle: " + iMiddleIndex);
    System.out.println(
        "Character at the middle index: " + sPhrase.charAt(iMiddleIndex));
    System.out.println("Switched phrase: " + sSwitchedPhrase);
    System.out.println("Middle three characters of the phrase: " + sMiddleThree);
    System.out.println();
    
    // Asks user for hometown and state and stows responses
    System.out.println("What is your home city?");
    sCity = kb.nextLine();
    
    System.out.println("What is your home state?");
    sState = kb.nextLine();
    
    // Puts sState before and after sState in a single String
    sCityState = sState.concat(sCity.concat(sState));
    
    // Prints out the newly concatenated string
    System.out.println(sCityState);
    
    kb.close();  // closing the Scanner object

  }
}