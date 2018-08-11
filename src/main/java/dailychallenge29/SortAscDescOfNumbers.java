package dailychallenge29;

import java.util.Scanner;

public class SortAscDescOfNumbers {

	public static void ascending()
	{
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		System.out.println("How many numbers to Sort");
		int size = scr.nextInt();
		int [] numbers = new int[size];
		System.out.println("Enter the Numbers to sort");
		for(int i=0; i<size; i++) //index is the array size
		{
			numbers[i] = scr.nextInt(); //The Read values from users are stored here like 22,23,24,25
		}
		//13,25,9,56,54,89,17 //6
	int temp;// 13
		for(int i = 0; i<size; i++)
		{
			for(int j = i+1; j<size; j++)
			{
			if(numbers[i] > numbers[j])
			{
				
					temp = numbers[i];//25
					numbers[i] = numbers[j]; //25 9
					numbers[j] = temp;	//
				}			
			}
			
		}
		System.out.print("Ascending Order of the Nummbers are:");
		
        for (int i = 0; i < size-1; i++) 
        {
            System.out.print(numbers[i] + ",");
        }
        System.out.print(numbers[size-1]);
        System.out.println();
        System.out.println();
	}

	public static void descending()
	{
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		System.out.println("How many numbers to Sort");
		int size = scr.nextInt();
		int [] numbers = new int[size];
		System.out.println("Enter the Numbers to sort");
		for(int i=0; i<size; i++) //index is the array size
		{
			numbers[i] = scr.nextInt(); //The Read values from users are stored here like 22,23,24,25
		}
		//13,25,9,56,54,89,17 //6
	int temp;// 13
		for(int i = 0; i<size; i++)
		{
			for(int j = i+1; j<size; j++)
			{
			if(numbers[i] < numbers[j])
			{
				
					temp = numbers[i];//25
					numbers[i] = numbers[j]; //25 9
					numbers[j] = temp;	//
				}			
			}
			
		}
		System.out.print("Descending Order of the numbers are:");
        for (int i = 0; i < size-1; i++) 
        {
            System.out.print(numbers[i] + ",");
        }
        System.out.print(numbers[size-1]);
	}


public static void main(String[] args) {
	
	ascending();
	descending();
}
}
