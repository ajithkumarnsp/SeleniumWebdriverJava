package dailychallenges26;

import java.util.Scanner;

public class SumofArray {
	

public static int addition()
{

	int temp = 0; // Initializing a Variable with 0 as value to add with each array
	Scanner scr = new Scanner(System.in);// object is created to access the method to read the integer value from scanner class.
	System.out.println("Enter the array size");//To display to the user
	// Read the input from user and stores it in the variable called size.
	int size = scr.nextInt();
	//size of the array is stored
	int [] sizearray = new int[size];
	//To display to the user
	System.out.println("Enter the Numbers");
	//Reading input from user against the size of the array
	for(int i = 0; i<size; i++)
	{
		sizearray[i] = scr.nextInt();
	}
	//Funtion to add the array of numbers
	for (int i=0; i<size; i++)
	{
		
		temp = temp + sizearray[i]; //0 + 12(user input) temp = 12, 22(User input) temp = 12 + 22 = 34
	}
	return temp;
	//System.out.println("The Addition of array of Numbers are " + temp);
}
public static void main(String[] args) 
{
	
System.out.println("The Sum of array of numbers " + addition());
}
}
