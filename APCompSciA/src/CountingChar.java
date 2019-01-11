import java.util.Scanner;

public class CountingChar
{

  private static String sPhrase; // a string of characters
  private static int iCountBlank; // the number of blanks (spaces) in the phrase
  private static int iLength; // the length of the phrase
  private static char cChar; // an individual character in the string
  private static Scanner kb = new Scanner(System.in);

  public static void main(String[] args)
  {

    System.out.println();
    System.out.println("Character Counter");
    System.out.println();

    System.out.print("Enter a sentence or phrase: ");
    sPhrase = kb.nextLine();
    iLength = sPhrase.length();

    System.out.println();
    System.out.println("Number of blank spaces: " + charCounter(' '));
    System.out.println();
  }

  private static int charCounter(char cChar)
  {

    // Amount of times the given character appears in cChar
    int iCharCount = 0;

    // Character at position in charList; used w/ for loop
    char cCharAt;

    // Array of chars in sPhrase
    char[] charList = sPhrase.toCharArray();

    for (cCharAt = 0; cCharAt < charList.length; cCharAt++)
    {

      if (charList[cCharAt] == cChar)
        iCharCount++;

    }

    /*
     * for loop above is equivalent (ignoring formatting) to what is below
        
        for (char cCharAt : sPhrase.toCharArray()) 
        {
          if (cCharAt == cChar) 
            iCharCount++;
        }  */
    

    return iCharCount;

  }
}