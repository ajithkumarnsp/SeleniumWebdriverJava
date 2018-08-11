package dailyquestions06_07;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = scr.nextInt();
		if((year % 400 == 0) || ((year % 4 ==0)) && (year % 100 !=0))
		{
			System.out.println("The year " +year + " is a leap year");
		}
		
		else
		{
			System.out.println("The year " +year + " is not a leap year ");
		}
		
	}

}
