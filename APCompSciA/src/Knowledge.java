import java.util.Scanner;
public class Knowledge {

	public static boolean isAnsered = false;
	static Scanner outputType = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Which output type do you want(a, b, or c)?");
		
		while (!isAnsered) {
			
			String enter = outputType.nextLine();
			
			switch (enter) {
			
			case "a":
				System.out.println("yo");
				break;
			
			}
			
		}
	}

}
