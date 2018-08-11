package week1.day2;

import java.util.Scanner;

public class LearningRelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1;
		int num2;
		
		System.out.println("Enter the Numbers a and b");
		Scanner scr = new Scanner(System.in);
		num1 = scr.nextInt();
		num2 = scr.nextInt();
		
		
	
		if(num1 > num2)
		{
			System.out.println("The largest number is " + num1);
		}
		else
			if(num1 < num2)
		{
			System.out.println("The largest number is " + num2);
		}
			else
			{
				System.out.println("Both the numbers " + (num1) + " & " + num2 + " are Equal ");
			}
	}

}
