package week1.day2;

import java.util.Scanner;

public class MultiplicationSecondTable {

	public static void main(String[] args) {  //1 X 9 = 9
		// TODO Auto-generated method stub    //2 X 9 = 18
		int i; 
		int j;
		int multiply;
		System.out.println("Enter the table which is to be executed");
		Scanner scr = new Scanner(System.in);
		i = scr.nextInt(); // i = 12
		System.out.println();
		System.out.println("The Multiplication Table");
		for(j=1;j<=10;j++)
		{
			multiply = j*i;// 1 X 12 = 12
			System.out.println(j + " * " + i + " = " + multiply); // 1 X 12 = 12
		}

	}

}
