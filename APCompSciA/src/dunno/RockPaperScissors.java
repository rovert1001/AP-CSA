package dunno;
import java.util.Scanner;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors
{
  
  private static int wins = 0;
  private static int losses = 0;
  private static int ties = 0;
  
  private static int count = 0;
  private static int prevCount = 0;
  
  private static HashMap<String, Integer> outcomes = new HashMap<String, Integer>();
  private static HashMap<Integer, String> choices = new HashMap<Integer, String>();
  
  private static String userInput;
  private static String cpInput;
  
  private static Scanner kb = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    
    init();
    
    System.out.println("Welcome to Rock Paper Scissors");
    System.out.println("Type H for Help");
    System.out.println();
    
    doRound();
    
    while (true) {
    
      while (prevCount == count) {
        
        ties++;
        
        System.out.println("The computer picked " + cpInput);
        System.out.println(userInput + " & " + cpInput + " == tie");
        
        prevCount = count;
        
        doRound();
        
      }
      
      while (prevCount < count) {
            
        wins++;
        
        System.out.println("The computer picked " + cpInput);
        System.out.println(userInput + " & " + cpInput + " == win for user");
        
        prevCount = count;
        
        doRound();
        
      }
      
      while (prevCount == count + 1) {
        
        losses++;
        
        System.out.println("The computer picked " + cpInput);
        System.out.println(userInput + " & " + cpInput + " == loss for user");
        
        prevCount = count;
        
        doRound();
        
      }

    }
    
    
  }
  
  private static void init() {
    
    outcomes.put("RockPaper", -1);
    outcomes.put("RockScissors", 1);
    outcomes.put("RockRock", 0);
    outcomes.put("PaperPaper", 0);
    outcomes.put("PaperScissors", -1);
    outcomes.put("PaperRock", 1);
    outcomes.put("ScissorsPaper", 1);
    outcomes.put("ScissorsScissors", 0);
    outcomes.put("ScissorsRock", -1);
    
    choices.put(0, "Rock");
    choices.put(1, "Paper");
    choices.put(2, "Scissors");
    
  }
  
  private static void help() {
    
    System.out.println("Type R for Rock");
    System.out.println("Type P for Paper");
    System.out.println("Type S for Scissors");
    System.out.println("Type Q for Quit");
    System.out.println("Type H for Help");
    
  }
  
  private static void doRound() {
    
    userInput = kb.nextLine();
    cpInput = choices.get(ThreadLocalRandom.current().nextInt(0, 3));
    
    count += outcomes.get(userInput + cpInput);
    
  }

}
