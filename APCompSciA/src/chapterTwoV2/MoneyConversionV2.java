package chapterTwoV2;


/**
 * MoneyConversionV2.java
 *
 * Code Description: Takes a monetary value given by the user and says the
 * least number of bills and coins it could be and then outputs the result
 * 
 * @author Trevor Slabicki
 * @version 10-2-2018
 * @contact 1002089@palisadessd.org
 */

import java.util.Scanner; // Importing Scanner class

public class MoneyConversionV2
{

  // Initializing Scanner to define amount of money
  private static Scanner kb = new Scanner(System.in);

  // Defining constant for money to be determined by user and a redundant double
  private static double dMoney, dMoneyTwo;

  // Outlining bills and coins to be figured out
  private static int iTens, iFives, iOnes;
  private static int iQuarters, iDimes, iNickels, iPennies;

  /**
   * main method - Determines the least amount of bills and coins dMoney could
   * be after dMoney is defined by the user and then outputs the result.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Asks user for amount of money and stows the answer
    System.out.println("What is the amount of money?");
    System.out.println("$");
    dMoney = kb.nextDouble();

    // Making dMoneyTwo redundant variable of dMoney
    dMoneyTwo = dMoney;

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

    kb.close(); // closing the Scanner object

  }

}
