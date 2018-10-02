/**
 * MoneyConversionV1.java
 *
 * Code Description: Takes a monetary value and says the least number of bills
 * and coins it could be and outputs the result
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

public class MoneyConversionV1
{

  // Defining constant for money amount to be divided to bills and coins
  public static final double dMoney = 47.63;

  /*
   * Making redundant variable of dMoney so the value of dMoney can be changed
   * for calculations, but without losing the value of dMoney
   */
  public static double dMoneyTwo = dMoney;

  // Outlining bills and coins to be figured out
  public static int iTens, iFives, iOnes;
  public static int iQuarters, iDimes, iNickels, iPennies;

  /**
   * main method - Determines the least amount of bills and coins dMoney could
   * be and outputs the result.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    /*
     * Determines amount of each bills and coins in dMoneyTwo starting with the
     * largest monetary amount to the smallest (tens to pennies). After each
     * value is determined that value is then subtracted from dMoneyTwo so the
     * rest of the bills and coins only use the amount of money that other bills
     * and coins do not already account for.
     */
    iTens = (int) dMoneyTwo / 10;
    dMoneyTwo -= iTens * 10;
    iFives = (int) dMoneyTwo / 5;
    dMoneyTwo -= iFives * 5;
    iOnes = (int) dMoneyTwo;
    dMoneyTwo -= iOnes;
    iQuarters = (int) (dMoneyTwo * 100 / 25);
    dMoneyTwo -= iQuarters * 0.25;
    iDimes = (int) (dMoneyTwo * 100 / 10);
    dMoneyTwo -= iDimes * 0.10;
    iNickels = (int) (dMoneyTwo * 100 / 5);
    dMoneyTwo -= iNickels * 0.05;
    iPennies = (int) (dMoneyTwo * 100);

    // Outputs resulting bills and coins
    System.out.println("For an amount of $" + dMoney + " there would be:");
    System.out.println(iTens + " ten dollar bills,");
    System.out.println(iFives + " five dollar bills,");
    System.out.println(iOnes + " one dollar bills,");
    System.out.println(iQuarters + " quarters,");
    System.out.println(iDimes + " dimes,");
    System.out.println(iNickels + " nickels, and");
    System.out.println(iPennies + " pennies.");

  }

}
