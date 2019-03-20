package dunno;
import java.util.Scanner;
import java.math.BigInteger;
public class Sales
{
  public static void main(String[] args)
  {
    final int iSALESPEOPLE = 5;

    int[] iSales = new int[iSALESPEOPLE];
    int iSum;
    int iIndex;

    Scanner kb = new Scanner(System.in);

    for (iIndex = 0; iIndex < iSales.length; iIndex++)
    {
      System.out.print("Enter sales for salesperson " + iIndex + ": $");
      iSales[iIndex] = kb.nextInt();
    }

    System.out.println("\n  Sales Report");
    System.out.println(" ------------------ ");

    iSum = 0;
    for (iIndex = 0; iIndex < iSales.length; iIndex++)
    {
      System.out.println(" " + iIndex + " $" + iSales[iIndex]);
      iSum += iSales[iIndex];
    }

    System.out.println("\nTotal sales: $" + iSum);

    kb.close();
  }
}