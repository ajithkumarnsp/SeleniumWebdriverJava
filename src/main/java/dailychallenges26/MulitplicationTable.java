package dailychallenges26;

import java.util.Scanner;

public class MulitplicationTable {
	
	public static void  multiplication()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Multiplication table");
		int table = scr.nextInt();
		System.out.println("How many time to Multiply with the given number");
		int size = scr.nextInt();
		System.out.println();
		System.out.println("************The Result is ***********");
		int multiply;
		
		for (int i=1; i<=size; i++)
		{
			multiply = table*i;
			System.out.println(i + " * " + table + " = "+ multiply);
		}
		
	}

	public static void main(String[] args)
	{
		multiplication();
		
	}
	
}
