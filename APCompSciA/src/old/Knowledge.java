package old;


import java.util.Scanner;
public class Knowledge 
{
	
	static Scanner outputType = new Scanner(System.in);
	
	/**
	  * main method - Asks the user what option they want and takes their input, via the scanner object, and gives them their selection via a switch statement.
	  * @param args
	  */
	
	public static void main(String[] args) 
	{
		
		System.out.println("Which output type do you want(a, b, c, or all)?");
		
		while (true) 
		{
			
			String enter = outputType.nextLine();
			
			switch (enter.toUpperCase()) 
			{
			
			case "A":
				System.out.println("Knowledge is Power");
				break;
				
			case "B":
				System.out.println("Knowledge");
				System.out.println("   is");
				System.out.println("  Power");
				break;
				
			case "C":
				System.out.println("===========");
				System.out.println("|Knowledge|");
				System.out.println("|   is    |");
				System.out.println("|  Power  |");
				System.out.println("===========");
				break;
				
			case "ALL":
				System.out.println("Knowledge is Power");
				System.out.println("");
				System.out.println("Knowledge");
				System.out.println("   is");
				System.out.println("  Power");
				System.out.println("");
				System.out.println("===========");
				System.out.println("|Knowledge|");
				System.out.println("|   is    |");
				System.out.println("|  Power  |");
				System.out.println("===========");
				break;
				
			default:
				System.out.println("Answer not a, b, c, or all!!");
				System.out.println("");
				System.out.println("Please enter which output you want (a, b, c, or all).");
				break;
			
			}
			
		}
	}

}
