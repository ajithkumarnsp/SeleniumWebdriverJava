package week1.day2;

import java.util.Scanner;

public class TestCaseSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int num1 = scr.nextInt();
		int num2= scr.nextInt();
		System.out.println("Enter any Character");
		Scanner m = new Scanner(System.in);
		String testcase = m.nextLine();
		switch(testcase)
		{
		case "Add":

			System.out.println("The Addition of 2 numbers are " + num1+num2);
			break;
		case "Subtract":
			System.out.println("The Subtraction of Two numbers are " + (num1-num2));
			break;
		case "Mutiply":
			System.out.println("The Multiplication of Two numbers are " + (num1*num2));
			break;
		case "Quotient":
			System.out.println("The Quotient of Two numbers are " + (num1/num2));
			break;
		default :
			System.out.println("The Reminder of Two numbers are " + (num1%num2));
		}
	}

}
