package week1.day2;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int a = scr.nextInt();
		int b = scr.nextInt();
		int c = scr.nextInt();
		
	int result = (a > b && a > c ) ? a : (b > c) ? b : c ;
				System.out.println("The Greatest number is " + result);
	}

}
