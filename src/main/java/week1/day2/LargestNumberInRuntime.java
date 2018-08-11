package week1.day2;

import java.util.Scanner;

public class LargestNumberInRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers should Enter");
		int index = in.nextInt();//index = 3//int[3]
		int numbers[]  = new int[index];// Array will be set here
		//To read the input from the user
		System.out.println("Enter the Numbers");
		//Reading the array of users values
		for(int i=0; i<index; i++) //index is the array size
		{
			numbers[i] = in.nextInt(); //The Read values from users are stored here like 22,23,24,25
		}
		int  temp = numbers[0]; // First number of array is stored here 22, 23
		for(int i=0; i<index; i++) // i= 0, i< = 3, i++
		{
			if(numbers[i] > temp) // numbers[0] = 22>22 , 23>22, 24>23
			{
				temp = numbers[i]; //Store value in temp as 23, 24
			}

		}
		System.out.println("The Largest Number is " + temp);

	}

}
