package week1.day2;

import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Numbers a");
		System.out.println("Enter the Numbers b");
		System.out.println("Enter the Numbers c");
		
		a = scr.nextInt();
		b = scr.nextInt();
		c = scr.nextInt();
		
		
			
	if((a>=b)&&(a>=c)	)
			
			{
		System.out.println("A is the largest number");
			}
	
	else
	{
		if(b>=c)
		{
			System.out.println("B is the largest number");
		}
		
		else
		{
			System.out.println("C is the largest number");
		}
	}

}
}
