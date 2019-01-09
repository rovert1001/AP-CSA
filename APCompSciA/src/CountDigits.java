import java.util.Scanner; // Importing Scanner class

public class CountDigits
{

  private static Scanner kb = new Scanner(System.in);

  private static String sInput;

  private static int iOdd = 0;
  private static int iEven = 0;
  private static int iZero = 0;

  public static void main(String[] args)
  {

    System.out.println("What is your integer value?");

    sInput = kb.nextLine();

    for (int i = 0; i < sInput.length(); i++)
    {

      // Puts the String value at position i into checkInteger as an int value
      checkInteger(sInput.charAt(i) - '0');

    }

    System.out.println("The integer you entered had:");
    System.out.println(iOdd + " digits that were odd");
    System.out.println(iEven + " digits that were even, and");
    System.out.println(iZero + " digits that were zero.");

  }

  public static void checkInteger(int iNum)
  {

    if (iNum == 0)
      iZero++;
    
    else if (iNum % 2 == 0)
      iEven++;
    
    else
      iOdd++;

  }

}
