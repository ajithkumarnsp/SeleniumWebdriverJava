package codechallenge02072018;

import java.util.Scanner;

public class PercentageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scr.nextLine();
		int stringlength = input.length();
		String specialcharacters = "!@#$%^&*()_+{}[]<>?/|=~`.,";
		System.out.println("The Percentage of the Digits in a String is "+ percentagedigits(input, stringlength));
		System.out.println("The Percentage of the Uppercaseletters in a String is "+percentageuppercase(input, stringlength));
		System.out.println("The Percentage of the Lowercaseletters in a String is "+percentagelowercase(input, stringlength));
		System.out.println("The Percentage of the Space in a String is "+percentagecharacters(input, stringlength));
		System.out.println("The Percentage of the Specialcharacters in a String is "+percentagespecialcharacters(input, stringlength, specialcharacters));
	}
	
	public static float percentagedigits(String input, int stringlength )
	{
		float digitscount = 0;
		for(int i = 0; i <stringlength; i++ )
		{
			if(Character.isDigit(input.charAt(i)))
			{
				digitscount++;
			}
		}
		float perdigits = ((digitscount/stringlength)*100);
		return  perdigits;
		
	}
	
	public static float percentageuppercase(String input, int stringlength)
	{
		float uppercasecount = 0;
		for (int i=0; i< stringlength ; i++)
		{
			if(Character.isUpperCase(input.charAt(i)))
			{
				uppercasecount++;
			}
		}
		float peruppercase = ((uppercasecount/stringlength)*100);
		return peruppercase;
	}
	public static float percentagelowercase(String input, int stringlength)
	{
		float lowercasecount = 0;
		for (int i=0; i< stringlength ; i++)
		{
			if(Character.isLowerCase(input.charAt(i)))
			{
				lowercasecount++;
			}
		}
		float perlowercase = ((lowercasecount/stringlength)*100);
		return perlowercase;
		
	}


	public static float percentagecharacters(String input, int stringlength)
	{
		float charactercount = 0;
		for (int i=0; i< stringlength ; i++)
		{
			if(Character.isSpaceChar(input.charAt(i)))
			{
				charactercount++;
			}
		}
		float percharacter = ((charactercount/stringlength)*100);
		return percharacter;
		
	}
	public static float percentagespecialcharacters(String input, int stringlength, String Specialcharacters )
	{
		float specialcharactercount = 0;
		for (int i=0; i< stringlength ; i++)
		{
			if(Specialcharacters.contains(Character.toString(input.charAt(i))))
			{
				specialcharactercount++;
			}
		}
		float perspecialcharacter = ((specialcharactercount/stringlength)*100);
		return perspecialcharacter;
		
	}

}
