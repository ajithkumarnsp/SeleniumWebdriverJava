package dailychallenges26;

import java.lang.reflect.Array;
import java.util.Scanner;


public class DailyChallende26_SecondLargestNumber {
	
public static void main(String[] args)
{
	int [] numbers = {3,2,1,4,5,2};
	int secondmin = secondlargestnumber(numbers);
	System.out.println("The Second Largest number is " + secondmin);
	
	
}

public static int secondlargestnumber(int[] numbers)
{
	int min = numbers[0];
	int max = numbers[5];
	
	for(int i = 0; i<numbers.length; i++)// 
	{
		if(numbers[i] < min)// 1st It 3 < 3, 2ndIt 2 < 3, 3rd It 
		{
		
		
			if(numbers[i] > max)
			{
				min = numbers[i];
			}
		}
	}

	return min;
	
}

	
}