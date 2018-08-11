package codechallenge02072018;

import java.util.Scanner;

public class SumOfMuliplesOfThreeAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scr.nextInt();
		
System.out.println("The sum of the Series is " + sumofmultiplies(number));
		
	}
	
	public static int sumofmultiplies(int number) {
		String result = "";
		int res = 0;
		for(int i = 1; i<= number; i++)
		{
			if(i%3 == 0 || i%5==0)
			{
				result = result + i + ",";
				res = res + i;
				
			}
		}
		System.out.println("The Series is " + result);
		return res;
		
	}

}
