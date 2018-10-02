package old;

/**
 * Test.java
 *
 * Code Description: Puts relevant information about the author to Strings and then outputs that on separate lines
 *    
 * @author Trevor Slabicki
 * @version 9-11-2018
 * @contact 1002089@palisadessd.org
 */

public class Info 
{
	
	private static final String NAME = "Name: Trevor Slabicki";
	private static final String BIRTHDAY = "Birthday: 12-24-2000";
	private static final String HOBBIES = "Hobbies: Video Games, Going Outside in the Winter, Messing Around on the Internet";
	private static final String FAVORITE_BOOK = "Favorite Book: The Maze Runner, by James Dashner";
	private static final String FAVORITE_MOVIE = "Favorite Movie: The Godfather";
	
	/**
	  * main method - Outputs relevant information from strings about the author on separate lines
	  * @param args
	  */
	
	public static void main(String[] args) 
	{
		
		System.out.println(NAME);
		System.out.println(BIRTHDAY);
		System.out.println(HOBBIES);
		System.out.println(FAVORITE_BOOK);
		System.out.println(FAVORITE_MOVIE);
		
	}
}
