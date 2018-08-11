package codechallenge02072018;

import java.util.Scanner;

public class NthFactiorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factorial();
	}

	public static int factorial()
	{
		int result = 1;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Factorial Number");
		int out = scr.nextInt();
		for (int i=1;i<=out;i++)
		{
			result = result * i;
			
		}
		
		System.out.println("The Factorial Value of the Numbers is " + result);
		return result;
	}
}
