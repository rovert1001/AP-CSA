/**
 * Deli.java
 *
 * Code Description: Computes the price of a deli item given the weight
 * (in ounces) and price per pound -- prints a label,
 * nicely formatted, for the item.
 *    
 * @author Trevor Slabicki
 * @version 10-24-2018
 * @contact 1002089@palisadessd.net
 */

import java.util.Scanner;  //import Scanner class
import java.text.NumberFormat; //import NumberFormat class
// import other classes as needed

public class Deli
{
  /**
   * main method - reads in the price per pound of a deli item
   * and number of ounces of a deli item then computes
   * the total price and prints a "label" for the item
   * @param args
   */
  public static void main (String[] args)
  {
    final double dOUNCES_PER_POUND = 16.0;

    double dPricePerPound;
    double dWeightOunces; 
    double dWeightLbs; 
    double dTotalPrice; 
    Scanner kb = new Scanner(System.in);

    // Declare fmtCurrency as a NumberFormat object and use the
    // getCurrencyInstance method to assign it a value

    // Declare fmtDecimal as a DecimalFormat object and instantiate
    // it to format numbers with at least one digit to the left of the
    // decimal and the fractional part rounded to two digits.

    System.out.println("Welcome to the CS Deli! ! \n ");
    System.out.print("Enter the price per pound of your item: ");
    dPricePerPound = kb.nextDouble();

    System.out.print ("Enter the weight (ounces): ");
    dWeightOunces = kb.nextDouble();

    dWeightLbs = dWeightOunces / dOUNCES_PER_POUND;
    dTotalPrice = dPricePerPound * dWeightLbs;

    // Print the label using the formatting objects fmtDecimal 
    // for the weight in pounds and fmtCurrency for the prices
  }
}