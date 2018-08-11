package dailyquestions06_07;

import java.util.Scanner;

public class SwapTwoNumbersWithoutAdditionalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1;
		int number2;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		number1 = scr.nextInt();
		number2 = scr.nextInt();
		System.out.println("swap number1:- " + number1 + " & " + "swap number2:- " +  number2);
		swap(number1, number2);
	}

	public static void swap(int number1, int number2)
	{
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
System.out.println("The Swapped number1 is " + number1 + " & The Swapped number2 is " + number2 );
	}
	
}
