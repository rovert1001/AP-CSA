package dunno;

// *********************************************************
// Player.java
// Defines a Player class that holds information about an athlete.
// **********************************************************
import java.util.Scanner;

public class Player
{
  private String sName;
  private String sTeam;
  private int iJerseyNumber;

  // Prompts for and reads in the player's name, team, and jersey number.
  public void readPlayer()
  {
    Scanner kb = new Scanner(System.in);

    System.out.print("Name: ");
    sName = kb.nextLine();

    System.out.print("Team: ");
    sTeam = kb.nextLine();

    System.out.print("Jersey number: ");
    iJerseyNumber = kb.nextInt();

  }

  /**
   * equals - Compares iJerseyNumber and sTeam from two Player objects. If these
   * characteristics are the same, it is inferred that these players are eequal.
   * 
   * @param player
   *          a Player object to be compared to the object on which this method
   *          is called
   */
  public boolean equals(Player player)
  {

    return (this.iJerseyNumber == player.iJerseyNumber
        && this.sTeam.equals(player.sTeam)) ? true : false;

  }

}