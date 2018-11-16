package chapterThree;
/**
 * PlayingCards.java
 *
 *
 * Code Description: Defines an to hold card values and makes some instances of
 * this enum prints out how these enum cards would be if they were drawn in
 * Blackjack
 * 
 * @author Trevor Slabicki
 * @version 11-1-2018
 * @contact 1002089@palisadessd.net
 */

public class PlayingCards
{

  // Defining enum for possible card values
  enum Rank
  {
    ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king
  }

  /**
   * main method - Creates enums holding card values and prints out how these
   * cards would be if they were drawn in Blackjack
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // Making ints to store card numeric values
    int iCardOneVal, iCardTwoVal;

    // Making enums of type Rank to hold playing card values
    Rank eHighCard, eFaceCard, eCardOne, eCardTwo;

    // Assigning values to above enums
    eHighCard = Rank.ace;
    eFaceCard = Rank.queen;
    eCardOne = Rank.two;
    eCardTwo = Rank.eight;

    // Assigning actual card values based on cards given to eCardOne and
    // eCardTwo
    iCardOneVal = eCardOne.ordinal() + 1;
    iCardTwoVal = eCardTwo.ordinal() + 1;

    // Outputting values of cards in relation to Blackjack
    System.out.println("A Blackjack hand: " + eHighCard + " and " + eFaceCard);
    System.out.println("");
    System.out.println("A two card hand: " + eCardOne + " and " + eCardTwo);

    // Calculates value of Blackjack hand based on card values
    System.out.println("Hand value: " + (iCardOneVal + iCardTwoVal));

  }

}
