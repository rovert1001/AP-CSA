
// **************************************************************
// ComparePlayers
// Reads in two Player objects and tells whether they represent
// the same player.
// **************************************************************
import java.util.Scanner;

public class ComparePlayers
{
  public static void main(String[] args)
  {
    Player playerOne = new Player();
    Player playerTwo = new Player();

    // Prompt for and read in information for player 1
    System.out.println("Player 1 Information");
    playerOne.readPlayer();

    // Prompt for and read in information for player 2
    System.out.println("");
    System.out.println("Player 2 Information");
    playerTwo.readPlayer();

    // String holds weather are equal or not
    System.out.println("");

    // Compare playerOne to playerTwo and print a message saying
    // whether they are equal
    String areEqual = (playerOne.equals(playerTwo)) ? "the same."
        : "not the same.";
    System.out.println("The provided players are " + areEqual);

  }
}