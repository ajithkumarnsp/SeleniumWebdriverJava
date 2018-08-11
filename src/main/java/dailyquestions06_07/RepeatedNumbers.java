package dailyquestions06_07;

import java.util.Scanner;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scr.nextInt();
		System.out.println("Enter the Numbers");
		int[] numbers = new int[size];
		for(int i=0; i<size; i++)
		{
			numbers[i] = scr.nextInt();
		}
		int result = numbers[0];
	for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
					if(numbers[i] == numbers[j])
					{
						result = numbers[j];//5
						numbers[i] = result;
						
					}
					
				}
			System.out.println("The Repeated numbers are " + numbers[i]);
			}
	
		}
	
	}


