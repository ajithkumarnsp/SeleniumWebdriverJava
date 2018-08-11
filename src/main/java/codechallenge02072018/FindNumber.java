package codechallenge02072018;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int number = scr.nextInt();
		System.out.println("Enter the Digit");
		int digit = scr.nextInt();
		
		System.out.println(findnumber(number, digit));
		
	}
	public static int findnumber(int number,int digit)
	{
		
		char cdigit = Integer.toString(digit).charAt(0);
	 for(int i = number; i>0; i-- )
	 {
		 if(Integer.toString(i).indexOf(cdigit) == -1)
		 {
			 return i;
		 }
	 }
return - 1;
	}
	
	

}
