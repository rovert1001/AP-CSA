package chapterThree;

/**
 * Deli.java
 *
 * Code Description: Computes the price of a deli item given the weight
 * (in ounces) and price per pound -- prints a label,
 * nicely formatted, for the item.
 *    
 * @author Trevor Slabicki
 * @version 10-24-2018 10-29-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner; //import Scanner class
import java.text.DecimalFormat; //import DecimalFormat class
import java.text.NumberFormat; //import NumberFormat class

public class Deli
{
  /**
   * main method - reads in the price per pound of a deli item and number of
   * ounces of a deli item then computes the total price and prints a "label"
   * for the item
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // Constant to convert ounces to pounds
    final double dOUNCES_PER_POUND = 16.0;

    // Variables for weights and prices
    double dPricePerPound;
    double dWeightOunces;
    double dWeightLbs;
    double dTotalPrice;

    // Declaring Scanner
    Scanner kb = new Scanner(System.in);

    // Initializing formats for currency and rounding numbers
    NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
    DecimalFormat fmtDecimal = new DecimalFormat("0.##");

    // Asks user for price per pound and ounces of item; stows the answers
    System.out.println("Welcome to the CS Deli! ! \n ");
    System.out.print("Enter the price per pound of your item: ");
    dPricePerPound = kb.nextDouble();

    System.out.print("Enter the weight (ounces): ");
    dWeightOunces = kb.nextDouble();

    // Calculates the item weight in pounds and total cost of order
    dWeightLbs = dWeightOunces / dOUNCES_PER_POUND;
    dTotalPrice = dPricePerPound * dWeightLbs;

    // Outputs the calculations with formatting from the DecimalFormat and
    // NumberFormat classes
    System.out.println("");
    System.out.println("    ***** CSDeli *****");
    System.out.println(
        "Unit Price: " + fmtCurrency.format(dPricePerPound) + " per pound");
    System.out
        .println("    Weight: " + fmtDecimal.format(dWeightLbs) + " pounds");
    System.out.println("     TOTAL: " + fmtCurrency.format(dTotalPrice));
    
    kb.close(); // closing the Scanner object

  }
}