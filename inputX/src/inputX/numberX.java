// Assignment : Project #1.2
// Name: Kunal Lanjewar
// Lecture: CSC 240 Tu 7:00pm to 9:40pm
/* Description: Write a program that prompts the user for a number X.  Print the numbers from 1 to X.  
  				However, in place of multiples of 4 print “ffff”.  In place of multiples of 7, print “seven”.  
  				If a number is divisible by both 4 and 7 print “ffffseven”.*/
package inputX;
import java.util.Scanner;

public class numberX 
{
	public static void main(String args[]) 
	{
		System.out.println("Enter a number from 1 to X: ");		//ask user for a number from 1 to X
		int X = new Scanner(System.in).nextInt();		//get input from user
		int i;
		
		for (i = 1; i<=X; i++) 		//to calculate and print result of number from 1 to X
		{
			System.out.println(i);
			
			if (i % 4 == 0)
			{
				System.out.println("ffff");
			}
			if (i % 7 == 0)
			{	
				System.out.println("seven");
			}

			if ((i % 4 == 0) && (i % 7 == 0))
			{
				System.out.println("ffffseven");
			}
		}
	}
}