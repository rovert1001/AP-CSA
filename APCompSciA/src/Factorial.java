import java.util.Scanner;

public class Factorial

{

  private static Scanner kb = new Scanner(System.in);

  private static int iInput;

  private static boolean bInBounds = false;

  public static void main(String[] args)
  {

    while (!bInBounds)
    {

      System.out.println("What number do you want to be factorialized?");

      iInput = kb.nextInt();

      if (checkOverBounds() && checkUnderBounds())
        bInBounds = true;
    }

    System.out.println("The factorial is: " + factorial(iInput));

  }

  public static int factorial(int iNum)
  {

    if (iNum <= 1)
      return 1;

    return iNum * factorial(iNum - 1);

  }

  public static boolean checkOverBounds()
  {

    if (iInput > 31)
    {

      System.out.println("Number out of bounds.");
      System.out.println("");
      System.out.println("Java can only reliably do integer factorials");
      System.out.println("up to the factorial of 31.");
      System.out.println("");

      return false;
    }
    return true;

  }

  public static boolean checkUnderBounds()
  {

    if (iInput < 0)
    {

      System.out.println("Number out of bounds");
      System.out.println("");
      System.out.println("Factorials can only be 0 and higher.");
      System.out.println("");

      return false;
    }
    return true;

  }
}
